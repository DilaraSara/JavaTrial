/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafx.SpringJavafx;

public class AuthService {
    public boolean authenticate(String username, String password) {
        // Gerçek doğrulama mantığı burada uygulanır.
        // Örneğin, kullanıcı adı ve şifrenin doğru olup olmadığını kontrol edebilirsiniz.
        return "MESSTAJER".equals(username) && "12345".equals(password);
    }
    
}