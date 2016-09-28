package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht1 extends Applet
{
    TextField vak1;
    Label label;
    String s, cijfer;
    long cijfer1, cijfer2;

    public void init()
    {
        vak1 = new TextField("",20);
        label = new Label("typ een getal");
        vak1.addActionListener(new Vaklisten());
        add (label);
        add (vak1);
    }
    public void paint(Graphics g)
    {
        g.drawString(cijfer1+"", 40, 80);
    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            cijfer2 = Long.parseLong(vak1.getText());
            if ((cijfer2>cijfer1))
            {
                cijfer1 = cijfer2;
                vak1.setText(null);
                repaint();
            }
        }
    }
}
