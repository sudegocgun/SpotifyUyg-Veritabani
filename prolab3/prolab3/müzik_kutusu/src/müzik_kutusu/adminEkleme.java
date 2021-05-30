
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


public class adminEkleme extends javax.swing.JFrame {


    public adminEkleme() {
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
                comcocox_adminulkekayit.addItem(myRs.getNString("ulke_ad"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(kullanıcıEkleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_adminkayıtol = new javax.swing.JToggleButton();
        comcocox_adminulkekayit = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        veri_adminid = new javax.swing.JTextField();
        veri_adminad = new javax.swing.JTextField();
        veri_adminsifre = new javax.swing.JTextField();
        veri_adminmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        btn_adminkayıtol.setText("KAYIT OL");
        btn_adminkayıtol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminkayıtolActionPerformed(evt);
            }
        });

        jLabel2.setText("ADMIN ID :");

        jLabel3.setText("ADMIN AD :");

        jLabel4.setText("ADMIN MAIL :");

        jLabel5.setText("ŞİFRE :");

        jLabel6.setText("ÜKE İD :");

        veri_adminid.setText("Id numarası girin");

        veri_adminad.setText("Admin adı girin");

        veri_adminsifre.setText("Sifre girin");

        veri_adminmail.setText("Mail adresi girin");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("ADMİN KAYIT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(veri_adminid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(veri_adminsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(veri_adminad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(veri_adminmail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comcocox_adminulkekayit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btn_adminkayıtol, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(veri_adminid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(veri_adminad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(veri_adminmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(veri_adminsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(comcocox_adminulkekayit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btn_adminkayıtol)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminkayıtolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminkayıtolActionPerformed

        try {

            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql_sorgu = null;
            int ulke_id = comcocox_adminulkekayit.getSelectedIndex();
            ulke_id++;
            boolean varMi = false;

            myRs = myStat.executeQuery("SELECT * FROM muzik.admin");

            while (myRs.next()) {

                if (myRs.getString("admin_id").equals(veri_adminid.getText()) || myRs.getString("admin_mail").equals(veri_adminmail.getText())) {

                    varMi = true;

                }

            }

            if (varMi == true) {
                JOptionPane.showMessageDialog(null, "Admin bilgileri var olduğundan kayıt yapılamıyor.");
            } else {
                sql_sorgu = "INSERT INTO muzik.admin(admin_id,admin_ad,admin_mail,sifre,ulke) VALUES (" + veri_adminid.getText() + ",'" + veri_adminad.getText() + "'" + ",'" + veri_adminmail.getText() + "','" + veri_adminsifre.getText() + "'," + ulke_id + ")";

                mysql_baglanti.ekle(sql_sorgu);
                JOptionPane.showMessageDialog(null, "Admin kaydı başarıyla yapılmıştır.");
                this.setVisible(false);
                jfAdminDeneme adminDeneme = new jfAdminDeneme();
                adminDeneme.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kullanıcıEkleme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_adminkayıtolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_adminkayıtol;
    private javax.swing.JComboBox<String> comcocox_adminulkekayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField veri_adminad;
    private javax.swing.JTextField veri_adminid;
    private javax.swing.JTextField veri_adminmail;
    private javax.swing.JTextField veri_adminsifre;
    // End of variables declaration//GEN-END:variables
}
