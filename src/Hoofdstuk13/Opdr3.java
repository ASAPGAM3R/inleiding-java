package Hoofdstuk13;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdr3 extends Applet
{
    int x = 0;
    int y = 0;
    int width = 40;
    int voeg = 4;
    int height = 20;
    public void init(){}
    public void paint(Graphics g)
    {
        for(int a=0; a <15; a++)

        {
            for(int b=0; b <15; b++)
            {
                if ((a+b) %2 != 0)
                {
                    g.fillRect(x, y, width, height);
                }
                else
                {
                    g.fillRect(x, y, width, height);
                    x +=44;
                    y +=24;
                }
                baksteen (g, a * (width + voeg), b * (height + voeg));
            }
        }
    }
    void baksteen (Graphics g, int x, int y)
    {
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
}