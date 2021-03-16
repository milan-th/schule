import java.util.Scanner;

public class StringEndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe1 = scanner.nextLine();
        if (usereingabe1.endsWith("Tschüss")){
            System.out.println("Usereingabe endet mit Tschüss");
        }else {
            System.out.println("Usereingabe endet nicht mit Tschüss");
        }
    }
}
