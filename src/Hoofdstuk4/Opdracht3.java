package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet{ public void init(){setBackground(Color.lightGray);}
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(100,70,90,25);
        g.fillRect(100,70,90,25);
        g.setColor(Color.white);
        g.drawRect(100,95,90,25);
        g.fillRect(100,95,90,25);
        g.setColor(Color.blue);
        g.drawRect(100,120,90,25);
        g.fillRect(100,120,90,25);
        g.setColor(Color.black);
        g.drawRect(95,70,5,120);
        g.fillRect(95,70,5,120);

    }


}