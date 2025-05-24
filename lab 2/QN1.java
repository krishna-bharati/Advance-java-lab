import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QN1 implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3,t4;
    JButton b1;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JComboBox<String> cb;
    JTextArea a;

    public QN1() {
        f = new JFrame("Student Registration Form");
        l1 = new JLabel("Student Name");
        l2 = new JLabel("Student address");
        l3 = new JLabel("Student email");
        l4 = new JLabel("Password");
        l5 = new JLabel("Gender");
        l6 = new JLabel("Hobbies");
        l7 = new JLabel("Country");
        b1 = new JButton("Submit");


        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4=new JTextField(10);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1 = new JCheckBox("Playing");
        c2 = new JCheckBox("Reading");
        c3 = new JCheckBox("Swimming");

        String[] address = { "Nepal","USA","Germany" };
        cb = new JComboBox<>(address);
        a = new JTextArea();
        b1.addActionListener(this);
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Positioning Components
        l1.setBounds(10, 10, 100, 20);
        t1.setBounds(120, 10, 150, 20);

        l2.setBounds(10, 40, 100, 20);
        t2.setBounds(120, 40, 150, 20);

        l3.setBounds(10, 70, 120, 20);
        t3.setBounds(120, 70, 150, 20);

        l4.setBounds(10, 100, 100, 20);
        t4.setBounds(120, 100, 150, 20);
        l5.setBounds(10, 130, 100, 20);
        r1.setBounds(120, 130, 80, 20);
        r2.setBounds(200, 130, 100, 20);


        l6.setBounds(10, 160, 100, 20);
        c1.setBounds(120, 160, 80, 20);
        c2.setBounds(200, 160, 80, 20);
        c3.setBounds(280, 160, 80, 20);

        l7.setBounds(10, 190, 100, 20);
        cb.setBounds(120, 190, 150, 20);

        b1.setBounds(150, 230, 100, 30);
        a.setBounds(420, 50, 300, 300);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);f.add(t4);
        f.add(l4); f.add(r1); f.add(r2);
        f.add(l5);
        f.add(l6); f.add(c1); f.add(c2); f.add(c3);
        f.add(l7); f.add(cb);
        f.add(b1);
        f.add(a);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String address = t2.getText();
        String email = t3.getText();
        String password = t4.getText();
        String gender = r1.isSelected() ? "Male" : "Female";
        String hobbies = "";
        if (c1.isSelected()) hobbies += "Playing ";
        if (c2.isSelected()) hobbies += "Reading ";
        if (c3.isSelected()) hobbies += "Swimming ";
        String country = (String) cb.getSelectedItem();




        a.setText(( "Name: " + name + "\nAddress: " + address + "\nEmail: " + email +
                "\nPassword: " + password + "\nGender: " +gender+ "\nHobbies: " + hobbies + "\nCountry: " + country));

    }

    public static void main(String[] args) {
        new QN1();
    }
}
