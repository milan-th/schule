import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe = scanner.nextLine();
        double convert = Double.parseDouble(usereingabe);
        System.out.println(convert);
    }
}
