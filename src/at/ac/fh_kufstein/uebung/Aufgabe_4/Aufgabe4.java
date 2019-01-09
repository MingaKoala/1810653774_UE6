package at.ac.fh_kufstein.uebung.Aufgabe_4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe4 {
    public static void main(String[] args) {

        List<Freunde> freunde = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            freunde.add(new Freunde(JOptionPane.showInputDialog("Bitte " + (i + 1) + ". Freund eingeben:")));
        }
        System.out.print("Meine fünf besten Freunde heißen: ");
        for (Freunde x : freunde) {
            System.out.print(x.toString());
        }
    }
}
