package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet{ public void init(){setBackground(Color.blue);}
    public void paint(Graphics g){
        g.drawOval(20, 20, 120, 80);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 120, 80, 90, 45);
    }

}