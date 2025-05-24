import javax.swing.*;
import java.awt.*;

public class QN2 {
    JFrame f;
    JLabel l1;
    JTextArea ta;
    JScrollPane sp;  
    
    public QN2() {  
        f = new JFrame("ScrollpaneEx"); 
        l1 = new JLabel("Feedback");
        ta = new JTextArea(10, 10);
        sp = new JScrollPane(ta);  
        
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setLayout(new FlowLayout());  
        f.add(l1);
        f.add(sp);
    }
    
    public static void main(String[] args) {  
        new QN2();
    }
}