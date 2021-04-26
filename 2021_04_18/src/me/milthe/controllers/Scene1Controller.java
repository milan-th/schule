package me.milthe.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import me.milthe.Main;
import me.milthe.backend.Mannschaft;

public class Scene1Controller {
    @FXML
    public Button btnCreateClub;
    public TextField textfieldDefence;
    public Slider sliderDefence;
    public TextField textfieldMidfield;
    public Slider sliderMidfield;
    public TextField textfieldAttack;
    public Slider sliderAttack;
    public ChoiceBox choiceboxClubColor;
    public TextField textboxName;
    public TextField textboxHometown;

    public void initialize(){
        choiceboxClubColor.getItems().addAll("Wähle eine Team Farbe", "Rot", "Blau", "Grün");
        choiceboxClubColor.setValue("Wähle eine Team Farbe");
    }

    public void handleSliderDragDefence(MouseEvent mouseEvent) {
        textfieldDefence.setText(""+(int)sliderDefence.getValue());
    }

    public void handleSliderDragMidfield(MouseEvent mouseEvent) {
        textfieldMidfield.setText(""+(int)sliderMidfield.getValue());
    }

    public void handleSliderDragAttack(MouseEvent mouseEvent) {
        textfieldAttack.setText(""+(int)sliderAttack.getValue());
    }

    public void handleNumberChangeDefence(ActionEvent actionEvent) {
        sliderDefence.setValue(Integer.parseInt(textfieldDefence.getText()));
    }

    public void handleNumberChangeMidfield(ActionEvent actionEvent) {
        sliderMidfield.setValue(Integer.parseInt(textfieldMidfield.getText()));
    }

    public void handleNumberChangeAttack(ActionEvent actionEvent) {
        sliderAttack.setValue(Integer.parseInt(textfieldAttack.getText()));
    }


    public void onClickBtn(ActionEvent actionEvent) throws Exception {
        String name = textboxName.getText();
        String hometown = textboxHometown.getText();
        String color = String.valueOf(choiceboxClubColor.getValue());
        int defence = Integer.parseInt(textfieldDefence.getText());
        int midfield = Integer.parseInt(textfieldAttack.getText());
        int attack = Integer.parseInt(textfieldAttack.getText());

        if (name.equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Der Verein muss einen Namen haben.");

            alert.showAndWait();
        }else if (hometown.equals("")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Der Verein muss eine Heimatstadt haben.");

            alert.showAndWait();
        }else if (color.equals("Wähle eine Team Farbe")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Du musst eine Farbe auswählen.");

            alert.showAndWait();
        }else {
            Main.INSTANCE.getDatenbank().setDatenbank(new Mannschaft(name, hometown, color, defence, midfield, attack));

            System.out.println(Main.INSTANCE.getDatenbank().getDatenbank().get(0).getHometown());

            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("me/milthe/resources/scene2.fxml"));
            Stage window = Main.INSTANCE.mainStage;
            window.setScene(new Scene(root));
            window.show();
        }
    }
}
