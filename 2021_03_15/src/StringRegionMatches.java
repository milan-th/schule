import java.util.Scanner;

public class StringRegionMatches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe1 = scanner.nextLine();
        System.out.print("String eingeben: ");
        String usereingabe2 = scanner.nextLine();
        int i = 0;
        int anzahlTreffer = 0;
        while (i<=(usereingabe1.length()-usereingabe2.length())) {
            if (usereingabe1.regionMatches(i, usereingabe2, 0, usereingabe2.length())) {
                anzahlTreffer++;
            }
            i++;
        }
        System.out.println(anzahlTreffer + " Treffer gefunden");
    }
    //TODO Bugfix
}
