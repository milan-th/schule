package backend;

import java.util.ArrayList;

public class MitarbeiterDatenbank {
    private ArrayList<Mitarbeiter> alleMitarbeiter = new ArrayList<>();
    private int mitarbeiterAnzahl = 0;

    public ArrayList<Mitarbeiter> getAlleMitarbeiter() {
        return alleMitarbeiter;
    }

    public void setAlleMitarbeiter(Mitarbeiter neuerMitarbeiter) {
        alleMitarbeiter.add(neuerMitarbeiter);
        setMitarbeiterAnzahl();
    }

    public int getMitarbeiterAnzahl() {
        return mitarbeiterAnzahl;
    }

    public void setMitarbeiterAnzahl() {
        this.mitarbeiterAnzahl += 1;
    }
}
