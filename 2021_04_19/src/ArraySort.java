import java.io.*;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_04_19\\src\\files\\file.txt"));
        String[] line = reader.readLine().split(" ");
        String[] lineLowerCase = new String[line.length];
        for (int i = 0; i < lineLowerCase.length; i++) {
            lineLowerCase[i] = line[i].toLowerCase();
        }
        Arrays.sort(lineLowerCase);
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line.length; j++) {
                if (line[i].equalsIgnoreCase(lineLowerCase[j])) {
                    String temp = line[j];
                    line[j] = line[i];
                    line[i] = temp;
                }
            }
        }
        for (int i = 0; i < line.length; i++) {
            System.out.println(line[i]);
        }
        reader.close();
    }
}
