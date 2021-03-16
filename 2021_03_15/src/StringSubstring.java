import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe1 = scanner.nextLine();
        int start = scanner.nextInt();
        int ende = scanner.nextInt();
        System.out.println(usereingabe1.substring(start, ende));
    }
}
