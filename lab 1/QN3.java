

import javax.swing.*;
import java.awt.event.*;

public class QN3{
      JFrame f;
    JLabel l1,l2,l3;
    JButton b1;
    JTextField t1,t2;
    
    public QN3(){
        f = new JFrame("Area and Perimeter");
        l1 = new JLabel("Length");
        l2 = new JLabel("Breath");
        l3 = new JLabel();
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        b1 = new JButton("Area");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20,50,100,20);
        t1.setBounds(150,50,100,20);
        
        l2.setBounds(20 ,100,100,20);
        t2.setBounds(150,100,100,20);
        
         b1.setBounds(150,200,80,20);
         l3.setBounds(150,250,100,20);
         
         f.add(l1);f.add(l2);f.add(l3);
        f.add(t1);f.add(t2);
        f.add(b1);
    
    
        b1.addMouseListener(new MouseAdapter() {  
         @Override
         public void mousePressed(MouseEvent e) {
             
                  float num1 = Float.parseFloat(t1.getText());
                  float num2 = Float.parseFloat(t2.getText());
                  
                  float area = num1 * num2;
                  l3.setText("Area="+ area);
                  
         }
         @Override
               public void mouseReleased(MouseEvent e) {
                   // add 
                  float num1 = Float.parseFloat(t1.getText());
                  float num2 = Float.parseFloat(t2.getText());
                  
                  float pr = 2*(num1+num2);
                  l3.setText("Perimeter=" + pr);
                  
              }
        
        });
}
         
     public static void main(String[] ags){
        new QN3();
    }
}
