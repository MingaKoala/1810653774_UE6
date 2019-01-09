package at.ac.fh_kufstein.uebung;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_2 {

    public static void main(String[] args) {

        int length= Integer.parseInt(JOptionPane.showInputDialog("Die Länge des Arrays"));
        int [] array= new int[length];

        Random zufall= new Random(); // stellt einen zufallszahlen-generator zur verfügung Konstruktor von Random erwartet keinen Parameter

        for (int i = 0; i<length; i++) // zählt dazu deshalb dann rückwärts sonst falle ich aus dem ARRAY raus
            array[i]= zufall.nextInt(1000); // Diese Anweisung weist der Variablen i eine Zufallszahl im Bereich zwischen 0 und 1000 zu.

        for(int i= array.length-1; i>= 0; i--) // umgekehrte reihenfolge ausgeben
        {
            System.out.println(array[i]);
        }
    }
}
