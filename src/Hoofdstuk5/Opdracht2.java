package Hoofdstuk5;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
    int  J, H, V, base;
    public void init() {
        J = 120;
        H = 80;
        V = 40;
        base=220;

    }

        public void paint(Graphics g){
        g.drawLine(20, 20, 20, 220);
        g.drawLine(20, base, 140, base);
        g.drawString("0", 10, 220);
        g.drawString("20", 5, 180);
        g.drawString("40", 5, 140);
        g.drawString("60", 5, 100);
        g.drawString("80", 5, 60);
        g.drawString("100", 5, 20);
        g.setColor(Color.green);
        g.drawString("J", 40, 240);
        g.fillRect(35, base-(J*2), 20, J*2);
        g.setColor(Color.blue);
        g.drawString("H", 80, 240);
        g.fillRect(75,base-(H*2),20,H*2);
        g.setColor(Color.pink);
        g.drawString("V", 120, 240);
        g.fillRect(115, base-(V*2), 20, V*2);
    }


}