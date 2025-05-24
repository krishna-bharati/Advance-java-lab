import javax.swing.*;
import java.awt.*;

public class Q6e {
    JFrame f;
    JButton b1,b2,b3;
     public Q6e() {
         f = new JFrame("Card Layout");
         b1 = new JButton("1");
         b2 = new JButton("2");
         b3 = new JButton("3");
         f.setSize(400, 400);
         f.setVisible(true);
         f.setDefaultCloseOperation(3);
         CardLayout card = new CardLayout(20 ,20);
         f.setLayout(card);
         f.add("card1", b1);
         f.add("card2", b2);
         f.add("Card", b3);
         card.show(f.getContentPane(), "card2");
     }
     public static void main(String[] args) {
         new Q6e();


     }
}