package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import java.io.IOException;


/**
 * FXML Controller class
 *
 * @author atkia
 */
public class AdministratorHomepageController implements Initializable {

    
    @FXML
    private Button EditExistingAccountButton;
    @FXML
    private Button DisplayAccountButton;

    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    private void NewAccountButtonOnClick(ActionEvent event) throws IOException {
        
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
    private void ResetPasswordButton(ActionEvent event) throws IOException{
        Parent parent;
        parent = FXMLLoader.load(getClass().getResource("ResetPasswordinAdministrator.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void EditUserAccountButton(ActionEvent event)throws IOException  {
        Parent parent;
        parent = FXMLLoader.load(getClass().getResource("EditUserAccountInAdmin.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void DeleteAccountButton(ActionEvent event) throws IOException {
        Parent parent;
        parent = FXMLLoader.load(getClass().getResource("DeleteUserAccountInAdmin.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void HomePageButton(ActionEvent event)throws IOException {
        Parent parent;
        parent = FXMLLoader.load(getClass().getResource("AdministratorDashboard.fxml"));
       
        //parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //   stg.setTitle("Checking... Stage switching");

        stg.setScene(scene);
        stg.show();
    }
    
    
    
}
