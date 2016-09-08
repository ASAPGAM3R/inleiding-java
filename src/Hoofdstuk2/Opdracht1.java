package Hoofdstuk2;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    public void init() { setBackground(Color.blue); }

    public void paint (Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Ray",20,20);
    }
}

