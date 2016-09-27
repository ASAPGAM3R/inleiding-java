package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Opdracht1 extends Applet
{
    Button button2;
    Button button1;
    TextField vak1;
    Label label1;
    String text;
    int screeny, screenx;
    public void init()
    {
        screenx = 800;
        screeny = 600;
        setSize(screenx,screeny);
        text = "";
        label1=new Label("typ iets");
        add(label1);
        vak1= new TextField("",20);
        add(vak1);
        button1 = new Button();
        button1.setLabel("OK");
        Listener L = new Listener();
        Listener2 L2 = new Listener2();
        button1.addActionListener(L);
        add(button1);
        button2 = new Button();
        button2.setLabel("Reset");
        button2.addActionListener(L2);
        add(button2);

    }
    public void paint(Graphics g)
    {
        g.drawString("je typte: "+text, screenx/2, screeny/2 );
    }
    class Listener implements ActionListener
    {
        public void actionPerformed( ActionEvent e){

            text = vak1.getText();
            repaint();
        }
    }
    class Listener2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){
            text = "";
            vak1.setText("");
            repaint();
        }
    }


}