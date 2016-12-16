package Toets2slotmachine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.net.*;

public class Slotmachine extends Applet
{

    String[]afbeeldingen={"fruit_1.jpg","fruit_2.jpg","fruit_3.jpg","fruit_4.jpg","fruit_5.jpg","fruit_6.jpg","fruit_7.jpg","fruit_8.jpg","fruit_9.jpg","fruit_10.jpg","fruit_11.jpg","fruit_12.jpg","fruit_13.jpg","fruit_14.jpg","fruit_15.jpg","fruit_16.jpg","fruit_17.jpg","fruit_18.jpg","fruit_19.jpg","fruit_20.jpg",};

    private Image image1,image2,image3;
    private AudioClip sound;
    URL pad;
    double getal1, getal2, getal3;
    int krediet,nummer1, nummer2, nummer3;
    boolean begin;
    boolean win;
    boolean bigwin;
    Button koop;
    Button Play;

    public void init() {
        begin = false;
        krediet = 10;
        pad = Slotmachine.class.getResource("/Toets2slotmachine/fruitplaatjes-toets2/");
        sound = getAudioClip(pad, "play-button-sound.mp3");
        koop = new Button("Koop Munten");
        Play = new Button("Play");
        Listen1 l1=new Listen1();
        Listen2 l2=new Listen2();
        koop.addActionListener(l2);
        Play.addActionListener(l1);
        add(Play);
        add(koop);
    }

    public void paint(Graphics g)
    {
        slots(g);

        g.drawString(""+ krediet , 80,240);

        if(win == true)
        {
            g.drawString("Gewonnen: +4 punten.", 40, 300);
            win = false;
            sound.play();
        }
        if(bigwin == true)
        {
            g.drawString("Jackpot Gewonnen: +20 punten!", 40, 300);
            bigwin = false;
            sound.play();
        }
    }


    class Listen1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            begin = true;
            if (krediet > 0)
            {
                krediet--;

                getal1 = Math.random();
                nummer1 = (int)(getal1 * 20);

                getal2 = Math.random();
                nummer2 = (int)(getal2 * 20);

                getal3 = Math.random();
                nummer3 = (int)(getal3 * 20);

                repaint();
            }
        }
    }


    class Listen2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (krediet < 1)
            {
                krediet = krediet + 10;
            }

            repaint();
        }
    }


    void slots(Graphics g)
    {
        image1 = getImage(pad, ""+ afbeeldingen[nummer1]);
        image2 = getImage(pad, ""+ afbeeldingen[nummer2]);
        image3 = getImage(pad, ""+ afbeeldingen[nummer3]);


        g.drawImage(image1, 20, 40, 80, 160, this);
        g.drawImage(image2, 100, 40, 80, 160, this);
        g.drawImage(image3, 180, 40, 80, 160, this);

        if (nummer1 == nummer2 && begin == true)
        {
            krediet = krediet + 4;
            win = true;
        }
        if (nummer2 == nummer3 && begin == true)
        {
            krediet = krediet + 4;
            win = true;
        }
        if (nummer1 == nummer3 && begin == true)
        {
            krediet = krediet + 4;
            win = true;
        }
        if (nummer1 == nummer2 && nummer1 == nummer3 && bigwin == true)
        {
            krediet = krediet + 20;
            bigwin = true;
        }
        if (krediet < 1)
        {
            koop.setEnabled(true);
        }
        else
        {
            koop.setEnabled(false);
        }
    }


}