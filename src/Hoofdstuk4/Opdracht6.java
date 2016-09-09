package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {public void init(){setBackground(Color.blue);}
    public void paint(Graphics g){
        g.fillRoundRect(50, 50, 45, 150, 10, 10);
        g.fillRect(65, 50, 15, 200);
        g.setColor(Color.red);
        g.fillOval(58, 58, 30, 30);
        g.setColor(Color.yellow);
        g.fillOval(58, 108, 30, 30);
        g.setColor(Color.green);
        g.fillOval(58, 158, 30, 30);
    }
}