package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    TextField[] textFields;
    int[] getallen;
    Button knop;

    public void init() {

        textFields = new TextField[5];
        getallen = new int[5];
        knop = new Button("Klik");

        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField("", 7);
            add(textFields[i]);

        }
        knop.addActionListener(new KnopListener()) ;
        add(knop);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            for (int j = 0; j < getallen.length; j++) {
            getallen[j] = Integer.parseInt(textFields[j].getText());

            }

            Arrays.sort(getallen);
            for (int i = 0; i < textFields.length; i++) {
                textFields[i].setText("" + getallen[i]);
            }
        }
    }
}