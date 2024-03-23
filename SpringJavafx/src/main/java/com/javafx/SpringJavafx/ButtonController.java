/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

import jakarta.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

/**
 *
 * @author dilarasara
 */
@Controller
class ButtonController {
     @FXML
    private Label dataLabel;    
     @FXML
    private GridPane gridPane;
     @FXML
    private VBox vBox;     
    private final HttpClientWithBasicAuth httpClient;

    public ButtonController(HttpClientWithBasicAuth httpClient) {
        this.httpClient = httpClient;
    }
    
    @FXML
    private void closeWindow(ActionEvent event) {
        Stage stage = (Stage) dataLabel.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    public void initialize() {
              
        gridPane = new GridPane(); 
        vBox = new VBox();    
    Button button1 = createButton("SAC METAL", "http://10.0.60.30:2700/drk15/BIOnlineKPI/56");  
    Button button2 = createButton("KAUCUK IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/58");
    Button button3 = createButton("KORUK IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/59");
    Button button4 = createButton("TALASLI IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/60");
    Button button5 = createButton("ALUMINYUM IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/61");
    Button button6 = createButton("AMORTISOR IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/62");
    Button button7 = createButton("DOVME IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/63");
    Button button8 = createButton("PLASTIK IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/64");
    Button button9 = createButton("ROT IMALAT", "http://10.0.60.30:2700/drk15/BIOnlineKPI/65");
    Button button10 = createButton("YUZEY ISLEM", "http://10.0.60.30:2700/drk15/BIOnlineKPI/66");
    
     vBox.getChildren().addAll(button1, button2,button3,
      button4,button5,button6,button7,button8,button9, button10);
      gridPane.add(vBox, 0, 0);
    
}

private Button createButton(String buttonText, String serverUrl) {
        Button button = new Button(buttonText);
        button.setOnAction(e -> {
            try {
                fetchDataAndDisplay(serverUrl);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        return button;
    }

   
@FXML
public void button1(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/56"; // Button 1 için URL
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button2(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/58";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button3(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/59";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button4(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/60";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button5(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/61";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button6(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/62";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}

@FXML
public void button7(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/63";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button8(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/64";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button9(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/65";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
@FXML
public void button10(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Parent root = loader.load();
        NewPageController newPageController = loader.getController();

        String url = "http://10.0.60.30:2700/drk15/BIOnlineKPI/66";
        HttpClientWithBasicAuth httpClient = new HttpClientWithBasicAuth();
        httpClient.setBaseUrl(url);

        newPageController.openNewWindow(httpClient);
    
    
    Scene scene = new Scene(root);
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    primaryStage.setScene(scene);
    primaryStage.show();
}
public void fetchDataAndDisplay(String serverUrl) throws IOException {
    String xmlData = fetchDataFromServer(serverUrl);

    if (xmlData != null) {

        try {
            OnlineKPI onlineKPI = XmlUtils.parseXmlData(xmlData);
            // Verileri işleyin ve JavaFX arayüzüne yerleştirin
            dataLabel.setText("Machine: " + onlineKPI.getMachine() +
            "\nOperator Adi: " + onlineKPI.getOperatorAdi() +
    "\nParça Kodu: " + onlineKPI.getParcaKodu() +
    "\nNet Çevrim: " + onlineKPI.getNetCevrim() +
    "\nIsvEmri No: " + onlineKPI.getIsEmriNo() +
    "\nYardimci Operator1: " + onlineKPI.getYardimciOperator1() +
    "\nYardimci Operator2: " + onlineKPI.getYardimciOperator2() +
    "\nOperasyon Adi: " + onlineKPI.getOperasyonAdi() +
    "\nVardiya Performans: " + onlineKPI.getVardiyaPerformans() +
    "\nVardiya OEE: " + onlineKPI.getVardiyaOEE() +
    "\nVardiya Kullanilabilirlik: " + onlineKPI.getVardiyaKullanilabilirlik() +
    "\nPlanlanan Miktar: " + onlineKPI.getPlanlananMiktar() +
    "\nYapılabilir Adet: " + onlineKPI.getYapilabilirAdet() +
    "\nYapılan Adet: " + onlineKPI.getYapilanAdet() +
    "\nDurus Adi: " + onlineKPI.getDurusAdi() +
    "\nDurus Sure: " + onlineKPI.getDurusSure() +
    "\nDurus Kodu: " + onlineKPI.getDurusKodu() +
    "\nTeknisyen Grubu: " + onlineKPI.getTeknisyenGrubu() +
    "\nTeknisyen Adi: " + onlineKPI.getTeknisyenAdi() +
    "\nTeknisyen Cagri Grubu: " + onlineKPI.getTeknisyenCagriGrubu() +
    "\nTeknisyen Arizaya Intikal: " + onlineKPI.getTeknisyenArizayaIntikal() +
    "\nVardiya Toplam Durus: " + onlineKPI.getVardiyaToplamDurus() +
    "\nTeknisyen Mudahale: " + onlineKPI.getTeknisyenMudahale() +
    "\nPlan Baslangic Zamani: " + onlineKPI.getPlanBaslangicZamani() +
    "\nPlanlanan Sure: " + onlineKPI.getPlanlananSure() +
    "\nKalan Adet: " + onlineKPI.getKalanAdet());
        } catch (JAXBException e) {
            e.printStackTrace();
            // XML ayrıştırma hatası işleme
        }
    }
}
 @FXML
    public String fetchDataFromServer(String serverUrl) throws IOException {
        if (serverUrl == null) {
            throw new IllegalStateException("BaseUrl is not set.");
        }
               try {
        URL url = new URL(serverUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            connection.disconnect();

            return response.toString();
        } else {
            // Sunucudan veri çekme hatası işleme veya hata mesajı döndürme
            return null;
        }
    } catch (IOException e) {
        e.printStackTrace();
        // İstek gönderme hatası işleme veya hata mesajı döndürme
        return null;
    }
}


}

    


    

