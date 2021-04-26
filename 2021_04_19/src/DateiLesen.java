import java.io.*;

public class DateiLesen {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Milan\\IdeaProjects\\schule\\2021_04_19\\src\\files\\file.txt"));
        System.out.println(reader.readLine());
        reader.close();
    }
}

