import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String eingeben: ");
        String usereingabe1 = scanner.nextLine();
        System.out.print("Target eingeben: ");
        CharSequence target = scanner.next();
        System.out.print("Replacement eingeben: ");
        CharSequence replacement = scanner.next();
        String s = usereingabe1.replace(target, replacement);
        System.out.println(s);
    }
}
