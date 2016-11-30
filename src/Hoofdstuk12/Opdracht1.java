package Hoofdstuk12;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet
{

    int[] nummers = {5, 7, 10, 14, 8, 17, 30, 1, 53, 70};

    public void init()
    {
        setSize(275, 200);
    }

    public void paint(Graphics g)
    {
        int x = getWidth();
        int y = getHeight();
        double gem = 0.0;

        for (int i = 0; i < nummers.length; i++)
        {
            g.drawString(""+ nummers[i], x/2, (y/2-15*nummers.length/2)+15*i);
            gem += nummers[i];
        }
        gem /= nummers.length;
        g.drawString("Het gemiddelde is "+ gem, x/2-50, (y/2+15*nummers.length/2)+10);
    }

}