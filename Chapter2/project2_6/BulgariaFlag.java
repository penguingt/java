import javax.swing.*;
import java.awt.*;

public class BulgariaFlag
{
        public static void main(String [] args)
        {
                JFrame theGUI = new JFrame();
                theGUI.setTitle("Mauritius Flag");
                theGUI.setSize(300,200);
                theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel1 = new JPanel();
                panel1.setBackground(Color.green);
                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.red);
                JPanel panel3 = new JPanel();
                panel3.setBackground(Color.white);
                Container pane = theGUI.getContentPane();
                pane.setLayout(new GridLayout(3,1));
                pane.add(panel1);
                pane.add(panel2);
                pane.add(panel3);
                theGUI.setVisible(true);
        }
}

