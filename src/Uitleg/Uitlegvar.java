package Uitleg;
import java.applet.Applet;
import java.awt.*;

public class Uitlegvar extends Applet{
    String text;
    int poep;
    int poenie;
    public void init(){
        text= "hoi";
        poep = 69;
        poenie= 420;
    }
    public void paint(Graphics g){
        g.drawString(text,poep,poenie);
    }
}