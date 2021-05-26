package org.exemple.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import org.exemple.DAL.Entcom;
import org.exemple.DAL.EntcomDAO;
import org.exemple.DAL.Fournis;
import org.exemple.DAL.FournisDAO;


public class TraitementsController {

    @FXML
    public ComboBox selectFournis;
    @FXML
    public TextArea infosCom;

    /**
     * Méthode d'initialisation de la comboBox avec les données d'un fournisseur
     */

    @FXML
    public void initialize(){
        FournisDAO fournisDAO = new FournisDAO();
        for (Fournis fournis : fournisDAO.getAll()){
            selectFournis.getItems().add(fournis.getNomfou()); // Ajoute et montre les entrée contenu dans la combobox
        }
    }

    /**
     * Méthode qui permet d'afficher les commandes d'un client dans le text-aréa
     * @param event
     */
    @FXML
    public void handleComboBox(ActionEvent event) {
        //Ici tu dois afficher le resultat de l'action dans la console quand tu clique ça doit renvoi la valeur
        if (selectFournis.getValue() != null){
            EntcomDAO entcomDAO = new EntcomDAO();
            String lst = "";
            for (Entcom entcom : entcomDAO.findCommandByFournis(selectFournis.getValue().toString())){
                lst = lst + entcom.getNumcom() + " " + entcom.getObscom() + " " + entcom.getDatcom() + "\n";
            }
            infosCom.setText(lst);
        }
    }
}
