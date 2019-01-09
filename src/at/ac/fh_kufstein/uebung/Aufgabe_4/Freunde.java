package at.ac.fh_kufstein.uebung.Aufgabe_4;



public class Freunde {


    private String name;

    public Freunde(String name){
        this.name = name; // Das Schlüsselwort this liefert eine Referenz auf den Speicherbereich, in dem ein Objekt gespeichert ist zurück.
    }

    public String getName(){
        return name; // Rückgabewerte
    }

    public void setName(String name){
        this.name = name;
    }

    @Override //Mit diesem Typ kann eine Methode gekennzeichnet werden, die die Methode ihrer Oberklasse überschreibt.
    public String toString() { // to String Methode liefer Objektname +Hashcode
        return getName()+ " ";
    }

}





