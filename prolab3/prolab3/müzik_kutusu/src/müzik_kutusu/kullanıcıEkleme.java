/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package müzik_kutusu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static müzik_kutusu.KullaniciDeneme.myConn;
import static müzik_kutusu.KullaniciDeneme.myStat;

public class kullanıcıEkleme extends javax.swing.JFrame {

    
    
    public kullanıcıEkleme() {
  
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                initComponents();
            ResultSet myRs = mysql_baglanti.yap();
                try {
                    myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                    myStat = (Statement) myConn.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    myRs = myStat.executeQuery("SELECT ulke_ad FROM muzik.ulke");
                } catch (SQLException ex) {
                    Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
                }
        try {
            while (myRs.next()) {
                combobox_kullaniciulkekayıt.addItem(myRs.getNString("ulke_ad"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(kullanıcıEkleme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        veri_kullanicimail = new javax.swing.JTextField();
        veri_kullanicihesapturu = new javax.swing.JComboBox<>();
        veri_kullanicisifre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_kullanicikayıtol = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        veri_kullaniciid = new javax.swing.JTextField();
        combobox_kullaniciulkekayıt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        veri_kullaniciadi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        veri_kullanicimail.setText("Mail adresi girin");
        veri_kullanicimail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veri_kullanicimailActionPerformed(evt);
            }
        });

        veri_kullanicihesapturu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FREE", "PREMIUM" }));

        veri_kullanicisifre.setText("Sifre girin");

        jLabel6.setText("HESAP TURU :");

        btn_kullanicikayıtol.setText("KAYIT OL");
        btn_kullanicikayıtol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullanicikayıtolActionPerformed(evt);
            }
        });

        jLabel2.setText("KULLANICI ID :");

        jLabel7.setText("ULKE ID :");

        veri_kullaniciid.setText("Id numarası girin");
        veri_kullaniciid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veri_kullaniciidActionPerformed(evt);
            }
        });

        jLabel3.setText("KULLANICI ADI :");

        jLabel4.setText("MAIL :");

        jLabel5.setText("SIFRE :");

        veri_kullaniciadi.setText("Kullanıcı adı girin");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("KULLANICI KAYIT ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(veri_kullaniciid, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veri_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veri_kullanicimail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veri_kullanicisifre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_kullaniciulkekayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veri_kullanicihesapturu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kullanicikayıtol, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(veri_kullaniciid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(veri_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(veri_kullanicimail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(veri_kullanicisifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(combobox_kullaniciulkekayıt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veri_kullanicihesapturu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btn_kullanicikayıtol)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kullanicikayıtolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullanicikayıtolActionPerformed

            try {                                                     
                
                ResultSet myRs = mysql_baglanti.yap();
                try {
                    myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                    myStat = (Statement) myConn.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
                }
             
             
                String sql_sorgu = null;
                int ulke_id=combobox_kullaniciulkekayıt.getSelectedIndex();
                ulke_id++;
                boolean varMi = false;
                int odemeturu;
                if (veri_kullanicihesapturu.getSelectedItem().equals("FREE")) {
                    odemeturu = 0;
                } else {
                    odemeturu = 1;
                }

                myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici");              
                while (myRs.next()){
                    
                    if (myRs.getString("kullanici_id").equals(veri_kullaniciid.getText()) || myRs.getString("kullanici_mail").equals(veri_kullanicimail.getText())) {
                        
                        varMi=true;
                        
                    }
                    
                    
                }
                
                if(varMi==true){
                    JOptionPane.showMessageDialog(null, "Kullanıcı bilgileri var olduğundan kayıt yapılamıyor.");
                }
                else{
                    sql_sorgu = "INSERT INTO muzik.kullanici (kullanici_id,kullanici_ad,kullanici_mail,kullanici_sifre,id_ulke,odeme) VALUES (" + veri_kullaniciid.getText() + ",'" + veri_kullaniciadi.getText() + "'" + ",'" + veri_kullanicimail.getText() + "','" + veri_kullanicisifre.getText() + "'," + ulke_id +","+odemeturu+")";
                    
                    mysql_baglanti.ekle(sql_sorgu);
                    
                    JOptionPane.showMessageDialog(null, "Kullanıcı kaydı başarıyla yapılmıştır.");
                    this.setVisible(false);
                    jfKullDeneme kullDeneme =new jfKullDeneme();
                    kullDeneme.setVisible(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(kullanıcıEkleme.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btn_kullanicikayıtolActionPerformed

    private void veri_kullanicimailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veri_kullanicimailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veri_kullanicimailActionPerformed

    private void veri_kullaniciidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veri_kullaniciidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veri_kullaniciidActionPerformed

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(kullanıcıEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(kullanıcıEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(kullanıcıEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(kullanıcıEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new kullanıcıEkleme().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_kullanicikayıtol;
    private javax.swing.JComboBox<String> combobox_kullaniciulkekayıt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField veri_kullaniciadi;
    private javax.swing.JComboBox<String> veri_kullanicihesapturu;
    private javax.swing.JTextField veri_kullaniciid;
    private javax.swing.JTextField veri_kullanicimail;
    private javax.swing.JTextField veri_kullanicisifre;
    // End of variables declaration//GEN-END:variables
}
