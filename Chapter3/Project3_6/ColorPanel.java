import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel
{
        public ColorPanel(Color backColor)
        {
                setBackground(backColor);
        }

        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
                g.setColor(Color.black);
                g.drawLine(100,90,200,90);
		g.drawLine(100,100,200,100);
		g.drawLine(100,90,110,85);
		g.drawLine(100,90,110,95);
		g.drawLine(200,90,190,85);
		g.drawLine(200,90,190,95);
		g.drawLine(100,100,90,95);
		g.drawLine(100,100,90, 105);
		g.drawLine(200,100, 210,95);
		g.drawLine(200,100, 210,105);
        }
}
