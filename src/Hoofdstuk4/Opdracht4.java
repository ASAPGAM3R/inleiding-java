package Hoofdstuk4;

import java.awt.*;
import java.applet.*;


public class Opdracht4 extends Applet  {public void init(){}
    public void paint(Graphics g){
        g.drawLine(20, 20, 20, 220);
        g.drawLine(20, 220, 140, 220);
        g.drawString("0", 10, 220);
        g.drawString("20", 5, 180);
        g.drawString("40", 5, 140);
        g.drawString("60", 5, 100);
        g.drawString("80", 5, 60);
        g.drawString("100", 5, 20);
        g.setColor(Color.green);
        g.drawString("J", 40, 240);
        g.fillRect(35, 20, 20, 200);
        g.setColor(Color.blue);
        g.drawString("H", 80, 240);
        g.fillRect(75,60,20,160);
        g.setColor(Color.pink);
        g.drawString("V", 120, 240);
        g.fillRect(115, 140, 20, 80);
    }


}