import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String s = scanner.nextLine();
        System.out.println("String Length: " + s.length());
    }
}
