import java.util.Scanner;

public class StringStartsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe1 = scanner.nextLine();
        System.out.print("String eingeben: ");
        String usereingabe2 = scanner.nextLine();
        if (usereingabe1.startsWith(usereingabe2)){
            System.out.println("Usereingabe startet mit " + usereingabe2);
        }else {
            System.out.println("Usereingabe startet nicht mit " + usereingabe2);
        }
    }
}
