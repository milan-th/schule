import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe = scanner.nextLine();
        usereingabe = usereingabe.trim();
        int convert = Integer.parseInt(usereingabe);
        System.out.println(convert);
    }
}
