package me.milthe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import me.milthe.backend.MannschaftenDatenbank;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {
    public static Main INSTANCE;
    private MannschaftenDatenbank datenbank = new MannschaftenDatenbank();
    public Stage mainStage;

    public Main() {
        INSTANCE = this;
    }

    public MannschaftenDatenbank getDatenbank() {
        return datenbank;
    }

    @Override

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("me/milthe/resources/scene1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        mainStage = stage;

        developerScreen();
    }

    public void developerScreen(){ //@todo fix finden um den developer screen anzuzeigen wenn command eingegeben wird
        new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true){
                if (scanner.nextLine().equals("developer")) {
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getClassLoader().getResource("me/milthe/resources/developerScreen.fxml"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Main.INSTANCE.mainStage.setScene(new Scene(root));
                    Main.INSTANCE.mainStage.show();
                }
            }
        }).start();
    }

    public void changeScene(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
