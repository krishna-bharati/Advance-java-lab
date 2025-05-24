package lab2;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class sliderwithvaluepassifslide {
    JFrame f;
    JSlider slider;
    JLabel l1;

    public sliderwithvaluepassifslide() {
        f = new JFrame("slider");
        l1 = new JLabel("Age: 50"); // Initial value
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Add ChangeListener to the slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                l1.setText("Age: " + value); // Update label text with current value
            }
        });

        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(l1);
        f.add(slider);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new sliderwithvaluepassifslide();
            }
        });
    }
}