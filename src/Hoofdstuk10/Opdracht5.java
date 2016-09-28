package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht5 extends Applet
{
    double newc, gem, gemc, cijfer;
    Button new1;
    Button reset;
    TextField vak1;
    public void init()
    {
        setSize(300,300);
        vak1 = new TextField("",10);
        reset = new Button("Ce");
        gem = 0;
        newc = 0;
        cijfer = 0;
        Listen1 nb = new Listen1();
        Listen2 re = new Listen2();
        new1 = new Button("voeg cijfer toe");
        new1.addActionListener(nb);
        reset.addActionListener(re);
        add(new1);
        add(vak1);
        add(reset);
    }
    public void paint(Graphics g)
    {
        if (gemc>5.4 && gemc<10.1)
        {
            g.drawString("U bent geslaagd", 100, 200);
        }
        if (gemc>10.1)
        {
            g.drawString("ERROR: vul correcte cijfers in", 100, 200);
        }
        else if (gemc < 5.5)
        {
            g.drawString("U bent gezakt", 100, 200);
        }

        g.drawString("uw gemiddelde is: "+(String.format("%.2f", Double.valueOf(gemc))), 100, 180);
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            newc = Double.parseDouble(vak1.getText());
            gem++;
            cijfer = cijfer + newc;
            gemc = cijfer/gem;
            repaint();
        }
    }
    class Listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            gem = 0;
            cijfer =0;
            gemc =0;
            newc = 0;
            repaint();
        }
    }
}