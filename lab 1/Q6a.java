import javax.swing.*;
import java.awt.*;

public class Q6a {
    JFrame f;

    JButton b1,b2,b3;
    public Q6a() {
        f = new JFrame("flow layout");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);
        f.add(b3);

    }
    public static void main(String[] args) {
        new Q6a();
    }
}