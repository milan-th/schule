import javax.imageio.plugins.tiff.TIFFTagSet;
import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usereingabe = scanner.nextLine();
        int anzahl = 0;
        for (int i = 0; i < usereingabe.length(); i++) {
            if (Character.toLowerCase(usereingabe.charAt(i)) == 'a'){
                anzahl++;
            }
        }
        System.out.println("Die Usereingabe enthält " + anzahl + " Mal \u0027A\u0027");
    }
}
