/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;

/**
 *
 * @author oct10
 */
public class Program4 extends Canvas {
    public static void main(String [] args) throws Exception
    {
        JFrame frame = new JFrame("ID Card");
        Canvas cv = new Program4();
        Container c = frame.getContentPane();
        frame.setLayout(new GridLayout(2,1));
        cv.setSize(400,400);
        frame.add(cv);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        panel.setLayout(new GridLayout(5,1));
        
        Font f = new Font(Font.MONOSPACED, Font.BOLD, 30);
        JLabel id = new JLabel("ID Card");
        JLabel name = new JLabel("Name : Alen Pariyar");
        JLabel address = new JLabel("Address : Lamjung");
        JLabel semester = new JLabel("Semester : Sixth");
        JLabel phone = new JLabel("Phone : 9816699413");
        id.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 32));
        
        name.setFont(f);
        address.setFont(f);
        semester.setFont(f);
        phone.setFont(f);
        panel.add(id);
        panel.add(name);
        panel.add(address);
        panel.add(semester);
        panel.add(phone);
    }
    
    @Override
    public void paint(Graphics g)
    {
        BufferedImage img;
        try {
            img = ImageIO.read(getClass().getResource("alenpariyar.jpg"));
            g.drawImage(img, 0, 0, this);

        } catch (IOException ex) {
            Logger.getLogger(Program4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
