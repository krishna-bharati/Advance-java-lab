import javax.swing.*;
import java.awt.*;

public class Q6box {
    JFrame f;
    JButton b1,b2,b3,b4;

    public Q6box() {
        f = new JFrame("Box Layout");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        f.setSize(300,300);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
        Container c = f.getContentPane();
        BoxLayout box = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(box);
        c.add(b1);c.add(b2);c.add(b3);c.add(b4);

    }
    public static void main(String[] args) {
        new Q6box();
    }
}