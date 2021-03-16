import java.util.Scanner;

public class StringStartsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe1 = scanner.nextLine();
        if (usereingabe1.startsWith("Hallo")){
            System.out.println("Usereingabe startet mit Hallo");
        }else {
            System.out.println("Usereingabe startet nicht mit Hallo");
        }
    }
}
