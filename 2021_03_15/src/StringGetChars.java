import java.util.Scanner;

public class StringGetChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe1 = scanner.nextLine();
        int start = scanner.nextInt();
        int anzahl = scanner.nextInt();
        char[] charactere = new char[anzahl];
        usereingabe1.getChars(start, (anzahl+start), charactere, 0);
        for (char c : charactere) {
            System.out.println(c);
        }
    }
}
