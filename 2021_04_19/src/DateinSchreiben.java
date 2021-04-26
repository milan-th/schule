import java.io.*;
import java.util.Scanner;

public class DateinSchreiben {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_04_19\\src\\files\\file2.txt");
        Scanner scanner = new Scanner(System.in);
        writer.write(scanner.nextLine());
        writer.close();
    }
}
