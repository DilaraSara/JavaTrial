/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author dilarasara
 */
@Controller
public class NewPageController {
     

    @FXML
private VBox vBox;
    @FXML
    private WebView webView;
    @FXML
public void initialize() {
      vBox = new VBox();
    webView = new WebView();
    WebEngine webEngine = webView.getEngine();
    // Diğer WebView ayarları ve işlemleri
     vBox.getChildren().add(webView); 
}
@FXML
public void openNewWindow(HttpClientWithBasicAuth httpClient) {
    if (webView != null) {
        // WebView kullanılabilir, verileri yükleyin
        WebEngine webEngine = webView.getEngine();
        // Diğer WebView işlemleri
        
        // Verilen URL'yi yükleyin
        webEngine.load(httpClient.getBaseUrl());
    } else {
        System.err.println("WebView is not initialized."); // İstediğiniz hata mesajını verin
    }
}
}