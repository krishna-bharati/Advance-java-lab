/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program3 {

    JFrame frame;
    JLabel[] labels;
    JPanel panel, panel2;
    JRadioButton male, female;
    JCheckBox football, code, swimming;
    JComboBox country;
    JTextField tid, tname, temail, tlocaladdress;
    JButton submit, dialog;
    ButtonGroup group;

    public Program3() throws Exception {
        labels = new JLabel[]{
            new JLabel("ID"),
            new JLabel("Name"),
            new JLabel("Email"),
            new JLabel("Gender"),
            new JLabel("Hobbies"),
            new JLabel("Country"),
            new JLabel("Local Address"),};

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        panel.add(male);
        panel.add(female);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        football = new JCheckBox("Football");
        code = new JCheckBox("Code");
        swimming = new JCheckBox("Swimming");
        panel2.add(football);
        panel2.add(code);
        panel2.add(swimming);

        country = new JComboBox(new String[]{
            "Nepal", "India", "China"
        });

        submit = new JButton("Submit");
        dialog = new JButton("Dialog");

        group = new ButtonGroup();

        group.add(male);
        group.add(female);

        tid = new JTextField();
        tname = new JTextField();
        temail = new JTextField();

        tlocaladdress = new JTextField();

        frame = new JFrame("Signup Form");
        frame.setLayout(new GridLayout(8, 2));
        frame.setVisible(true);
        frame.setSize(500, 500);

        frame.add(labels[0]);
        frame.add(tid);
        frame.add(labels[1]);
        frame.add(tname);
        frame.add(labels[2]);
        frame.add(temail);
        frame.add(labels[3]);
        frame.add(panel);
        frame.add(labels[4]);
        frame.add(panel2);
        frame.add(labels[5]);
        frame.add(country);
        frame.add(labels[6]);
        frame.add(tlocaladdress);
        frame.add(submit);
        frame.add(dialog);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rrbca", "root", "");

        dialog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputId = JOptionPane.showInputDialog(frame, "Enter User ID:");

                    if (inputId != null && !inputId.trim().isEmpty()) {
                        int userId = Integer.parseInt(inputId.trim());

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/rrbca", "root", "");
                        String query = "SELECT * FROM person WHERE id = " + userId;
                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery(query);

                        if (rs.next()) {
                            String name = rs.getString("name");
                            String email = rs.getString("email");
                            String gender = rs.getString("gender");
                            String hobbies = rs.getString("hobbies");
                            String country = rs.getString("country");
                            String localAddress = rs.getString("localaddress");

                            String message = "User ID: " + userId
                                    + "\nName: " + name
                                    + "\nEmail: " + email
                                    + "\nGender: " + gender
                                    + "\nHobbies: " + hobbies
                                    + "\nCountry: " + country
                                    + "\nLocal Address: " + localAddress;

                            JOptionPane.showMessageDialog(frame, message, "User Information", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(frame, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        rs.close();
                        st.close();
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid ID. Please enter a valid numeric ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid ID format. Please enter a valid numeric ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Database error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(tid.getText());
                    String name = tname.getText();
                    String email = temail.getText();
                    String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");

                    String hobbies = "";
                    if (football.isSelected()) {
                        hobbies += "Football ";
                    }
                    if (code.isSelected()) {
                        hobbies += "Code ";
                    }
                    if (swimming.isSelected()) {
                        hobbies += "Swimming ";
                    }
                    hobbies = hobbies.trim();

                    String selectedCountry = (String) country.getSelectedItem();
                    String localAddress = tlocaladdress.getText();

                    String query = "INSERT INTO `person`(`id`, `name`, `email`, `gender`, `hobbies`, `country`, `localaddress`) "
                            + "VALUES ('" + id + "', '" + name + "', '" + email + "', '" + gender + "', '" + hobbies + "', '" + selectedCountry + "', '" + localAddress + "')";

                    Statement stm = con.createStatement();

                    int row = stm.executeUpdate(query);

                    JOptionPane.showMessageDialog(null,
                            "ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nGender: " + gender
                            + "\nHobbies: " + hobbies + "\nCountry: " + selectedCountry + "\nLocal Address: " + localAddress);
             

                    stm.close();
                    con.close();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid numeric ID.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error Occured");
                }
            }
        });

    }

    public static void main(String[] args) throws Exception {
        new Program3();
    }

}
