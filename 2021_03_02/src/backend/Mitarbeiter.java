package backend;

import java.util.ArrayList;

public class Mitarbeiter {
    private String id;
    private String vorname;
    private String name;
    private ArrayList<Aufgabe> meineAufgaben = new ArrayList<>();

    public Mitarbeiter(String id, String vorname, String name) {
        this.id = id;
        this.vorname = vorname;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Aufgabe> getMeineAufgaben() {
        return meineAufgaben;
    }

    public void setMeineAufgaben(Aufgabe aufgabe){
        meineAufgaben.add(aufgabe);
    }
}
