/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author oct10
 */
public class Program2DesktopPaneInternalFrames {
    JFrame frame;
    JDesktopPane dp;
    JInternalFrame jp1, jp2;
    
    public Program2DesktopPaneInternalFrames()
    {
        frame = new JFrame("Desktop pane and internal frame");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        
        dp = new JDesktopPane();
        frame.add(dp);
        
        jp1 = new JInternalFrame("iFrame 1",true, true, true, true);
        jp1.setSize(200,200);
        jp1.setVisible(true);
        jp1.setLayout(new FlowLayout());
        jp1.add(new JLabel("Internal Frame 1"));
       
        jp2 = new JInternalFrame("iFrame 2",true, true, true, true);
        jp2.setSize(200,200);
        jp2.setVisible(true);
        jp2.setLayout(new FlowLayout());
        jp2.add(new JLabel("Internal Frame 2"));
        
        dp.add(jp1);
        dp.add(jp2);

    }
    
    public static void main(String [] args)
    {
        new Program2DesktopPaneInternalFrames();
    }
}
