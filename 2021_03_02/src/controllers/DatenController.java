package controllers;

import backend.Aufgabe;
import backend.MitarbeiterDatenbank;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import backend.Mitarbeiter;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class DatenController{
    MitarbeiterDatenbank datenbank = new MitarbeiterDatenbank();

    @FXML
    public TextField idTextField;
    public TextField vornameTextField;
    public TextField nachnameTextField;

    public TextField bezeichungTextField;
    public TextField datumTextField;
    public TextField uhrzeitTextField;
    public ComboBox<String> mitarbeiterAufgCombobox;

    public ComboBox<String> mitarbeiterCombobox;
    public TextArea ausgabeTextfield;

    public void onClickDateneingabe(MouseEvent actionEvent) { //Wenn Button in Dateneingabe Tab gedrückt wird
        idTextField.setText(idTextField.getText().trim());
        if(!idTextField.getText().isEmpty() && !vornameTextField.getText().isEmpty() && !nachnameTextField.getText().isEmpty()){
            if (idTextField.getLength() == 4) {
                System.out.println("Neuer Mitarbeiter");
                Mitarbeiter neuerMitarbeiter = new Mitarbeiter(idTextField.getText(), vornameTextField.getText(), nachnameTextField.getText());
                datenbank.setAlleMitarbeiter(neuerMitarbeiter);
                idTextField.clear();
                vornameTextField.clear();
                nachnameTextField.clear();
                mitarbeiterAufgCombobox.getItems().add(datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getId() + " - " +datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getVorname() + " " + datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getName());
                mitarbeiterCombobox.getItems().add(datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getId() + " - " +datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getVorname() + " " + datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getName());
                System.out.println(datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getId());
                System.out.println(datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getVorname());
                System.out.println(datenbank.getAlleMitarbeiter().get((datenbank.getMitarbeiterAnzahl()-1)).getName());
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Mitarbeiter ID muss exakt 4 Zeichen lang sein!");

                alert.showAndWait();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Ein Textfeld muss Text enthalten!");

            alert.showAndWait();
        }
    }

    public void onClickAufgabe(MouseEvent mouseEvent) { // Wenn Button in Aufgaben Tab gedrückt wird
        if(!bezeichungTextField.getText().isEmpty() && !datumTextField.getText().isEmpty() && !uhrzeitTextField.getText().isEmpty()){
            boolean success = false;
            System.out.println("Neue Aufgabe");
            try {
                String idTemp = mitarbeiterAufgCombobox.getValue().substring(0, 4);
                for (int i = 0; i < datenbank.getMitarbeiterAnzahl(); i++) {
                    if (datenbank.getAlleMitarbeiter().get(i).getId().equals(idTemp)){
                        datenbank.getAlleMitarbeiter().get(i).setMeineAufgaben(new Aufgabe(bezeichungTextField.getText(), datumTextField.getText(), uhrzeitTextField.getText(), datenbank.getAlleMitarbeiter().get(i)));
                        success = true;
                    }
                }
                if (!success){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText("ID nicht gefunden");

                    alert.showAndWait();
                }
                bezeichungTextField.clear();
                datumTextField.clear();
                uhrzeitTextField.clear();
            }catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Du musst einen Mitarbeiter auswählen!");

                alert.showAndWait();
            }

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Ein Textfeld muss Text enthalten!");

            alert.showAndWait();
        }
        System.out.println(mitarbeiterAufgCombobox.getValue());
    }

    public void showMitarbeiterDaten(){
        String idTemp = mitarbeiterCombobox.getValue().substring(0, 4);
        boolean success = false;
        ausgabeTextfield.clear();
        for (int i = 0; i < datenbank.getAlleMitarbeiter().size(); i++) {
            if (datenbank.getAlleMitarbeiter().get(i).getId().equals(idTemp)){
                success = true;

                ausgabeTextfield.appendText("ID des Mitarbeiters: "+ datenbank.getAlleMitarbeiter().get(i).getId());
                ausgabeTextfield.appendText("\nVorname des Mitarbeiters: "+ datenbank.getAlleMitarbeiter().get(i).getVorname());
                ausgabeTextfield.appendText("\nNachname des Mitarbeiters: "+ datenbank.getAlleMitarbeiter().get(i).getName());

                for (int j = 0; j < datenbank.getAlleMitarbeiter().get(i).getMeineAufgaben().size(); j++) {
                    ausgabeTextfield.appendText("\n\nAufgaben " + (j + 1) + ":");
                    ausgabeTextfield.appendText("\nBezeichnung: " + datenbank.getAlleMitarbeiter().get(i).getMeineAufgaben().get(j).getTodo());
                    ausgabeTextfield.appendText("\nZu erledigen bis <Datum>: " + datenbank.getAlleMitarbeiter().get(i).getMeineAufgaben().get(j).getDatum());
                    ausgabeTextfield.appendText("\nZu erledigen bis <Uhrzeit>: " + datenbank.getAlleMitarbeiter().get(i).getMeineAufgaben().get(j).getUhrzeit());
                }
            }
        }
        if (!success){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("ID nicht gefunden");

            alert.showAndWait();
        }
    }

    public void onComboChanged(ActionEvent actionEvent) { //Wenn ComboBox in Ausgabe Tab verändert wird --> Veränderung der TextArea zu Aufgaben etc des gewählten Mitarbeiter
        showMitarbeiterDaten();
    }

    public void onClickRefreshButton(MouseEvent mouseEvent) {
        try {
            showMitarbeiterDaten();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Du musst zuerst einen Mitarbeiter auswählen");

            alert.showAndWait();
        }

    }

    public void onKeyPressedAusgabe(javafx.scene.input.KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.F5) {
            try {
                showMitarbeiterDaten();
            }catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Du musst zuerst einen Mitarbeiter auswählen");

                alert.showAndWait();
            }
        }
    }

}
