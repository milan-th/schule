import java.util.Scanner;

public class StringToCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe = scanner.nextLine();
        byte option = scanner.nextByte();
        if (option == 1){
            System.out.println(usereingabe.toLowerCase());
        }else {
            System.out.println(usereingabe.toUpperCase());
        }
    }
}
