/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author oct10
 */
public class Program2TableEx {
   public static void main(String [] args)
    {
        JFrame frame = new JFrame("JTableEx");
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        
        String [][] data = new String[][]{
            {"Alen", "Lamjung"},
            {"Nirpesh", "Parbat"},
            {"Anjali", "Bhaktapur"},
            {"Anurodh", "Nuwakot"},
        };
        
        String [] head = new String []{
           "Name", "Address"
        };
        
        JTable table = new JTable(data, head);
        JScrollPane jp = new JScrollPane(table);
        jp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(jp);
    }
}
