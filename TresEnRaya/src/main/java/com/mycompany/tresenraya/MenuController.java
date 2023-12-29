/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.tresenraya;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Michael
 */
public class MenuController implements Initializable {

    @FXML
    Pane Pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void jugar(ActionEvent event) {
        Stage currentStage = (Stage) Pane.getScene().getWindow();
        currentStage.close();
        Game gameUI = new Game();
        gameUI.start(new Stage()); // Esto lanzará la nueva ventana del juego
    }
}
