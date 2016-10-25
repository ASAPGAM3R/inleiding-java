package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdracht5 extends Applet
{
    public void paint(Graphics g)
    {
        int i= 0;
        int x = 20;
        int y = 20;
        int width = 20;
        int	height = 20;
        while(i < 6)
        {
            g.setColor(Color.blue);
            g.fillRect(x, y, width, height);
            i++;
            x += 20;
            y += 20;
        }
    }
}