import java.util.Scanner;

public class FussballStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fussballspiel match = new Fussballspiel(new Team(), new Team());
        char option;

        System.out.println("Starte Fußballsimulation");

        System.out.print("Bitte geben Sie den Namen für Mannschaft 1 ein: ");
        match.getTeams(0).setName(scanner.nextLine());
        System.out.print("Bitte geben Sie den Namen für Mannschaft 2 ein: ");
        match.getTeams(1).setName(scanner.nextLine());

        do {
            System.out.println("***********************************************");
            System.out.println("Was möchten Sie tun?");
            System.out.println("[D]aten der Fußballteams anzeigen");
            System.out.println("[T]rainieren");
            System.out.println("[S]pielen");
            System.out.println("[M]arkt");
            System.out.println("[E]nde des Spiels");
            System.out.print("Auswahl: ");
            option = Character.toLowerCase(scanner.next().charAt(0));
            System.out.println("***********************************************");

            if (option == 'd') {
                System.out.println("-----------------------------------------------");
                System.out.println(match.getTeams(0).getName());
                System.out.println("Hat eine aktuelle Spielstärke von: " + match.getTeams(0).getSpielstaerke());
                System.out.println("Der aktuelle Punktestand beträgt " + match.getTeams(0).getPunkte() + " Punkte");
                System.out.println("-----------------------------------------------");
                System.out.println(match.getTeams(1).getName());
                System.out.println("Hat eine aktuelle Spielstärke von: " + match.getTeams(1).getSpielstaerke());
                System.out.println("Der aktuelle Punktestand beträgt " + match.getTeams(1).getPunkte() + " Punkte");
                System.out.println("-----------------------------------------------");

            } else if (option == 't') {
                System.out.println("-----------------------------------------------");
                System.out.print("Welches Team möchten Sie trainieren, 1 oder 2: ");
                option = scanner.next().charAt(0);
                if (option == '1') {
                    match.getTeams(0).trainieren();
                } else if (option == '2') {
                    match.getTeams(1).trainieren();
                } else {
                    System.out.println("Fehler beim Trainieren (Auswahl)");
                }
                System.out.println("-----------------------------------------------");

            } else if (option == 's') {
                match.spielen();

            } else if (option == 'm') {
                System.out.println("-----------------------------------------------");
                System.out.println("Willst du einen Spieler [K]aufen oder [V]erkaufen?");
                option = Character.toLowerCase(scanner.next().charAt(0));
                System.out.println("Für welches Team, 1 oder 2: ");
                int x = Integer.parseInt(scanner.next());
                if (option == 'k') {
                    match.getTeams((x - 1)).setSpielstaerke(1);
                } else if (option == 'v') {
                    match.getTeams((x - 1)).setSpielstaerke(-1);
                }
                System.out.println("-----------------------------------------------");

            } else if (option == 'e') {
                break;

            } else {
                System.out.println("Fehler bei Auswahl im Menü");
            }
        } while (true);
        System.out.println("Programmende");
    }
}
