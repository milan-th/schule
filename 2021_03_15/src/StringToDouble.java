import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe = scanner.nextLine();
        double convert = Double.parseDouble(usereingabe);
        System.out.println(convert);
    }
}
