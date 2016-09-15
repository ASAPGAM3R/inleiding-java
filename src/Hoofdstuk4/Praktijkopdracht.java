package Hoofdstuk4;

import java.awt.*;
import java.applet.*;


public class Praktijkopdracht extends Applet {public void init(){}

    public void paint(Graphics g){
        g.drawLine(20, 10, 50, 10);
        g.drawString("lijn", 25, 25);
        g.drawRect(20, 30, 100, 50);
        g.drawString("rechthoek", 30, 100);
        g.setColor(Color.magenta);
        g.fillArc(240, 30, 100, 50, 0, 45);
        g.fillOval(130, 120, 100, 50);
        g.fillRect(130, 30, 100, 50);
        g.setColor(Color.black);
        g.drawOval(130, 30, 100, 50);
        g.drawString("met ovaal", 130, 100);
        g.drawOval(240, 30, 100, 50);
        g.drawString("punt met ovaal", 240, 100);
        g.drawRoundRect(20, 120, 100, 50, 30, 30);
        g.drawString("ronde randen", 30, 190);
        g.drawString("gevulde ovaal", 130, 190);
        g.drawOval(265, 120, 50, 50);
        g.drawString("cirkel", 270, 190);

    }


}