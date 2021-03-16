import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe1 = scanner.nextLine();
        String usereingabe2 = scanner.nextLine();

        if (usereingabe1.equals(usereingabe2)){
            System.out.println("Usereingabe ist genau gleich");
        } else if (usereingabe1.equalsIgnoreCase(usereingabe2)){
            System.out.println("Groß-/Kleinschreibung ist ungleich");
        }else {
            System.out.println("Usereingabe ist ungleich");
        }
    }
}
