/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oct10
 */
public class Program2 {
   JFrame frame;
   JLabel id, password, action;
   JTextField tid, actiont;
   JPasswordField pass;
   JButton ok, cancel;
   
   
   public Program2()
   {
       frame = new JFrame("Login");
       frame.setDefaultCloseOperation(3);
       frame.setSize(400,400);
       frame.setVisible(true);
      
       id = new JLabel("ID : ");
       password = new JLabel("Password : ");
       tid = new JTextField();
       pass = new JPasswordField();
       
       ok = new JButton("OK");
       cancel = new JButton("Cancel");
       
       action = new JLabel("Key : ");
       actiont = new JTextField();
       
       frame.setLayout(new GridLayout(4,2));
       frame.add(id);
       frame.add(tid);
       frame.add(password);
       frame.add(pass);
       frame.add(ok);
       frame.add(cancel);
       frame.add(action);
       frame.add(actiont);
       
       ok.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
                try {
                        if(checkUser(Integer.parseInt(tid.getText()), pass.getText()))
                        {
                            JOptionPane.showMessageDialog(null, "Logged In ! Welcome User");
                        }else{
                           JOptionPane.showMessageDialog(null, "Failed to Login !");

                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Failed to Login !");
                    }
           }
       });
       
       actiont.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e)
           {
                char keyChar = e.getKeyChar();

                if (keyChar == 'l' || keyChar == 'L') {
                    try {
                        if(checkUser(Integer.parseInt(tid.getText()), pass.getText()))
                        {
                            JOptionPane.showMessageDialog(null, "Logged In ! Welcome User");
                        }else{
                           JOptionPane.showMessageDialog(null, "Failed to Login !");

                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Failed to Login !");
                    }
                } else if (keyChar == 'c' || keyChar == 'C') {
                    tid.setText("");
                    pass.setText("");
                    tid.requestFocus();
                }
           }
       });
   }
   
   public static boolean checkUser(int id, String password) throws Exception
   {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String mode = "";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rrbca", "root", "");
        
        Statement st = con.createStatement();
        String query = "SELECT * from account where uid="+id+" and password='"+password+"'";
        ResultSet rows = st.executeQuery(query);
        
        if(rows.next())
        {
            return true;
        }else{
            return false;
        }
   } 
   
   
   public static void main(String [] args)
   {
       new Program2();
   }
}
