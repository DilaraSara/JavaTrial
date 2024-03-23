package com.javafx.SpringJavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import javafx.fxml.FXML;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;



/**
 * JavaFX App
 */
@SpringBootApplication

public class App extends Application {
    @FXML
    public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    launch(App.class, args);
    }

    public static Scene scene;
    
    private ConfigurableApplicationContext applicationContext;

     @Override
    public void init() throws Exception {
        applicationContext = SpringApplication.run(App.class);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent loginRoot = loginLoader.load();
        LoginController loginController = loginLoader.getController();

        Scene loginScene = new Scene(loginRoot, 400, 300);
        primaryStage.setTitle("Login");
        primaryStage.setScene(loginScene);
        primaryStage.show();

        loginController.setButtonLoadAction(() -> {
            try {
                FXMLLoader buttonLoader = new FXMLLoader(getClass().getResource("button.fxml"));
                Parent buttonRoot = buttonLoader.load();
                ButtonController buttonController = buttonLoader.getController();
                buttonController.initialize();

                Scene buttonScene = new Scene(buttonRoot, 800, 600);
                Stage buttonStage = new Stage();
                buttonStage.setScene(buttonScene);
                buttonStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }

   
    @FXML
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
   @FXML
    public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


}