import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe1 = scanner.nextLine();
        CharSequence target = scanner.next();
        CharSequence replacement = scanner.next();
        String s = usereingabe1.replace(target, replacement);
        System.out.println(s);
    }
}
