package org.exemple.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {


    public Button btnSceneInfos;
    public Button btnTraitement;
    public Button btnAjout;


    public void handleBtnInfos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/org/exemple/view/informations.fxml"));
        Stage window = (Stage) btnSceneInfos.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleBtnTraitement(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/org/exemple/view/traitements.fxml"));
        Stage window = (Stage) btnTraitement.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleBtnAjout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/org/exemple/view/ajoutFournis.fxml"));
        Stage window = (Stage) btnAjout.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
