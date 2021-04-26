import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDateinen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_04_19\\src\\files\\file.txt"));
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
