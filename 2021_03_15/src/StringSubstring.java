import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe1 = scanner.nextLine();
        System.out.print("Start eingeben: ");
        int start = scanner.nextInt();
        System.out.print("Ende eingeben: ");
        int ende = scanner.nextInt();
        System.out.println(usereingabe1.substring(start, ende));
    }
}
