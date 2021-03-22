import java.util.Scanner;

public class StringValueOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int zahl = scanner.nextInt();
        String convert = String.valueOf(zahl);
        System.out.println(convert);
    }
}
