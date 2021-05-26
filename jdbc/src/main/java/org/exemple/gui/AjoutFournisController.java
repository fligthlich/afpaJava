package org.exemple.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.exemple.DAL.FournisDAO;


import java.io.IOException;
import java.util.*;

public class AjoutFournisController {

    @FXML
    private TextField nomfou;
    @FXML
    private TextField ruefou;
    @FXML
    private TextField posfou;
    @FXML
    private TextField confou;
    @FXML
    private TextField vilfou;

    /**
     * Méthode qui permet d'ajouter un nouveau fournisseur
     * @param event
     */
    @FXML
    public void addNewProvider(ActionEvent event) throws IOException {
        List<TextField> listInputText = new ArrayList<>();
        List<String> lstError = new ArrayList<>();
        listInputText.add(nomfou);
        listInputText.add(ruefou);
        listInputText.add(posfou);
        listInputText.add(confou);
        listInputText.add(vilfou);
        System.out.println(verify(listInputText));

//        for (Map.Entry value : verify(listInputText).entrySet()){
//            if (value.getValue().toString() == "false"){
//                System.out.println(value.getKey());
//            }
//        }
        // On vérifi si tous les inputs ne sont pas vide
        if (verify(listInputText).containsValue(true)){
            FournisDAO fournisDAO = new FournisDAO();
            fournisDAO.addNewProvider(nomfou.getText(),ruefou.getText(),posfou.getText(),confou.getText(),vilfou.getText());

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(null);
            alert.setContentText("Voulez-vous ajouter un autre fournisseur ?");
            ButtonType yes = new ButtonType("Oui");
            ButtonType no = new ButtonType("Non");
            alert.getButtonTypes().clear();
            alert.getButtonTypes().addAll(yes, no);
            Optional<ButtonType> option = alert.showAndWait();
            // Si c'est oui on vide le formulaire
            if (option.get() == yes){
                for (TextField textField : listInputText){
                    textField.clear();
                }
                // si c'est non on retourne sur la page d'accueil
            }else if(option.get() == no){
//                Parent root = FXMLLoader.load(getClass().getResource("/org/exemple/view/informations.fxml"));
//                Stage window = (Stage) btnSceneInfos.getScene().getWindow();
//                window.setScene(new Scene(root));
            }
        }
    }

    /**
     * Méthode qui permet de réinitialiser tous les champs
     * @param event
     */
    @FXML
    public void clear(ActionEvent event) {
        nomfou.clear();
        ruefou.clear();
        posfou.clear();
        confou.clear();
        vilfou.clear();
    }

    private Map<String, Boolean> verify(List<TextField> list){
        Map<String, Boolean> tab = new HashMap<>();
        for (TextField textfield : list){
            if (textfield.getText().isEmpty() || textfield.getText().isBlank()){
                tab.put(textfield.getId(), false);
                textfield.setStyle("-fx-border-color: red");
            }else{
                tab.put(textfield.getId(), true);
            }
        }
        return tab;
    }
}
