/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 *
 * @author Davi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML //O primeiro @FXML Identica os controles (os icones e botões que vc tem)
    private Label lblMensagem;
    private Button btnClick;
    
    @FXML //Esse segundo @FXML identifica os eventos que vão acontecer dentro do seu sceneBuilder
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo ! ");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
