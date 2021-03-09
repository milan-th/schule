package backend;

import java.io.File;
import java.util.ArrayList;

public class FileManagement {
    ArrayList<String> allFiles = new ArrayList<>();

    public void setAllFiles(String filePath){
        allFiles.add(filePath);
    }

    public ArrayList<String> getAllFiles(){
        return allFiles;
    }

    public void createNewFile(){
        String tempFilePath = "Mitarbeiter";

        createNewFile();
    }
}
