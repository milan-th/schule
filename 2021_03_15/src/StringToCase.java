import java.util.Scanner;

public class StringToCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe = scanner.nextLine();
        System.out.print("Option auswählen [1/2]: ");
        byte option = scanner.nextByte();
        if (option == 1){
            System.out.println(usereingabe.toLowerCase());
        }else {
            System.out.println(usereingabe.toUpperCase());
        }
    }
}
