package Hoofdstuk4;

import java.awt.*;
import java.applet.*;


public class Opdracht7 extends Applet{public void init(){}
    public void paint(Graphics g){
        g.drawRoundRect(17, 17, 50, 50,10,10);
        g.fillOval(55, 55, 5, 5);
        g.fillOval(55, 25, 5, 5);
        g.fillOval(25, 25, 5, 5);
        g.fillOval(25, 55, 5, 5);
    }


}
