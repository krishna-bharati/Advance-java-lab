/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author oct10
 */
public class Program2Color_FileChooser {
    JFrame frame;
    JButton colorchooser, filechooser;
    
    public Program2Color_FileChooser()
    {
        frame = new JFrame("Color and File Chooser : ");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        
        colorchooser = new JButton("JColorChooser");
        filechooser = new JButton("JFileChooser");
        
        frame.setLayout(new FlowLayout());
        frame.add(colorchooser);
        frame.add(filechooser);
        
        colorchooser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Color c = JColorChooser.showDialog(frame, "Choose a color", Color.yellow); 
                JOptionPane.showMessageDialog(frame, "You choosed R: "+c.getRed()+", B: "+c.getBlue()+", G: "+c.getGreen());
            }
        }     
        );
        
        filechooser.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser f = new JFileChooser();
                f.showOpenDialog(frame);
            }
        }     
        );
    }
    public static void main(String [] args)
    {
        new Program2Color_FileChooser();
    }
}
