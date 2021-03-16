import java.util.Scanner;

public class StringValueOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        String convert = String.valueOf(zahl);
        System.out.println(convert);
    }
}
