package Hoofdstuk13;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht2 extends Applet
{
    public void init()
    {
    }
    public void paint(Graphics g)
    {
        tekendriehoek(g,50,200,150,200,100,120);
    }
    void tekendriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3)
    {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3, y3, x1, y1);
    }
}