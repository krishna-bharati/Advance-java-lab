import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QN5 {
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2,b3;
    public QN5(){
        f = new JFrame("Q5");
        l1 = new JLabel("Input a string:");
        t1= new JTextField(30);
        b1 = new JButton("Check Palindrome");
        b2 = new JButton("Get Reversed String");
        b3 = new JButton("Get vowels");
        l2 = new JLabel("");
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l2);


        l1.setBounds(10, 10, 100, 20);
        t1.setBounds(120, 10, 400, 20);
        b1.setBounds(10, 40, 150, 20);
        b2.setBounds(210, 40, 150, 20);
        b3.setBounds(410, 40, 150, 20);
        l2.setBounds(120, 60, 200, 20);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ss = t1.getText();
                boolean isPalindrome = false;
                for (int i = 0; i<ss.length(); i++) {
                    if (ss.charAt(i) == ss.charAt((ss.length()-1)-i)) {
                        isPalindrome = true;
                    }
                    if (isPalindrome) {
                        l2.setText("The string is palindrome.");
                    }
                    else {
                        l2.setText("The string is not palindrome.");
                    }
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ss = t1.getText();
                String reversed = "";
                for (int i = ss.length(); i >0; i--) {
                    reversed += ss.charAt(i-1);
                }
                l2.setText("Reversed string: "+reversed);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ss = t1.getText();
                String vowels = "aeiouAEIOU";
                String vowel = "";
                for (int i = 0; i < ss.length(); i++) {
                    for (int j = 0; j < vowels.length(); j++) {
                        if(ss.charAt(i)==vowels.charAt(j)) {
                            vowel+=ss.charAt(i);
                        }
                    }

                }
                l2.setText("Vowels in string: "+vowel);
            }});
    }
    public static void main(String[] args) {
        new QN5();
    }
}