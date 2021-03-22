package backend;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MitarbeiterDatenbank {
    private ArrayList<Mitarbeiter> alleMitarbeiter = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\MitarbeiterSpeicher.txt"));

    public MitarbeiterDatenbank() throws FileNotFoundException {
        try {
            String s;
            while ((s = reader.readLine()) != null){
                alleMitarbeiter.add(new Mitarbeiter(s));
            }
            reader.close();
            for (int i = 0; i < alleMitarbeiter.size(); i++) {
               BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\" + alleMitarbeiter.get(i).getId() + ".txt"));
               try {
                   alleMitarbeiter.get(i).setVorname(br.readLine());
                   alleMitarbeiter.get(i).setName(br.readLine());
                   while ((s = br.readLine()) != null) {
                       alleMitarbeiter.get(i).setMeineAufgaben(new Aufgabe(s, br.readLine(), br.readLine(), alleMitarbeiter.get(i)));
                   }
               } catch (Exception e) {
                   System.out.println("Fehler beim einlesen der Daten Dateien");
               }
               br.close();
            }
        }catch (Exception e){
            System.out.println("Fehler beim einlesen der Datei");

        }
    }

    public ArrayList<Mitarbeiter> getAlleMitarbeiter() {
        return alleMitarbeiter;
    }

    public boolean setAlleMitarbeiter(Mitarbeiter neuerMitarbeiter) throws IOException {
        if (!( new File("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\" + neuerMitarbeiter.getId() + ".txt").exists())) {
            alleMitarbeiter.add(neuerMitarbeiter);
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\" + neuerMitarbeiter.getId() + ".txt"));
            writer.write(neuerMitarbeiter.getVorname()+"\n");
            writer.write(neuerMitarbeiter.getName()+"\n");
            writer.close();
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\MitarbeiterSpeicher.txt",true));
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_03_02\\src\\storage\\MitarbeiterSpeicher.txt"));
            if(reader.readLine() != null) {
                writer1.newLine();
            }
            writer1.append(neuerMitarbeiter.getId());
            writer1.close();
            return true;
        } else {
            System.out.println("Mitarbeiter ID existiert");
            return false;
        }
    }
}