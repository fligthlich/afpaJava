package org.exemple.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import org.exemple.DAL.Fournis;
import org.exemple.DAL.FournisDAO;

import java.util.List;

public class InformationsController {

    public TextField nomfou;
    public TextField ruefou;
    public TextField posfou;
    public TextField vilfou;
    public TextField confou;
    @FXML
    private TextField inputSearch;
    @FXML
    private Button searchButton;


    public void search(ActionEvent event){
        FournisDAO fournisDAO = new FournisDAO();
       try{
           Fournis fournis =  fournisDAO.getAllByNumFou(Integer.parseInt(inputSearch.getText()));
           if (fournis != null){
               System.out.println("tu rempli tous dans les inputs texts");
               nomfou.setText(fournis.getNomfou());
               ruefou.setText(fournis.getRuefou());
               posfou.setText(fournis.getPosfou());
               vilfou.setText(fournis.getVilfou());
               confou.setText(fournis.getConfou());

           }else{
               // on affiche un message d'erreur avec une alert
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Message");
               alert.setHeaderText(null);
               alert.setContentText("Aucun fournisseur n'a été trouvé");
               alert.showAndWait();
           }
       }catch (Exception e) {
           e.getMessage();
       }


    }
}
