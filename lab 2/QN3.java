
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class QN3 implements ActionListener {
    
    JFrame frame;
    JMenuBar menubar;
    JMenu options;
    JMenuItem newb, openb, closeb;
    
    public QN3() {
        frame = new JFrame("MenuBarEx");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(3); 

        menubar = new JMenuBar();

        options = new JMenu("Options");
        
        newb = new JMenuItem("New");
        openb = new JMenuItem("Open");
        closeb = new JMenuItem("Close");
        
        newb.setMnemonic(KeyEvent.VK_N);
        openb.setMnemonic(KeyEvent.VK_O);
        closeb.setMnemonic(KeyEvent.VK_C);
        
        newb.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        openb.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        closeb.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));

        newb.addActionListener(this);
        openb.addActionListener(this);
        closeb.addActionListener(this);
        
        options.add(newb);
        options.add(openb);
        options.add(closeb);

        menubar.add(options);
        frame.setJMenuBar(menubar);
        
        frame.setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand().toString();
        
        if(cmd.equals("New"))
        {
            JOptionPane.showMessageDialog(frame, "New clicked");
        }else if(cmd.equals("Open"))
        {
           JOptionPane.showMessageDialog(frame, "Open clicked");
        }else if(cmd.equals("Close"))
        {
           JOptionPane.showMessageDialog(frame, "Close clicked");
        }else{
           JOptionPane.showMessageDialog(frame, "Invalid button clicked");    
        }
    }
    
    public static void main(String[] args) {
        new QN3();
    }
}
