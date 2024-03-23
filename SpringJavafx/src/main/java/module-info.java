module com.javafx.SpringJavafx
{
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.xml.bind;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires javafx.web;
   
    
    requires spring.core;
    
    
    opens com.javafx.SpringJavafx to javafx.fxml;
    exports com.javafx.SpringJavafx;
}
