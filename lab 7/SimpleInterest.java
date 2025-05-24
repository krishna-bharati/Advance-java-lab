package lab.pkg7;


import lab.pkg7.MyTextField;
import lab.pkg7.MyLabel;
import lab.pkg7.MyFrame;
import lab.pkg7.MyButton;
import java.awt.FlowLayout;
import java.awt.event.*;

public class SimpleInterest {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Simple Interest Calculator");

        MyLabel l1 = new MyLabel();
        l1.setText("Principal:");

        MyTextField t1 = new MyTextField(30);

        MyLabel l2 = new MyLabel();
        l2.setText("Rate :");

        MyTextField t2 = new MyTextField(30);

        MyLabel l3 = new MyLabel();
        l3.setText("Time :");

        MyTextField t3 = new MyTextField(30);

        MyButton calcBtn = new MyButton();
        calcBtn.setText("Calculate");

        MyTextField t4 = new MyTextField(30);
        
        f.setSize(400, 300);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(calcBtn);
        f.add(t4);

        calcBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                double t = Double.parseDouble(t3.getText());
                double si = (p * r * t) / 100;
                t4.setText(String.valueOf("Simple Interest: "+si));
            }
        });
    }
}
