package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{ public void init(){}
    public void paint(Graphics g){
        g.drawLine(50, 120, 150, 120);
        g.drawLine(50, 120, 100, 50);
        g.drawLine(100, 50, 150, 120);
        g.drawRect(60,160,20,35);
        g.drawRect(50,120,100,75);
        g.drawRect(110,160,25,25);
    }
}