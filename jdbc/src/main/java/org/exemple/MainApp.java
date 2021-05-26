package org.exemple;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.exemple.DAL.Fournis;
import org.exemple.DAL.FournisDAO;

import java.util.List;


public class MainApp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/exemple/view/menu.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
//        FournisDAO fournisDAO = new FournisDAO();
//        fournisDAO.addNewProvider("Gros", "rue du cake", "80000", "Amiens", "Alex");
    }

}
