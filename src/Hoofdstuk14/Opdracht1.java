package Hoofdstuk14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Opdracht1 extends Applet {

    String[] soorten = {"klaver", "schoppen", "harten", "ruiten"};
    String[] getallen = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] deck = new String[52];
    Button knop;
    int x;
    boolean geklikt;

    @Override
    public void init() {

        knop = new Button("Deel kaart");
        knop.addActionListener(new Deelknop());
        add(knop);

        int index = 0;

        for (int i = 0; i < soorten.length; i++) {
            String kleur = soorten[i];

            for (int j = 0; j < getallen.length; j++) {
                String kaart = getallen[j];
                deck[index] = kleur + " " + kaart;
                index++;
            }
        }
    }

    class Deelknop implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            int r = random.nextInt(52);
            x = r;

            geklikt = true;

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        if (geklikt == true) {
            g.drawString("Je kaart is: " + deck[x], 50, 50);
        }
    }
}