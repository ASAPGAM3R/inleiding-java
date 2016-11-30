package Hoofdstuk13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;


@SuppressWarnings("serial")
public class Opdracht1 extends Applet
{
    String text="";
    Color[] colors={Color.orange, Color.magenta, Color.gray, Color.pink, Color.white};
    String[] kleuren={"orange", "magenta", "gray", "pink", "white"};
    Button[] knop = new Button[5];

    public void init()
    {
        for(int teller=0; teller <5; teller++)
        {
            knop[teller]= new Button(""+kleuren[teller]);
            add(knop[teller]);
            knop[teller].addActionListener(new Actionlistener());
            knop[teller].setBackground(colors[teller]);
        }
    }
    class Actionlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Button knop = (Button) e.getSource();
            setBackground(knop.getBackground());
            text = knop.getLabel();
        }
    }
    public void paint(Graphics g)
    {
        g.drawString(text, getWidth()/2-10, getHeight()/2);

    }

}
