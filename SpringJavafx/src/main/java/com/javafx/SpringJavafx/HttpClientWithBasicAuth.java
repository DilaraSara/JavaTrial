/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

@Component
public class HttpClientWithBasicAuth {

    private String serverUrl;
    private String username;
    private String password;

    public void setBaseUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }
    public String getBaseUrl() {
        return serverUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String fetchDataFromServer() {
        try {
            // Kullanıcı adı ve şifreyi Base64 ile kodlayın
            String auth = Base64Utils.encodeToString((username + ":" + password).getBytes(StandardCharsets.UTF_8));

            // Bağlantıyı oluşturun
            URL url = new URL(serverUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // HTTP GET isteğine başlık ekleyin
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Basic " + auth);

            // Bağlantıyı başlatın
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Bağlantı başarılı, verileri alın
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    return response.toString();
                }
            } else {
                // Bağlantı başarısız
                System.err.println("HTTP Error Code: " + responseCode);
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}