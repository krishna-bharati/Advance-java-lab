/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author oct10
 */
public class Program2JListEx {
    JFrame frame;
    JList list;
    JLabel lbl;
    
    public Program2JListEx()
    {
       frame = new JFrame("JList Ex");
       frame.setSize(400,400);
       frame.setDefaultCloseOperation(3);
       frame.setVisible(true);
       frame.setLayout(new FlowLayout());
       
       Color [] colors = new Color[]
       {
           Color.RED,
           Color.GREEN,
           Color.BLUE,
       };
       
       list = new JList(new String[]{"Red", "Green", "Blue"});
       
       frame.add(new JLabel("Select : "));
       frame.add(list);
       
       list.addListSelectionListener(new ListSelectionListener(){
           public void valueChanged(ListSelectionEvent e)
           {
               frame.getContentPane().setBackground(colors[list.getSelectedIndex()]);
           }
       });
    }
    
    public static void main(String[] args) {
       new Program2JListEx();
    }
}

