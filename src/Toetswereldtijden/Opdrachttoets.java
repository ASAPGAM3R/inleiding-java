package Toetswereldtijden;

import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.applet.*;

@SuppressWarnings("serial")
public class Opdrachttoets extends Applet
{
    int uur, sydneyt, londent, nyt, lat;
    Button button1;
    TextField vak1;
    public void init()
    {
        button1 = new Button("Toon Tijden");
        vak1 = new TextField("",15);
        uur = -1;
        Listen1 L = new Listen1();
        button1.addActionListener(L);
        add(vak1);
        add(button1);
    }
    public void paint(Graphics g)
    {
        if (uur>-1&& uur<24)
        {
            g.drawString("sydney: "+sydneyt+":00", 60, 60);
            g.drawString("los angeles: "+lat+":00", 60, 80);
            g.drawString("new york "+nyt+":00", 60, 100);
            g.drawString("Londen: "+londent+":00", 60, 120);
        }
        else if(uur !=-1)
        {
            g.drawString("ERROR: voer een geldig uur in!!", 20, 80);
        }
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            uur = Integer.parseInt(vak1.getText());
            if (uur<24 && uur >= 0)
            {
                sydneyt = uur + 9;
                if (sydneyt>24)
                {
                    sydneyt = sydneyt - 24;
                }
                lat = uur - 9;
                if (lat<= 0)
                {
                    lat = lat + 24;
                }
                nyt = uur - 6;
                if (nyt<= 0)
                {
                    nyt = nyt + 24;
                }
                londent = uur - 1;
                if (londent<= 0)
                {
                    londent = londent + 24;
                }
                repaint();
            }
        }
    }
}