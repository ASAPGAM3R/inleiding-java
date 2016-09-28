package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht4 extends Applet
{
    TextField vak1;
    TextField vak2;
    Label label;
    String text,s,dagen, jaars;
    int maand, jaar, schrikkel, schrikkelfalse;

    public void init()
    {
        Vaklisten vl = new Vaklisten();
        vak1 = new TextField("maand",20);
        vak2 = new TextField("jaar",20);
        label = new Label("typ een getal");
        vak1.addActionListener(vl);
        vak2.addActionListener(vl);
        add (label);
        add (vak1);
        add (vak2);
    }
    public void paint(Graphics g)
    {
        g.drawString("de maand heet: "+ text, 40, 100);
        g.drawString("de maand heeft "+dagen+" dagen",40, 120);

    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = vak1.getText();
            jaars = vak2.getText();
            maand = Integer.parseInt(s);
            jaar = Integer.parseInt(jaars);
            schrikkel = jaar%4;
            schrikkelfalse = jaar%400;
            switch(maand)
            {
                case 1:
                    text = "januari";
                    dagen = "31";
                    break;
                case 2:
                    text = "februari";
                    if (schrikkel == 0 &&!( schrikkelfalse == 0)){
                        dagen = "29";
                    }
                    else
                    {
                        dagen = "28";
                    }

                    break;
                case 3:
                    text = "maart";
                    dagen = "31";
                    break;
                case 4:
                    text = "april";
                    dagen = "30";
                    break;
                case 5:
                    text = "mei";
                    dagen = "31";
                    break;
                case 6:
                    text = "juni";
                    dagen = "30";
                    break;
                case 7:
                    text = "juli";
                    dagen = "31";
                    break;
                case 8:
                    text = "augustus";
                    dagen = "31";
                    break;
                case 9:
                    text = "september";
                    dagen = "30";
                    break;
                case 10:
                    text = "oktober";
                    dagen = "31";
                    break;
                case 11:
                    text = "november";
                    dagen = "30";
                    break;
                case 12:
                    text = "december";
                    dagen = "31";
                    break;
                default:
                    text = "dit is een incorrect maand nummer";
                    dagen = null;
                    break;

            }
            repaint();
        }
    }
}