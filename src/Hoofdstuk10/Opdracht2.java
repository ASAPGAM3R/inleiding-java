package Hoofdstuk10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht2 extends Applet
{
    TextField vak1;
    Label label;
    String s, cijfer;
    long cijfer1, cijfer2, cijfer3;

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
        g.drawString("het hoogste cijfer is: "+ cijfer1, 40, 80);
        g.drawString("het laagste cijfer is: "+ cijfer3, 40, 100);
    }
    class Vaklisten implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            cijfer2 = Long.parseLong(vak1.getText());
            if (cijfer3 == 0)
            {
                cijfer3 = cijfer2;
            }
            if ((cijfer2>cijfer1))
            {
                cijfer1 = cijfer2;
                vak1.setText(null);
                repaint();
            }
            if ((cijfer2<cijfer1) && (cijfer2<cijfer3))
            {
                cijfer3 = cijfer2;
                vak1.setText(null);
                repaint();
            }
        }
    }
}