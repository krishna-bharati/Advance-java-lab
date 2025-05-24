
import javax.swing.*;
import java.awt.event.*;
public class QN1 implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3;
    JButton b1,b2;
    JTextField t1,t2,t3;
    
    public QN1(){
        f = new JFrame("Add and Sub");
        l1 = new JLabel("num1");
        l2 = new JLabel("num2");
        l3 = new JLabel("result");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t3 = new JTextField(25);
        b1 = new JButton("add");
        b2 = new JButton("sub");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
         
        l1.setBounds(20,50,100,20);
        t1.setBounds(150,50,100,20);
        l2.setBounds(20 ,100,100,20);
        t2.setBounds(150,100,100,20);
        
        b1.setBounds(150,150,80,20);
        b2.setBounds(250,150,80,20);
        l3.setBounds(20,200,100,20);
        t3.setBounds(150,200,100,20);
        
        
        f.add(l1);f.add(l2);f.add(l3);
        f.add(t1);f.add(t2);f.add(t3);
        f.add(b1);f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
       
    }
    @Override
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "add"){
            
            int num1 = Integer.parseInt(t1.getText());
            int num2  = Integer.parseInt(t2.getText());
            
            int sum = num1+num2;
            t3.setText("" +sum);
            l3.setText("add");
        } 
            else  if(e.getActionCommand() == "sub"){
    
            int num1 = Integer.parseInt(t1.getText());
            int num2  = Integer.parseInt(t2.getText());
            
            int sum = num1-num2;
            t3.setText("" +sum);
            l3.setText("sub");
        }
             
          
        }
            
    public static void main(String [] args){
        new QN1();
    }
}
