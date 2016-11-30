package Hoofdstuk13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4 extends Applet
{
    int steensoort;
    public void init()
    {
        setSize(600,600);
        steensoort=1;
        Button knop1 = new Button("baksteen");
        Button knop2 = new Button("beton");
        Listen1 l1 = new Listen1();
        Listen2 l2 = new Listen2();
        knop1.addActionListener(l1);
        knop2.addActionListener(l2);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g)
    {
        if(steensoort==0)
        {
            for(int teller=0; teller <10; teller++)
            {
                for(int teller1=0; teller1<10; teller1++)
                {
                    tekensteen(g, teller*22+10*(teller1%2),(teller1+5)*12);
                }
            }
        }
        else if(steensoort==1)
        {
            for(int teller=0; teller <10; teller++)
            {
                for(int teller1=0; teller1<10; teller1++)
                {
                    tekenbeton(g, teller*42+20*(teller1%2),(teller1+5)*22);
                }
            }
        }
    }
    public class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            steensoort=0;
            repaint();
        }

    }
    public class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            steensoort=1;
            repaint();
        }
    }
    void tekensteen (Graphics g, int x1, int y1)
    {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20,10);
    }
    void tekenbeton (Graphics g, int x1, int y1)
    {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 40,20);
    }
}