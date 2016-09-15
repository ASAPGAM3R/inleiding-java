package Hoofdstuk6;

import java.awt.*;
import java.applet.*;



public class Opdracht2 extends Applet
{
    int tijd;
    int uur;
    int dag;
    int jaar;
    public void init()
    {
        tijd=60;
        uur=60;
        dag=24;
        jaar=365;
    }
    public void paint(Graphics g)
    {
        g.drawString("in een uur zitten " +tijd*uur+" seconden", 20, 20);
        g.drawString("in een dag zitten "+tijd*uur*dag+" seconden", 20, 40);
        g.drawString("in een jaar zitten "+tijd*uur*dag*jaar+" seconden", 20, 60);
    }

}