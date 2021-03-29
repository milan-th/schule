import java.util.Scanner;

public class StringGetChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe1 = scanner.nextLine();
        System.out.print("Start eingeben: ");
        int start = scanner.nextInt();
        System.out.print("Anzahl eingeben: ");
        int anzahl = scanner.nextInt();
        char[] charactere = new char[anzahl];
        usereingabe1.getChars(start, (anzahl+start), charactere, 0);
        for (char c : charactere) {
            System.out.println(c);
        }
    }
}
