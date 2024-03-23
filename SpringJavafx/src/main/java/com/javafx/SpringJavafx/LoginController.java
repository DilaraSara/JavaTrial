/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;
@Controller
   public class LoginController {
    
    @FXML
    public TextField kullaniciAdiField;
    @FXML
    public PasswordField sifreField;
    @FXML
    public Label hataLabel;
    private Runnable buttonLoadAction;

     public void setButtonLoadAction(Runnable action) {
     buttonLoadAction = action;
    }

     @FXML
    public void handleLoginButtonAction(ActionEvent event) throws IOException {
    String username = kullaniciAdiField.getText();
    String password = sifreField.getText();

    AuthService authService = new AuthService();
    boolean authenticated = authService.authenticate(username, password);
    

            
         if (authenticated) {           
            if (buttonLoadAction != null) {
                buttonLoadAction.run();
            }
        } else {
            hataLabel.setText("Oturum açma başarısız!");
        }
    } 
}

