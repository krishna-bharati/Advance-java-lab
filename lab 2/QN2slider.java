

import javax.swing.*;
import java.awt.*;

public class QN2slider {
    JFrame  f;
    JSlider slider;
    JLabel l1;
    public QN2slider() {
        f = new JFrame("slider");
        l1=new JLabel("age");
        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(3);
        f.add(l1);f.add(slider);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new QN2slider();
    }
}
