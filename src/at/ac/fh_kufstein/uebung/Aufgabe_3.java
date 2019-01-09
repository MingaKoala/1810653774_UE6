package at.ac.fh_kufstein.uebung;

import javax.swing.*;
import java.util.Random;

public class Aufgabe_3 {
    public static void main(String[] args) {

        Random zufall= new Random();
        int[] array = new int[100];

        for (int i = 0; i<array.length; i++){
            array[i] = zufall.nextInt();
        }

        while(true){

            int neueZahl = 0;

            // Position abfragen die geändert werden soll
            int index = Integer.parseInt(JOptionPane.showInputDialog("Welche Position im Array möchten Sie ändern?"));

            String eingabe = JOptionPane.showInputDialog("Bitte Zahl eingeben");

                if(eingabe.matches("[0-9]+")) { // zahlen von 0-100 können eingegeben werden wenn was anderes eingeben wird fehler + bedeutet ich kann 1 und noch 1 dazu zun also 11 sonst wäre das nicht möglich
                neueZahl = Integer.parseInt(eingabe);
                array[index] = neueZahl;

            }else {
                //exit, keine Zahl!!!!!!!!!!!1

                System.out.println("Ungültige Eingabe, Exit!");

                break;
            }
            System.out.println("Position " + index + " wurde auf " + neueZahl + " geändert.");
            }

        }

    }

