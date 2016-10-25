package Hoofdstuk11;

import java.applet.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Opdracht9 extends Applet
{
    public void paint(Graphics g)
    {
        int x = 50;
        int y = 50;
        int width = 20;
        int height = 20;
        for (int j = 0; j<8; j++)
        {
            for (int i = 0; i < 8; i++ )
            {

                if ((j+i) %2 == 0)
                {
                    g.drawRect(x, y, width, height);
                }
                else
                {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                }
                x+= 20;

            }
            x = 50;
            y +=20;
        }

    }
}