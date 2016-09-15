package Hoofdstuk5;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    public void init(){
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte = 50;}

    public void paint(Graphics g){
        g.drawLine(20, 10, 50, 10);
        g.drawString("lijn", 25, 25);
        g.drawRect(20, 30, breedte, hoogte);
        g.drawString("rechthoek", 30, 100);
        g.setColor(opvulkleur);
        g.fillArc(240, 30, breedte, hoogte, 0, 45);
        g.fillOval(130, 120, breedte, hoogte);
        g.fillRect(130, 30, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(130, 30, breedte, hoogte);
        g.drawString("met ovaal", 130, 100);
        g.drawOval(240, 30, breedte, hoogte);
        g.drawString("punt met ovaal", 240, 100);
        g.drawRoundRect(20, 120, breedte, hoogte, 30, 30);
        g.drawString("ronde randen", 30, 190);
        g.drawString("gevulde ovaal", 130, 190);
        g.drawOval(265, 120, 50, 50);
        g.drawString("cirkel", 270, 190);
    }
}