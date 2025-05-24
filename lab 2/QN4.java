
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author oct10
 */
public class QN4 {
    
    JFrame frame;
    JTextField tf;
    JPopupMenu pm;
    JMenuItem i1,i2,i3;
    
    
    public QN4()
    {
        frame = new JFrame("Program 4");
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(3);
        
        tf = new JTextField(50);
        tf.setToolTipText("Enter any text");
      
        
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Exit");
        
        pm = new JPopupMenu();
        pm.add(i1);
        pm.add(i2);
        pm.add(i3);
        
        
        
        frame.setLayout(new FlowLayout());
        frame.add(tf);
        
        frame.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(SwingUtilities.isRightMouseButton(e))
                {
                    pm.show(frame, e.getX(), e.getY());
                }
            }
        }
        );
    }
    
    public static void main(String [] args)
    {
        new QN4();
    }
    
}
