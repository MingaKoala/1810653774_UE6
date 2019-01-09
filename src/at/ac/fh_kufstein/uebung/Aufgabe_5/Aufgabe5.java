package at.ac.fh_kufstein.uebung.Aufgabe_5;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe5 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bene", 1810653774, 2018));
        studentList.add(new Student("Babsi", 123456789, 2017));
        studentList.add(new Student("Matteo", 987654321, 2016));

        // mit add füge ich der liste daten hinzu

        for (Student s : studentList) {
            System.out.println(s);

        }
    }
}