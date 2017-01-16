import javax.swing.*;
import java.awt.*;

public class MullerLyer
{

        public static void main(String[] args)
        {
                JFrame theGUI = new JFrame();
                theGUI.setTitle("GUI Program");
                theGUI.setSize(400,400);
                theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ColorPanel panel = new ColorPanel(Color.white);
                Container pane = theGUI.getContentPane();
                pane.add(panel);
                theGUI.setVisible(true);
        }
}
