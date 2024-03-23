
package remoteserverdatadisplay;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
import java.net.Socket;
/**
 *
 * @author dilarasara
 */
public class RemoteServerDataDisplay extends javax.swing.JFrame {
 private static final int KARE_SAYISI = 15;
    private static final int GUNCELLEME_ARALIGI = 20000; // 20 saniyede bir
    public RemoteServerDataDisplay() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        String sunucuVerisi = SunucuBaglanti.baglantiKurVeVerileriAl();
          SwingUtilities.invokeLater(() -> {
            // Veriyi Swing bileşenlerine yerleştir
      
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sunucu Veri Gösterme");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 400);
            frame.setLayout(new GridLayout(3, 5)); // 3 satır, 5 sütun

            JPanel[] kareler = new JPanel[KARE_SAYISI];
            for (int i = 0; i < KARE_SAYISI; i++) {
                kareler[i] = new JPanel();
                kareler[i].setBackground(Color.BLUE);
                frame.add(kareler[i]);
            }

            frame.setVisible(true);

            // Kimlik doğrulama bilgilerini al
            JTextField kullaniciAdiTextField = new JTextField("MESSTAJER");
            JPasswordField sifreField = new JPasswordField("12345");
            JButton girisButton = new JButton("Giris");

            JPanel kimlikDoğrulamaPaneli = new JPanel();
            kimlikDoğrulamaPaneli.setLayout(new FlowLayout());
            kimlikDoğrulamaPaneli.add(new JLabel("Kullanici Adi:"));
            kimlikDoğrulamaPaneli.add(kullaniciAdiTextField);
            kimlikDoğrulamaPaneli.add(new JLabel("Sifre:"));
            kimlikDoğrulamaPaneli.add(sifreField);
            kimlikDoğrulamaPaneli.add(girisButton);

            frame.add(kimlikDoğrulamaPaneli);

            // Kimlik doğrulama butonu tıklandığında sunucuya bağlantı ve veri alma başlasın
            girisButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String kullaniciAdi = kullaniciAdiTextField.getText();
                    String sifre = new String(sifreField.getPassword());

                    // Burada sunucu ile kimlik doğrulama yapabilirsiniz

                    // Kimlik doğrulama başarılı ise, veri alma ve güncelleme işlemini başlat
                    baslatVeriGuncelleme(kareler);
                }
            });
           });
        });
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoteServerDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoteServerDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoteServerDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoteServerDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoteServerDataDisplay().setVisible(true);
            }
        });
    }
    private static void baslatVeriGuncelleme(JPanel[] kareler) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {
                // Sunucudan yeni verileri al
                String[] yeniVeriler = yeniVerileriAl();

                // Verileri karelerde göster
                SwingUtilities.invokeLater(() -> {
                    for (int i = 0; i < KARE_SAYISI; i++) {
                        JLabel veriLabel = new JLabel(yeniVeriler[i]);
                        kareler[i].removeAll();
                        kareler[i].add(veriLabel);
                        kareler[i].revalidate();
                        kareler[i].repaint();
                    }
                });
            }
        }, 0, GUNCELLEME_ARALIGI);
    }
    private static String[] yeniVerileriAl() {
        // Sunucudan rastgele veri alıyormuş gibi simülasyon yapalım
        String[] veriler = new String[KARE_SAYISI];
        Random random = new Random();
        for (int i = 0; i < KARE_SAYISI; i++) {
            veriler[i] = "Veri " + random.nextInt(100);
        }
        return veriler;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
