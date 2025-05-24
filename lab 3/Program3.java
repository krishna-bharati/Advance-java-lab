package Lab3;
import java.awt.*;
import javax.swing.*;

public class Program3 extends Canvas {
    JFrame frame;
    
    public Program3() {
        frame = new JFrame("Draw Shapes");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
    }
    
    public void paint(Graphics g) {
        g.drawLine(50, 50, 150, 50); 
        g.drawRect(60, 70, 100, 50);
        g.fillRect(180, 70, 100, 50); 
    
        g.drawOval(50, 150, 40, 40); 
        g.fillOval(90, 200, 40, 40); 
        
        g.fillOval(200, 260, 40, 80); 
        g.drawOval(250, 240, 40, 80); 
      
        

    int[] x = {250, 285, 285, 250, 215, 215}; 
    int[] y = {120, 145, 195, 220, 195, 145};
    
    int[] x2 = {200, 235, 235, 200, 165, 165}; 
    int[] y2 = {120, 145, 195, 220, 195, 145};

        
        g.drawPolygon(x, y, 6);
        g.fillPolygon(x2, y2, 6);
    }
    
    public static void main(String[] args) {
        new Program3();
    }
}
