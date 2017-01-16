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
                int x = getWidth() / 2 -60;
                int y = getHeight() /2;
                g.setColor(Color.black);
                Font font = new Font("Arial", Font.ITALIC, 14);
                g.setFont(font);
                g.drawString((x+10) +", " + (y+15) , x+10 , y + 15);
        }

}
