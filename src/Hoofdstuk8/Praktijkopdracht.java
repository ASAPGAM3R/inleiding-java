package Hoofdstuk8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet
{

    TextField vak1;
    TextField vak2;
    Button divide1;
    Button multiply1;
    Button plus1;
    Button minus1;
    Button ce1;
    double waarde1;
    double waarde2;

    public void init()
    {
        setSize(250,200);
        vak1 = new TextField(10);
        vak2 = new TextField(10);
        ce1 = new Button();
        divide1 = new Button();
        multiply1 = new Button();
        plus1 = new Button();
        minus1 = new Button();
        ce1.setLabel("Ce");
        divide1.setLabel("/");
        multiply1.setLabel("X");
        plus1.setLabel("+");
        minus1.setLabel("-");
        listen1 minus = new listen1();
        listen2 plus = new listen2();
        listen3 div = new listen3();
        listen4 mult = new listen4();
        listen5 ce = new listen5();
        plus1.addActionListener(plus);
        minus1.addActionListener(minus);
        divide1.addActionListener(div);
        multiply1.addActionListener(mult);
        ce1.addActionListener(ce);
        add(vak1);
        add(vak2);
        add(ce1);
        add(plus1);
        add(minus1);
        add(multiply1);
        add(divide1);
    }
    class listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1-waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1+waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1/waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde1 = waarde1*waarde2;
            vak1.setText(String.valueOf(waarde1));
            vak2.setText(null);
            repaint();
        }
    }
    class listen5 implements ActionListener
    {
        public void actionPerformed( ActionEvent e)
        {
            vak1.setText(null);
            vak2.setText(null);
            repaint();
        }
    }

}