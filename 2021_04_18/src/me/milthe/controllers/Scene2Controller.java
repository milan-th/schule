package me.milthe.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import me.milthe.Main;

public class Scene2Controller {
    @FXML
    public Button btnScene2;
    public Label name;
    public Label hometown;
    public Label color;
    public Label def;
    public Label midfield;
    public Label attack;

    public void initialize(){
        name.setText(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getName());
        hometown.setText(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getHometown());
        color.setText(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getColor());
        def.setText(String.valueOf(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getDefenceStat()));
        midfield.setText(String.valueOf(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getMidfieldStat()));
        attack.setText(String.valueOf(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getAttackStat()));
    }
    
    public void switchToScene1(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("me/milthe/resources/scene1.fxml"));
        Stage window = (Stage) btnScene2.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }
}
