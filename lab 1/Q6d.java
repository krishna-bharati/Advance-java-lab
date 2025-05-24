import javax.swing.*;
import java.awt.*;

public class Q6d {
    JFrame f;
    JButton b1,b2,b3;
    public Q6d() {
        f = new JFrame("GridBox Layout");
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        f.setDefaultCloseOperation(3);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10,10,10,10);
        f.add(b1,c);
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10,10,10,10);
        f.add(b2,c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        f.add(b3,c);

    }
    public static void main(String[] args) {
        new Q6d();
    }
}