/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remoteserverdatadisplay;
import java.io.*;
import java.net.Socket;
/**
 *
 * @author dilarasara
 */
public class SunucuBaglanti {
    public static void main(String[] args) {
        
         // Kimlik bilgilerini al
        KimlikBilgileri kimlik = new KimlikBilgileri("kullanici_adi", "sifre");

        // Sunucu ile iletişim kurmak için kimlik bilgilerini kullan
        baglantiKurVeVerileriAl(kimlik);
    }

    public static void baglantiKurVeVerileriAl(KimlikBilgileri kimlik) {
        String kullaniciAdi = kimlik.getKullaniciAdi();
        String sifre = kimlik.getSifre();

        // Sunucu ile iletişim kodunu buraya ekleyin
        // Kimlik doğrulama bilgilerini kullanarak sunucuya bağlanabilirsiniz.
        String sunucuAdresi = "sunucu_ip_adresi";
        int sunucuPort = 12345;
       
        try {
            Socket socket = new Socket(sunucuAdresi, sunucuPort);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Kimlik doğrulama bilgilerini sunucuya iletebilirsiniz
            System.out.println(kullaniciAdi);
            System.out.println(sifre);

            // Sunucudan gelen yanıtı okuyabilirsiniz
            String sunucuYaniti = in.readLine();
            if ("GirisBasarili".equals(sunucuYaniti)) {
                System.out.println("Giriş başarılı.");
                // Sunucu işlemlerine devam edebilirsiniz.
            } else {
                System.out.println("Giriş başarısız.");
                // Hata işleme kodları buraya eklenebilir.
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Bağlantı hatası veya başka bir hata durumunu ele almak için kod buraya eklenebilir.
        }
    }

    static String baglantiKurVeVerileriAl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
