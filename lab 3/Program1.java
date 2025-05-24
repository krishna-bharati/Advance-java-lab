/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author oct10
 */
public class Program1 {
    public static void main(String [] args)
    {
        double p = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Principle : "));
        double t = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Time : "));
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Rate : "));
        
        double simpleInterest = (p*t*r)/100;
        
        JOptionPane.showMessageDialog(null, "Simple Interest : Rs."+simpleInterest);
        
    }
}
