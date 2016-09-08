package Hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 120, 150, 120);
        g.drawLine(50, 120, 100, 50);
        g.drawLine(100, 50, 150, 120);
    }
}
