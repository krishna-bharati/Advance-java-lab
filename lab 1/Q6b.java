import javax.swing.*;
import java.awt.*;
public class Q6b {
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    public Q6b() {
        f = new JFrame("Broder Layout");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new BorderLayout());
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new Q6b();
    }
}