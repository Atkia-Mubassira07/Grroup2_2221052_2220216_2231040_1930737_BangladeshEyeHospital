/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author atkia
 */
public class MaintenanceStaffHomepageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewWorkButtonOnAction(ActionEvent event) throws IOException {
        
        Parent parent;
        parent = FXMLLoader.load(getClass().getResource("CreateUserAccountinAdministrator.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }




    @FXML
    private void updateWorkButtonOnAction(ActionEvent event) throws IOException {
           Parent parent;
        parent = FXMLLoader.load(getClass().getResource("CreateUserAccountinAdministrator.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }
    
    @FXML
    private void deleteWorkButtonOnAction(ActionEvent event) throws IOException {
          Parent parent;
        parent = FXMLLoader.load(getClass().getResource("CreateUserAccountinAdministrator.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }
    
    @FXML
    private void emergencyWorkButtonOnAction(ActionEvent event) throws IOException {
         Parent parent;
        parent = FXMLLoader.load(getClass().getResource("CreateUserAccountinAdministrator.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }
    
    @FXML
    private void workDoneButtonOnAction(ActionEvent event) throws IOException {
         Parent parent;
        parent = FXMLLoader.load(getClass().getResource("CreateUserAccountinAdministrator.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }
    @FXML
    private void logoutButtonOnAction(ActionEvent event) throws IOException {
        Parent parent;
        parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }

}

