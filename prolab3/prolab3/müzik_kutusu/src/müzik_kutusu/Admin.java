
package müzik_kutusu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    static Connection myConn;
    static Statement myStat;

    DefaultTableModel modelsarki = new DefaultTableModel();
    DefaultTableModel modelsanatci = new DefaultTableModel();
    DefaultTableModel modelalbum = new DefaultTableModel();
    DefaultTableModel modeliliski = new DefaultTableModel();

    Object[] kolonlarsarki = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure","id_album"};
    Object[] kolonlarsanatci = {"idsanatci", "sanatciADI", "sanatciSOYADI", "ulke"};
    Object[] kolonlaralbum = {"id_album", "album_tarih", "album_ad", "id_tur"};
    Object[] kolonlariliski = {"id_sanatci", "id_sarki", "id_album"};

    Object[] satirlarsarki = new Object[6];
    Object[] satirlarsanatci = new Object[4];
    Object[] satirlaralbum = new Object[4];
    Object[] satirlariliski = new Object[3];

    private JTable table;

    public Admin() {
        table = new JTable();
        modelsarki.setColumnIdentifiers(kolonlarsarki);
        table.setBounds(158, 219, 256, 123);
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblg_sarki = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblg_sanatci = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblg_iliskilendir = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblg_album = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnl_admin = new javax.swing.JTabbedPane();
        pnl_sarki = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_adminsarki = new javax.swing.JTable();
        btn_sarkilistele = new javax.swing.JButton();
        lbl_verisarkiadi = new javax.swing.JLabel();
        lbl_verisarkiid = new javax.swing.JLabel();
        lbl_veriturid = new javax.swing.JLabel();
        lbl_verids = new javax.swing.JLabel();
        lbl_verisure = new javax.swing.JLabel();
        btn_adminsarkiekle = new javax.swing.JButton();
        btn_adminsarkigüncelle = new javax.swing.JButton();
        btn_adminsarkisilme = new javax.swing.JButton();
        txt_sarkiid = new javax.swing.JTextField();
        txt_sarkiadi = new javax.swing.JTextField();
        txt_turid = new javax.swing.JTextField();
        txt_ds = new javax.swing.JTextField();
        txt_sure = new javax.swing.JTextField();
        txt_sarkialbumid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pnl_sanatci = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo_adminsanatci = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_sanatciid = new javax.swing.JTextField();
        txt_sanatciad = new javax.swing.JTextField();
        txt_sanatcisoyad = new javax.swing.JTextField();
        txt_sanatciulke = new javax.swing.JTextField();
        btn_adminsanatcilistele = new javax.swing.JButton();
        btn_adminsanatciguncelle = new javax.swing.JButton();
        btn_adminsanatciekle = new javax.swing.JButton();
        btn_adminsanatcisil = new javax.swing.JButton();
        pnl_album = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablo_adminalbum = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_albumid = new javax.swing.JTextField();
        txt_albumtarih = new javax.swing.JTextField();
        txt_albumtur = new javax.swing.JTextField();
        txt_albumadı = new javax.swing.JTextField();
        btn_albumlistele = new javax.swing.JButton();
        btn_albumekle = new javax.swing.JButton();
        btn_albumgüncelle = new javax.swing.JButton();
        btn_albumsil = new javax.swing.JButton();
        pnl_iliski = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablo_adminiliski = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_iliski_idsanatci = new javax.swing.JTextField();
        txt_iliski_idsarki = new javax.swing.JTextField();
        txt_iliski_idalbum = new javax.swing.JTextField();
        btn_iliskilistele = new javax.swing.JButton();
        btn_iliskiekle = new javax.swing.JButton();
        btn_iliskligüncelle = new javax.swing.JButton();
        btn_iliskisil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 860));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        lblg_sarki.setBackground(new java.awt.Color(255, 255, 255));
        lblg_sarki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblg_sarkiMouseClicked(evt);
            }
        });

        jLabel1.setText("  ŞARKI ");

        javax.swing.GroupLayout lblg_sarkiLayout = new javax.swing.GroupLayout(lblg_sarki);
        lblg_sarki.setLayout(lblg_sarkiLayout);
        lblg_sarkiLayout.setHorizontalGroup(
            lblg_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblg_sarkiLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblg_sarkiLayout.setVerticalGroup(
            lblg_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblg_sarkiLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );

        lblg_sanatci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblg_sanatciMouseClicked(evt);
            }
        });

        jLabel2.setText("SANATÇI");

        javax.swing.GroupLayout lblg_sanatciLayout = new javax.swing.GroupLayout(lblg_sanatci);
        lblg_sanatci.setLayout(lblg_sanatciLayout);
        lblg_sanatciLayout.setHorizontalGroup(
            lblg_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblg_sanatciLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        lblg_sanatciLayout.setVerticalGroup(
            lblg_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblg_sanatciLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lblg_iliskilendir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblg_iliskilendirMouseClicked(evt);
            }
        });

        jLabel4.setText("İLİŞKİLENDİR");

        javax.swing.GroupLayout lblg_iliskilendirLayout = new javax.swing.GroupLayout(lblg_iliskilendir);
        lblg_iliskilendir.setLayout(lblg_iliskilendirLayout);
        lblg_iliskilendirLayout.setHorizontalGroup(
            lblg_iliskilendirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblg_iliskilendirLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblg_iliskilendirLayout.setVerticalGroup(
            lblg_iliskilendirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblg_iliskilendirLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(50, 50, 50))
        );

        lblg_album.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblg_albumMouseClicked(evt);
            }
        });

        jLabel3.setText("ALBÜM");

        javax.swing.GroupLayout lblg_albumLayout = new javax.swing.GroupLayout(lblg_album);
        lblg_album.setLayout(lblg_albumLayout);
        lblg_albumLayout.setHorizontalGroup(
            lblg_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblg_albumLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblg_albumLayout.setVerticalGroup(
            lblg_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblg_albumLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblg_album, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblg_sarki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblg_sanatci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblg_iliskilendir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lblg_sarki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblg_sanatci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblg_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblg_iliskilendir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 860));

        pnl_sarki.setBackground(new java.awt.Color(255, 51, 102));

        tablo_adminsarki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ŞARKI_İD", "ŞARKI ADI", "TÜR İD", "DİNLEME SAYISI", "SÜRE", "ALBÜM ID"
            }
        ));
        tablo_adminsarki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_adminsarkiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_adminsarki);

        btn_sarkilistele.setText("ŞARKI LİSTELE");
        btn_sarkilistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sarkilisteleActionPerformed(evt);
            }
        });

        lbl_verisarkiadi.setText("ŞARKI ADI :");

        lbl_verisarkiid.setText("ŞARKI İD :");

        lbl_veriturid.setText("TÜR İD :");

        lbl_verids.setText("DİNLENME SAYISI");

        lbl_verisure.setText("ŞARKI SÜRESİ");

        btn_adminsarkiekle.setText("EKLE");
        btn_adminsarkiekle.setPreferredSize(new java.awt.Dimension(91, 25));
        btn_adminsarkiekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsarkiekleActionPerformed(evt);
            }
        });

        btn_adminsarkigüncelle.setText("GÜNCELLE");
        btn_adminsarkigüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsarkigüncelleActionPerformed(evt);
            }
        });

        btn_adminsarkisilme.setText("SİL");
        btn_adminsarkisilme.setMaximumSize(new java.awt.Dimension(91, 25));
        btn_adminsarkisilme.setMinimumSize(new java.awt.Dimension(91, 25));
        btn_adminsarkisilme.setPreferredSize(new java.awt.Dimension(91, 25));
        btn_adminsarkisilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsarkisilmeActionPerformed(evt);
            }
        });

        txt_ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dsActionPerformed(evt);
            }
        });

        jLabel16.setText("ALBÜM İD");

        javax.swing.GroupLayout pnl_sarkiLayout = new javax.swing.GroupLayout(pnl_sarki);
        pnl_sarki.setLayout(pnl_sarkiLayout);
        pnl_sarkiLayout.setHorizontalGroup(
            pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sarkiLayout.createSequentialGroup()
                .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_sarkiLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_sarkiLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btn_sarkilistele))
                    .addGroup(pnl_sarkiLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_verisarkiadi)
                            .addComponent(lbl_verisarkiid)
                            .addComponent(lbl_veriturid)
                            .addComponent(lbl_verids)
                            .addComponent(lbl_verisure)
                            .addComponent(jLabel16))
                        .addGap(89, 89, 89)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_sarkiadi)
                                .addComponent(txt_turid)
                                .addComponent(txt_ds)
                                .addComponent(txt_sure)
                                .addComponent(txt_sarkialbumid, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addComponent(txt_sarkiid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_adminsarkiekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adminsarkigüncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(btn_adminsarkisilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnl_sarkiLayout.setVerticalGroup(
            pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sarkiLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sarkilistele)
                .addGap(55, 55, 55)
                .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_verisarkiid)
                    .addComponent(btn_adminsarkiekle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sarkiid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_sarkiLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_veriturid)
                            .addComponent(txt_turid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_verids)
                            .addComponent(txt_ds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_verisure)
                            .addComponent(txt_sure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_sarkiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_verisarkiadi)
                            .addComponent(txt_sarkiadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(btn_adminsarkigüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnl_sarkiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sarkialbumid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adminsarkisilme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        pnl_admin.addTab("1", pnl_sarki);

        pnl_sanatci.setBackground(new java.awt.Color(255, 255, 51));

        tablo_adminsanatci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SANATCI İD", "SANATCI ADI", "SANATCI SOYADI", "ULKE"
            }
        ));
        tablo_adminsanatci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_adminsanatciMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablo_adminsanatci);

        jLabel5.setText("SANATÇI İD :");

        jLabel7.setText("SANATÇI ADI :");

        jLabel9.setText("SANATÇI SOYADI :");

        jLabel11.setText("SANATÇI ÜLKESİ :");

        txt_sanatcisoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sanatcisoyadActionPerformed(evt);
            }
        });

        btn_adminsanatcilistele.setText("SANATCİ LİSTELE");
        btn_adminsanatcilistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsanatcilisteleActionPerformed(evt);
            }
        });

        btn_adminsanatciguncelle.setText("GÜNCELLE");
        btn_adminsanatciguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsanatciguncelleActionPerformed(evt);
            }
        });

        btn_adminsanatciekle.setText("EKLE");
        btn_adminsanatciekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsanatciekleActionPerformed(evt);
            }
        });

        btn_adminsanatcisil.setText("SİL");
        btn_adminsanatcisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsanatcisilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_sanatciLayout = new javax.swing.GroupLayout(pnl_sanatci);
        pnl_sanatci.setLayout(pnl_sanatciLayout);
        pnl_sanatciLayout.setHorizontalGroup(
            pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sanatciLayout.createSequentialGroup()
                .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_sanatciLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sanatciad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sanatciid, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sanatcisoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sanatciulke, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_adminsanatcisil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adminsanatciekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adminsanatciguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addGroup(pnl_sanatciLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_sanatciLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(btn_adminsanatcilistele)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        pnl_sanatciLayout.setVerticalGroup(
            pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sanatciLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_adminsanatcilistele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sanatciid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btn_adminsanatciekle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_sanatciad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btn_adminsanatciguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_sanatcisoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnl_sanatciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_sanatciulke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adminsanatcisil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        pnl_admin.addTab("2", pnl_sanatci);

        pnl_album.setBackground(new java.awt.Color(51, 153, 255));

        tablo_adminalbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablo_adminalbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_adminalbumMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablo_adminalbum);

        jLabel6.setText("ALBUM İD :");

        jLabel8.setText("ALBÜM TARİHİ :");

        jLabel10.setText("ALBÜM TÜRÜ :");

        jLabel12.setText("ALBUM ADI :");

        btn_albumlistele.setText("ALBUM LİSTELE");
        btn_albumlistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_albumlisteleActionPerformed(evt);
            }
        });

        btn_albumekle.setText("EKLE");
        btn_albumekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_albumekleActionPerformed(evt);
            }
        });

        btn_albumgüncelle.setText("GÜNCELLE");
        btn_albumgüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_albumgüncelleActionPerformed(evt);
            }
        });

        btn_albumsil.setText("SİL");
        btn_albumsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_albumsilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_albumLayout = new javax.swing.GroupLayout(pnl_album);
        pnl_album.setLayout(pnl_albumLayout);
        pnl_albumLayout.setHorizontalGroup(
            pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_albumLayout.createSequentialGroup()
                .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_albumLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_albumLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btn_albumlistele))
                    .addGroup(pnl_albumLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(88, 88, 88)
                        .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_albumtur, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txt_albumtarih))
                                .addComponent(txt_albumadı, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_albumid, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134)
                        .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_albumgüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_albumsil, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_albumekle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        pnl_albumLayout.setVerticalGroup(
            pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_albumLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_albumlistele)
                .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_albumLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_albumid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(pnl_albumLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btn_albumekle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_albumtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btn_albumgüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_albumtur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(45, 45, 45)
                .addGroup(pnl_albumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_albumadı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_albumsil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pnl_admin.addTab("3", pnl_album);

        pnl_iliski.setBackground(new java.awt.Color(255, 255, 153));

        tablo_adminiliski.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablo_adminiliski.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_adminiliskiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablo_adminiliski);

        jLabel13.setText("SANATÇI İD :");

        jLabel14.setText("ŞARKI İD :");

        jLabel15.setText("ALBÜM İD :");

        btn_iliskilistele.setText("İLİSKİ LİSTELE");
        btn_iliskilistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iliskilisteleActionPerformed(evt);
            }
        });

        btn_iliskiekle.setText("EKLE");
        btn_iliskiekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iliskiekleActionPerformed(evt);
            }
        });

        btn_iliskligüncelle.setText("GÜNCELLE");
        btn_iliskligüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iliskligüncelleActionPerformed(evt);
            }
        });

        btn_iliskisil.setText("SİL");
        btn_iliskisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iliskisilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_iliskiLayout = new javax.swing.GroupLayout(pnl_iliski);
        pnl_iliski.setLayout(pnl_iliskiLayout);
        pnl_iliskiLayout.setHorizontalGroup(
            pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_iliskiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(90, 90, 90)
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_iliski_idsanatci, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_iliski_idalbum, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_iliski_idsarki, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_iliskligüncelle)
                    .addComponent(btn_iliskiekle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iliskisil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
            .addGroup(pnl_iliskiLayout.createSequentialGroup()
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_iliskiLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_iliskiLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btn_iliskilistele)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_iliskiLayout.setVerticalGroup(
            pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_iliskiLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_iliskilistele)
                .addGap(89, 89, 89)
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_iliski_idsanatci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iliskiekle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_iliski_idsarki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iliskligüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(pnl_iliskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_iliski_idalbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iliskisil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pnl_admin.addTab("4", pnl_iliski);

        getContentPane().add(pnl_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 850, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblg_sarkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblg_sarkiMouseClicked
        pnl_admin.setSelectedIndex(0);
    }//GEN-LAST:event_lblg_sarkiMouseClicked

    private void lblg_sanatciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblg_sanatciMouseClicked
        pnl_admin.setSelectedIndex(1);
    }//GEN-LAST:event_lblg_sanatciMouseClicked

    private void lblg_albumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblg_albumMouseClicked
        pnl_admin.setSelectedIndex(2);
    }//GEN-LAST:event_lblg_albumMouseClicked

    private void lblg_iliskilendirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblg_iliskilendirMouseClicked
        pnl_admin.setSelectedIndex(3);
    }//GEN-LAST:event_lblg_iliskilendirMouseClicked

    private void btn_sarkilisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sarkilisteleActionPerformed
        modelsarki.setRowCount(0);
       
        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sarki");
            modelsarki.setColumnIdentifiers(kolonlarsarki);
            while (myRs.next()) {

                try {
                    satirlarsarki[0] = myRs.getString("id_sarki");
                    satirlarsarki[1] = myRs.getString("sarki_ad");
                    satirlarsarki[2] = myRs.getString("id_tur");
                    satirlarsarki[3] = myRs.getString("d_sayi");
                    satirlarsarki[4] = myRs.getString("sure");
                    satirlarsarki[5] = myRs.getString("id_album"); 
                    modelsarki.addRow(satirlarsarki);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_adminsarki.setModel(modelsarki);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_sarkilisteleActionPerformed

    private void btn_adminsarkiekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsarkiekleActionPerformed

        String sql_sorgu = null;
        sql_sorgu = "INSERT INTO muzik.sarki (id_sarki,sarki_ad,id_tur,d_sayi,sure,id_album) VALUES (" + txt_sarkiid.getText() + ",'" + txt_sarkiadi.getText() + "'" + "," + txt_turid.getText() + "," + txt_ds.getText() + "," + txt_sure.getText() +","+txt_sarkialbumid.getText()+ ")";

        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.ekle(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_adminsarkiekleActionPerformed

    private void btn_adminsarkigüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsarkigüncelleActionPerformed
        String sql_sorgu = null;

        sql_sorgu = "UPDATE muzik.sarki SET sarki_ad='" + txt_sarkiadi.getText() + "'" + ",id_tur=" + txt_turid.getText() + ",d_sayi=" + txt_ds.getText() + ",sure=" + txt_sure.getText()+",id_album="+txt_sarkialbumid.getText() + " WHERE id_sarki=" + txt_sarkiid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_adminsarkigüncelleActionPerformed

    private void btn_adminsarkisilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsarkisilmeActionPerformed

        String sql_sorgu = null;

        sql_sorgu = "DELETE FROM muzik.sarki WHERE id_sarki=" + txt_sarkiid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.sil(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_adminsarkisilmeActionPerformed

    private void tablo_adminsarkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_adminsarkiMouseClicked
        txt_sarkiid.setText((String) tablo_adminsarki.getModel().getValueAt(tablo_adminsarki.getSelectedRow(), 0));
        txt_sarkiadi.setText((String) tablo_adminsarki.getModel().getValueAt(tablo_adminsarki.getSelectedRow(), 1));
        txt_turid.setText(((String) tablo_adminsarki.getModel().getValueAt(tablo_adminsarki.getSelectedRow(), 2)));
        txt_ds.setText((String) tablo_adminsarki.getModel().getValueAt(tablo_adminsarki.getSelectedRow(), 3));
        txt_sure.setText((String) tablo_adminsarki.getModel().getValueAt(tablo_adminsarki.getSelectedRow(), 4));
        txt_sarkialbumid.setText((String) tablo_adminsarki.getModel().getValueAt(tablo_adminsarki.getSelectedRow(), 5));
    }//GEN-LAST:event_tablo_adminsarkiMouseClicked

    private void tablo_adminsanatciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_adminsanatciMouseClicked
        txt_sanatciid.setText((String) tablo_adminsanatci.getModel().getValueAt(tablo_adminsanatci.getSelectedRow(), 0));
        txt_sanatciad.setText((String) tablo_adminsanatci.getModel().getValueAt(tablo_adminsanatci.getSelectedRow(), 1));
        txt_sanatcisoyad.setText(((String) tablo_adminsanatci.getModel().getValueAt(tablo_adminsanatci.getSelectedRow(), 2)));
        txt_sanatciulke.setText((String) tablo_adminsanatci.getModel().getValueAt(tablo_adminsanatci.getSelectedRow(), 3));
    }//GEN-LAST:event_tablo_adminsanatciMouseClicked

    private void btn_adminsanatcilisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsanatcilisteleActionPerformed

        modelsanatci.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sanatci");
            modelsanatci.setColumnIdentifiers(kolonlarsanatci);
            while (myRs.next()) {

                try {
                    satirlarsanatci[0] = myRs.getString("idsanatci");
                    satirlarsanatci[1] = myRs.getString("sanatciADI");
                    satirlarsanatci[2] = myRs.getString("sanatciSOYADI");
                    satirlarsanatci[3] = myRs.getString("ulke");
                    modelsanatci.addRow(satirlarsanatci);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_adminsanatci.setModel(modelsanatci);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_adminsanatcilisteleActionPerformed

    private void btn_adminsanatciekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsanatciekleActionPerformed

        String sql_sorgu = null;
        sql_sorgu = "INSERT INTO muzik.sanatci (idsanatci,sanatciADI,sanatciSOYADI,ulke) VALUES (" + txt_sanatciid.getText() + ",'" + txt_sanatciad.getText() + "'" + ",'" + txt_sanatcisoyad.getText() + "'," + txt_sanatciulke.getText() + ")";

        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.ekle(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_adminsanatciekleActionPerformed

    private void btn_adminsanatciguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsanatciguncelleActionPerformed

        String sql_sorgu = null;

        sql_sorgu = "UPDATE muzik.sanatci SET idsanatci=" + txt_sanatciid.getText() + ",sanatciADI='" + txt_sanatciad.getText() + "',sanatciSOYADI='" + txt_sanatcisoyad.getText() + "',ulke=" + txt_sanatciulke.getText() + " WHERE idsanatci=" + txt_sanatciid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_adminsanatciguncelleActionPerformed

    private void btn_adminsanatcisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsanatcisilActionPerformed
        String sql_sorgu = null;

        sql_sorgu = "DELETE FROM muzik.sanatci WHERE idsanatci=" + txt_sanatciid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.sil(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_adminsanatcisilActionPerformed

    private void btn_albumlisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_albumlisteleActionPerformed

        modelalbum.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.album");
            modelalbum.setColumnIdentifiers(kolonlaralbum);
            while (myRs.next()) {

                try {
                    satirlaralbum[0] = myRs.getString("id_album");
                    satirlaralbum[1] = myRs.getString("album_tarih");
                    satirlaralbum[2] = myRs.getString("album_ad");
                    satirlaralbum[3] = myRs.getString("id_tur");
                    modelalbum.addRow(satirlaralbum);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_adminalbum.setModel(modelalbum);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_albumlisteleActionPerformed

    private void btn_albumekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_albumekleActionPerformed
        String sql_sorgu = null;
        sql_sorgu = "INSERT INTO muzik.album (id_album,album_tarih,album_ad,id_tur) VALUES (" + txt_albumid.getText() + ",'" + txt_albumtarih.getText() + "'" + ",'" + txt_albumadı.getText() + "'," + txt_albumtur.getText() + ")";

        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.ekle(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_albumekleActionPerformed

    private void tablo_adminalbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_adminalbumMouseClicked

        txt_albumid.setText((String) tablo_adminalbum.getModel().getValueAt(tablo_adminalbum.getSelectedRow(), 0));
        txt_albumtarih.setText((String) tablo_adminalbum.getModel().getValueAt(tablo_adminalbum.getSelectedRow(), 1));
        txt_albumadı.setText(((String) tablo_adminalbum.getModel().getValueAt(tablo_adminalbum.getSelectedRow(), 2)));
        txt_albumtur.setText((String) tablo_adminalbum.getModel().getValueAt(tablo_adminalbum.getSelectedRow(), 3));

    }//GEN-LAST:event_tablo_adminalbumMouseClicked

    private void btn_albumgüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_albumgüncelleActionPerformed
        String sql_sorgu = null;

        sql_sorgu = "UPDATE muzik.album SET id_album=" + txt_albumid.getText() + ",album_tarih='" + txt_albumtarih.getText() + "',album_ad='" + txt_albumadı.getText() + "',id_tur=" + txt_albumtur.getText() + " WHERE id_album=" + txt_albumid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_albumgüncelleActionPerformed

    private void btn_albumsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_albumsilActionPerformed

        String sql_sorgu = null;

        sql_sorgu = "DELETE FROM muzik.album WHERE id_album=" + txt_albumid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.sil(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_albumsilActionPerformed

    private void tablo_adminiliskiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_adminiliskiMouseClicked

        txt_iliski_idsanatci.setText((String) tablo_adminiliski.getModel().getValueAt(tablo_adminiliski.getSelectedRow(), 0));
        txt_iliski_idsarki.setText((String) tablo_adminiliski.getModel().getValueAt(tablo_adminiliski.getSelectedRow(), 1));
        txt_iliski_idalbum.setText(((String) tablo_adminiliski.getModel().getValueAt(tablo_adminiliski.getSelectedRow(), 2)));

    }//GEN-LAST:event_tablo_adminiliskiMouseClicked

    private void btn_iliskilisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iliskilisteleActionPerformed

        modeliliski.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sanatci_sarki");
            modeliliski.setColumnIdentifiers(kolonlariliski);
            while (myRs.next()) {

                try {
                    satirlariliski[0] = myRs.getString("id_sanatci");
                    satirlariliski[1] = myRs.getString("id_sarki");
                    satirlariliski[2] = myRs.getString("id_album");

                    modeliliski.addRow(satirlariliski);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_adminiliski.setModel(modeliliski);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_iliskilisteleActionPerformed

    private void btn_iliskiekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iliskiekleActionPerformed

        String sql_sorgu = null;
        sql_sorgu = "INSERT INTO muzik.sanatci_sarki (id_sanatci,id_sarki,id_album) VALUES (" + txt_iliski_idsanatci.getText() + "," + txt_iliski_idsarki.getText() + "," + txt_iliski_idalbum.getText() + ")";

        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.ekle(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_iliskiekleActionPerformed

    private void btn_iliskligüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iliskligüncelleActionPerformed
       String sql_sorgu = null;

        sql_sorgu = "UPDATE muzik.sanatci_sarki SET id_sanatci=" + txt_iliski_idsanatci.getText() + ",id_sarki=" + txt_iliski_idsarki.getText() + ",id_album=" + txt_iliski_idalbum.getText() + " WHERE id_sanatci=" + txt_iliski_idsanatci.getText()+" AND id_sarki="+txt_iliski_idsarki.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_iliskligüncelleActionPerformed

    private void btn_iliskisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iliskisilActionPerformed
        String sql_sorgu = null;

        sql_sorgu = "DELETE FROM muzik.sanatci_sarki WHERE id_sanatci=" + txt_iliski_idsanatci.getText()+" AND id_sarki="+txt_iliski_idsarki.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.sil(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_iliskisilActionPerformed

    private void txt_dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dsActionPerformed

    private void txt_sanatcisoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sanatcisoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sanatcisoyadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adminsanatciekle;
    private javax.swing.JButton btn_adminsanatciguncelle;
    private javax.swing.JButton btn_adminsanatcilistele;
    private javax.swing.JButton btn_adminsanatcisil;
    private javax.swing.JButton btn_adminsarkiekle;
    private javax.swing.JButton btn_adminsarkigüncelle;
    private javax.swing.JButton btn_adminsarkisilme;
    private javax.swing.JButton btn_albumekle;
    private javax.swing.JButton btn_albumgüncelle;
    private javax.swing.JButton btn_albumlistele;
    private javax.swing.JButton btn_albumsil;
    private javax.swing.JButton btn_iliskiekle;
    private javax.swing.JButton btn_iliskilistele;
    private javax.swing.JButton btn_iliskisil;
    private javax.swing.JButton btn_iliskligüncelle;
    private javax.swing.JButton btn_sarkilistele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_verids;
    private javax.swing.JLabel lbl_verisarkiadi;
    private javax.swing.JLabel lbl_verisarkiid;
    private javax.swing.JLabel lbl_verisure;
    private javax.swing.JLabel lbl_veriturid;
    private javax.swing.JPanel lblg_album;
    private javax.swing.JPanel lblg_iliskilendir;
    private javax.swing.JPanel lblg_sanatci;
    private javax.swing.JPanel lblg_sarki;
    private javax.swing.JTabbedPane pnl_admin;
    private javax.swing.JPanel pnl_album;
    private javax.swing.JPanel pnl_iliski;
    private javax.swing.JPanel pnl_sanatci;
    private javax.swing.JPanel pnl_sarki;
    private javax.swing.JTable tablo_adminalbum;
    private javax.swing.JTable tablo_adminiliski;
    private javax.swing.JTable tablo_adminsanatci;
    private javax.swing.JTable tablo_adminsarki;
    private javax.swing.JTextField txt_albumadı;
    private javax.swing.JTextField txt_albumid;
    private javax.swing.JTextField txt_albumtarih;
    private javax.swing.JTextField txt_albumtur;
    private javax.swing.JTextField txt_ds;
    private javax.swing.JTextField txt_iliski_idalbum;
    private javax.swing.JTextField txt_iliski_idsanatci;
    private javax.swing.JTextField txt_iliski_idsarki;
    private javax.swing.JTextField txt_sanatciad;
    private javax.swing.JTextField txt_sanatciid;
    private javax.swing.JTextField txt_sanatcisoyad;
    private javax.swing.JTextField txt_sanatciulke;
    private javax.swing.JTextField txt_sarkiadi;
    private javax.swing.JTextField txt_sarkialbumid;
    private javax.swing.JTextField txt_sarkiid;
    private javax.swing.JTextField txt_sure;
    private javax.swing.JTextField txt_turid;
    // End of variables declaration//GEN-END:variables
}
