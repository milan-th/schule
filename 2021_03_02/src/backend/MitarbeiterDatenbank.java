package backend;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class MitarbeiterDatenbank {
    private ArrayList<Mitarbeiter> alleMitarbeiter = new ArrayList<>();
    private int mitarbeiterAnzahl = 0;
    File file = new File("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\MitarbeiterSpeicher.txt");
    Scanner fileScanner = new Scanner(file);

    public MitarbeiterDatenbank() throws FileNotFoundException {
        try {
            while (fileScanner.hasNext()){
                alleMitarbeiter.add(new Mitarbeiter(fileScanner.nextLine()));
            }
            for (int i = 0; i < alleMitarbeiter.size(); i++) {
                File dataFile = new File("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\"+alleMitarbeiter.get(i).getId()+".txt");
                Scanner dataScanner = new Scanner(dataFile);
                try {
                    alleMitarbeiter.get(i).setName(dataScanner.nextLine());
                    alleMitarbeiter.get(i).setVorname(dataScanner.nextLine());
                    while (dataScanner.hasNext()) {
                        alleMitarbeiter.get(i).setMeineAufgaben(new Aufgabe(dataScanner.nextLine(), dataScanner.nextLine(), dataScanner.nextLine(), alleMitarbeiter.get(i)));
                    }
                }catch (Exception e){
                    System.out.println("Fehler beim einlesen der Daten Dateien");
                }
            }
        }catch (Exception e){
            System.out.println("Fehler beim einlesen der Datei");

        }
    }

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
