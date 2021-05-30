
package müzik_kutusu;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static müzik_kutusu.Admin.myConn;


public class KullaniciDeneme extends javax.swing.JFrame {

    static Connection myConn;
    static Statement myStat;

    DefaultTableModel modelpoptop = new DefaultTableModel();
    DefaultTableModel modeljazztop = new DefaultTableModel();
    DefaultTableModel modelklasiktop = new DefaultTableModel();
    DefaultTableModel modelgeneltop = new DefaultTableModel();
    DefaultTableModel modelulketop = new DefaultTableModel();
    DefaultTableModel modelkullaniciliste = new DefaultTableModel();
    DefaultTableModel modeltakipe = new DefaultTableModel();
    DefaultTableModel modelpoptakipe = new DefaultTableModel();
    DefaultTableModel modeljazztakipe = new DefaultTableModel();
    DefaultTableModel modelklasiktakipe = new DefaultTableModel();
    DefaultTableModel modellistepop = new DefaultTableModel();
    DefaultTableModel modellistejazz = new DefaultTableModel();
    DefaultTableModel modellisteklasik = new DefaultTableModel();

    Object[] kolonlarpoptop = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarjazztop = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarklasiktop = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlargeneltop = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarulketop = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarukullaniciliste = {"kullanici adi", "KULLANICI ID", "HESAP TURU"};
    Object[] kolonlartakipe = {"takipedilen id", "takip edilen adı"};
    Object[] kolonlarpoptakipe = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarjazztakipe = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarklasiktakipe = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarlistepop = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarlistejazz = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};
    Object[] kolonlarlisteklasik = {"id_sarki", "sarki_ad", "id_tur", "d_sayi", "sure"};

    Object[] satirlarpoptop = new Object[5];
    Object[] satirlarjazztop = new Object[5];
    Object[] satirlarklasiktop = new Object[5];
    Object[] satirlargeneltop = new Object[5];
    Object[] satirlarulketop = new Object[5];
    Object[] satirlarkullaniciliste = new Object[3];
    Object[] satirlartakipe = new Object[2];
    Object[] satirlarpoptakipe = new Object[5];
    Object[] satirlarjazztakipe = new Object[5];
    Object[] satirlarklasiktakipe = new Object[5];
    Object[] satirlarlistepop = new Object[5];
    Object[] satirlarlistejazz = new Object[5];
    Object[] satirlarlisteklasik = new Object[5];

    public KullaniciDeneme() {
        try {
            initComponents();
            String kullaniciadi = null;
            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            String kullanici_mail = jfKullDeneme.email;
            try {
                myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (myRs.next()) {
                    kullaniciadi = myRs.getString("kullanici_ad");
                }
                anasayfaad.setText(kullaniciadi);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_ad='" + kullaniciadi + "'");
            while (myRs.next()) {

                if (myRs.getString("odeme").equals("0")) {
                    lbl_hesaptürüfp.setText("FREE");
                } else {
                    lbl_hesaptürüfp.setText("PREMİUM");
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlg_anasayfa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlg_top10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlg_takipci = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlg_çalmalisteleri = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_hesaptürüfp = new javax.swing.JLabel();
        lbl_hesapturu = new javax.swing.JLabel();
        pnlg_kullanicilar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tabbedpnl = new javax.swing.JTabbedPane();
        pnl_anasayfa = new javax.swing.JPanel();
        anasayfaad = new javax.swing.JLabel();
        lbl_anasayfa = new javax.swing.JLabel();
        pnl_top10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo10_pop = new javax.swing.JTable();
        lbl_top10genel = new javax.swing.JLabel();
        lbl_top10pop = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo10_genel = new javax.swing.JTable();
        lbl_top10jazz = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablo10_ulke = new javax.swing.JTable();
        lbl_top10klasik = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablo10_jazz = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lbl_verisarkiid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_verisarkiad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_verisarkiturid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_verisarki_dsayi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_verisarkisure = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btn_calmalistesinekle = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablo10_klasik = new javax.swing.JTable();
        lbl_top10ulke = new javax.swing.JLabel();
        btn_top10listele = new javax.swing.JButton();
        btn_top10sarkidinle = new javax.swing.JButton();
        pnl_kullanicilar = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablo_kullanicilistesi = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btn_kullanicilistele = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        veri_kullaniciadi = new javax.swing.JLabel();
        veri_kullaniciid = new javax.swing.JLabel();
        btn_takipet = new javax.swing.JToggleButton();
        pnl_takipe = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablo_takipe = new javax.swing.JTable();
        btn_takipelistele = new javax.swing.JToggleButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablo_takipepop = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablo_takipejazz = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablo_takipeklasik = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_takipe_calmalisteekle = new javax.swing.JToggleButton();
        lbl_takipeturid = new javax.swing.JLabel();
        lbl_takipesarkiid = new javax.swing.JLabel();
        btn_takipesarkidinle = new javax.swing.JButton();
        lbl_takipedsayi = new javax.swing.JLabel();
        pnl_calmalisteleri = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablo_calmalisteleripop = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablo_calmalistelerijazz = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablo_calmalisteleriklasik = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        veri_listesarkiid = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        veri_listesarkiad = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        veri_listeturid = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        veri_listedsayi = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        veri_listesure = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_calmalistesil = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        pnlg_anasayfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlg_anasayfaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("ANASAYFA");

        javax.swing.GroupLayout pnlg_anasayfaLayout = new javax.swing.GroupLayout(pnlg_anasayfa);
        pnlg_anasayfa.setLayout(pnlg_anasayfaLayout);
        pnlg_anasayfaLayout.setHorizontalGroup(
            pnlg_anasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlg_anasayfaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
        );
        pnlg_anasayfaLayout.setVerticalGroup(
            pnlg_anasayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_anasayfaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlg_top10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlg_top10MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("TOP LİST");

        javax.swing.GroupLayout pnlg_top10Layout = new javax.swing.GroupLayout(pnlg_top10);
        pnlg_top10.setLayout(pnlg_top10Layout);
        pnlg_top10Layout.setHorizontalGroup(
            pnlg_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlg_top10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        );
        pnlg_top10Layout.setVerticalGroup(
            pnlg_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_top10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnlg_takipci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlg_takipciMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("TAKİP EDİLEN");

        javax.swing.GroupLayout pnlg_takipciLayout = new javax.swing.GroupLayout(pnlg_takipci);
        pnlg_takipci.setLayout(pnlg_takipciLayout);
        pnlg_takipciLayout.setHorizontalGroup(
            pnlg_takipciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_takipciLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlg_takipciLayout.setVerticalGroup(
            pnlg_takipciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_takipciLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlg_çalmalisteleri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlg_çalmalisteleriMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Çalma Listeleri");

        javax.swing.GroupLayout pnlg_çalmalisteleriLayout = new javax.swing.GroupLayout(pnlg_çalmalisteleri);
        pnlg_çalmalisteleri.setLayout(pnlg_çalmalisteleriLayout);
        pnlg_çalmalisteleriLayout.setHorizontalGroup(
            pnlg_çalmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_çalmalisteleriLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlg_çalmalisteleriLayout.setVerticalGroup(
            pnlg_çalmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_çalmalisteleriLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        lbl_hesaptürüfp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_hesaptürüfp.setForeground(new java.awt.Color(255, 204, 153));

        lbl_hesapturu.setBackground(new java.awt.Color(255, 255, 255));
        lbl_hesapturu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_hesapturu.setForeground(new java.awt.Color(255, 204, 153));
        lbl_hesapturu.setText("HESAP TÜRÜ :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_hesaptürüfp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hesapturu))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_hesapturu)
                .addGap(18, 18, 18)
                .addComponent(lbl_hesaptürüfp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlg_kullanicilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlg_kullanicilarMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("KULLANICILAR");

        javax.swing.GroupLayout pnlg_kullanicilarLayout = new javax.swing.GroupLayout(pnlg_kullanicilar);
        pnlg_kullanicilar.setLayout(pnlg_kullanicilarLayout);
        pnlg_kullanicilarLayout.setHorizontalGroup(
            pnlg_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlg_kullanicilarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlg_kullanicilarLayout.setVerticalGroup(
            pnlg_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlg_kullanicilarLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlg_anasayfa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlg_top10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlg_takipci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlg_çalmalisteleri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlg_kullanicilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(pnlg_anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pnlg_top10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(pnlg_kullanicilar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pnlg_takipci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(pnlg_çalmalisteleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 860));

        pnl_anasayfa.setBackground(new java.awt.Color(255, 255, 255));
        pnl_anasayfa.setLayout(null);

        anasayfaad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        anasayfaad.setText("jLabel29");
        pnl_anasayfa.add(anasayfaad);
        anasayfaad.setBounds(410, 700, 200, 50);

        lbl_anasayfa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2021-05-18 at 16.02.29.jpeg"))); // NOI18N
        pnl_anasayfa.add(lbl_anasayfa);
        lbl_anasayfa.setBounds(0, -40, 900, 940);

        tabbedpnl.addTab("tab1", pnl_anasayfa);

        pnl_top10.setBackground(new java.awt.Color(102, 102, 102));

        tablo10_pop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ŞARKI İSMİ", "SANATÇI", "ALBÜM", "TÜR", "ÜLKE"
            }
        ));
        tablo10_pop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo10_popMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo10_pop);

        lbl_top10genel.setText("TOP 10 GENEL");

        lbl_top10pop.setText("TOP 10 POP");

        tablo10_genel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ŞARKI İSMİ", "SANATÇI", "ALBÜM", "TÜR", "ÜLKE"
            }
        ));
        tablo10_genel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo10_genelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablo10_genel);

        lbl_top10jazz.setText("TOP 10 JAZZ");

        tablo10_ulke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ŞARKI İSMİ", "SANATÇI", "ALBÜM", "TÜR", "ÜLKE"
            }
        ));
        tablo10_ulke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo10_ulkeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablo10_ulke);

        lbl_top10klasik.setText("TOP 10 KLASİK");

        tablo10_jazz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ŞARKI İSMİ", "SANATÇI", "ALBÜM", "TÜR", "ÜLKE"
            }
        ));
        tablo10_jazz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo10_jazzMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablo10_jazz);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("ŞARKI ID :");

        lbl_verisarkiid.setBackground(new java.awt.Color(204, 255, 204));
        lbl_verisarkiid.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("ŞARKI AD :");

        lbl_verisarkiad.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("TUR ID :");

        lbl_verisarkiturid.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("DİNLENME SAYISI :");

        lbl_verisarki_dsayi.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("SÜRE :");

        lbl_verisarkisure.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setText("ÜLKEYE GÖRE TOP 10 GÖRMEK İÇİN ÜLKE SEÇİN");

        btn_calmalistesinekle.setText("ÇALMA LİSTESİNE EKLE");
        btn_calmalistesinekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_calmalistesinekleMouseClicked(evt);
            }
        });
        btn_calmalistesinekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calmalistesinekleActionPerformed(evt);
            }
        });

        tablo10_klasik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ŞARKI İSMİ", "SANATÇI", "ALBÜM", "TÜR", "ÜLKE"
            }
        ));
        tablo10_klasik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo10_klasikMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablo10_klasik);

        lbl_top10ulke.setText("TOP 10 ÜLKELERE GÖRE");

        btn_top10listele.setText("TOP 10 LİSTELE");
        btn_top10listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_top10listeleActionPerformed(evt);
            }
        });

        btn_top10sarkidinle.setText("ŞARKIYI DİNLE");
        btn_top10sarkidinle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_top10sarkidinleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_top10Layout = new javax.swing.GroupLayout(pnl_top10);
        pnl_top10.setLayout(pnl_top10Layout);
        pnl_top10Layout.setHorizontalGroup(
            pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_top10Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(lbl_top10genel)
                .addGap(0, 648, Short.MAX_VALUE))
            .addGroup(pnl_top10Layout.createSequentialGroup()
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(lbl_top10klasik))
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(lbl_top10ulke)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_top10Layout.createSequentialGroup()
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_top10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(pnl_top10Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(lbl_top10pop))
                            .addGroup(pnl_top10Layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(lbl_top10jazz)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane3))))
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_top10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_top10Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_verisarki_dsayi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_top10Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(106, 106, 106)
                                        .addComponent(lbl_verisarkisure, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_top10Layout.createSequentialGroup()
                                        .addComponent(btn_calmalistesinekle)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_top10sarkidinle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_top10Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(81, 81, 81)
                                        .addComponent(lbl_verisarkiturid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_top10Layout.createSequentialGroup()
                                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(45, 45, 45)
                                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_verisarkiid, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_verisarkiad, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pnl_top10Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btn_top10listele)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_top10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106))))
        );
        pnl_top10Layout.setVerticalGroup(
            pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_top10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_top10genel)
                .addGap(8, 8, 8)
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_top10Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_top10pop, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_top10Layout.createSequentialGroup()
                        .addComponent(btn_top10listele)
                        .addGap(53, 53, 53)
                        .addComponent(lbl_verisarkiid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_top10jazz, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lbl_verisarkiad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(lbl_verisarkiturid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_verisarki_dsayi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(lbl_verisarkisure, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_top10klasik)
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_top10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_calmalistesinekle)
                            .addComponent(btn_top10sarkidinle))
                        .addGap(74, 74, 74)))
                .addGroup(pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addComponent(lbl_top10ulke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_top10Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );

        tabbedpnl.addTab("tab2", pnl_top10);

        pnl_kullanicilar.setBackground(new java.awt.Color(255, 204, 204));

        tablo_kullanicilistesi.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_kullanicilistesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_kullanicilistesiMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablo_kullanicilistesi);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("KULLANICI LİSTESİ");

        btn_kullanicilistele.setText("LİSTELE");
        btn_kullanicilistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullanicilisteleActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 102));
        jLabel15.setText("KULLANICI ADI :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 102));
        jLabel16.setText("KULLANICI ID :");

        veri_kullaniciadi.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        veri_kullaniciid.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        btn_takipet.setText("TAKİP ET");
        btn_takipet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takipetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_kullanicilarLayout = new javax.swing.GroupLayout(pnl_kullanicilar);
        pnl_kullanicilar.setLayout(pnl_kullanicilarLayout);
        pnl_kullanicilarLayout.setHorizontalGroup(
            pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                .addGroup(pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                            .addGap(488, 488, 488)
                            .addComponent(veri_kullaniciid, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_kullanicilarLayout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addGroup(pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(74, 74, 74)
                                    .addComponent(veri_kullaniciadi))
                                .addComponent(jLabel16))
                            .addGap(30, 30, 30)))
                    .addGroup(pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_kullanicilistele, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_kullanicilarLayout.createSequentialGroup()
                            .addGap(369, 369, 369)
                            .addComponent(btn_takipet, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel14)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        pnl_kullanicilarLayout.setVerticalGroup(
            pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_kullanicilarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_kullanicilistele, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(veri_kullaniciid))
                .addGap(55, 55, 55)
                .addGroup(pnl_kullanicilarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(veri_kullaniciadi))
                .addGap(46, 46, 46)
                .addComponent(btn_takipet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        tabbedpnl.addTab("tab3", pnl_kullanicilar);

        pnl_takipe.setBackground(new java.awt.Color(0, 51, 51));

        tablo_takipe.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_takipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_takipeMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablo_takipe);

        btn_takipelistele.setText("LİSTELE");
        btn_takipelistele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_takipelisteleMouseClicked(evt);
            }
        });
        btn_takipelistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takipelisteleActionPerformed(evt);
            }
        });

        tablo_takipepop.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_takipepop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_takipepopMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablo_takipepop);

        tablo_takipejazz.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_takipejazz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_takipejazzMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tablo_takipejazz);

        tablo_takipeklasik.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_takipeklasik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_takipeklasikMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tablo_takipeklasik);

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("POP ÇALMA LİSTESİ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setText("JAZZ ÇALMA LİSTESİ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 255, 255));
        jLabel19.setText("KLASİK ÇALMA LİSTESİ");

        btn_takipe_calmalisteekle.setText("ÇALMA LİSTESİNE EKLE");
        btn_takipe_calmalisteekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_takipe_calmalisteekleMouseClicked(evt);
            }
        });
        btn_takipe_calmalisteekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takipe_calmalisteekleActionPerformed(evt);
            }
        });

        lbl_takipeturid.setText("TAKİPETURİD");

        lbl_takipesarkiid.setText("TAKİPESARKİİD");

        btn_takipesarkidinle.setText("ŞARKIYI DİNLE");
        btn_takipesarkidinle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takipesarkidinleActionPerformed(evt);
            }
        });

        lbl_takipedsayi.setText("DİNLENME SAYİSİ");

        javax.swing.GroupLayout pnl_takipeLayout = new javax.swing.GroupLayout(pnl_takipe);
        pnl_takipe.setLayout(pnl_takipeLayout);
        pnl_takipeLayout.setHorizontalGroup(
            pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_takipeLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel18))
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .addComponent(jScrollPane8))
                        .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_takipeLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_takipeLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btn_takipelistele, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel19)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_takipeLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btn_takipe_calmalisteekle)
                .addGap(95, 95, 95)
                .addComponent(btn_takipesarkidinle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_takipeLayout.createSequentialGroup()
                        .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_takipeturid)
                            .addComponent(lbl_takipedsayi))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_takipeLayout.createSequentialGroup()
                        .addComponent(lbl_takipesarkiid)
                        .addGap(97, 97, 97))))
        );
        pnl_takipeLayout.setVerticalGroup(
            pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_takipeLayout.createSequentialGroup()
                .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_takipelistele, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel17)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel18)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel19))
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lbl_takipedsayi)
                .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_takipeturid)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_takipesarkiid))
                    .addGroup(pnl_takipeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnl_takipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_takipe_calmalisteekle)
                            .addComponent(btn_takipesarkidinle))))
                .addGap(44, 44, 44))
        );

        tabbedpnl.addTab("tab4", pnl_takipe);

        pnl_calmalisteleri.setBackground(new java.awt.Color(204, 153, 255));

        tablo_calmalisteleripop.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_calmalisteleripop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_calmalisteleripopMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tablo_calmalisteleripop);

        tablo_calmalistelerijazz.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_calmalistelerijazz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_calmalistelerijazzMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tablo_calmalistelerijazz);

        tablo_calmalisteleriklasik.setModel(new javax.swing.table.DefaultTableModel(
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
        tablo_calmalisteleriklasik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_calmalisteleriklasikMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tablo_calmalisteleriklasik);

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel20.setText("ŞARKI ID :");

        veri_listesarkiid.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel22.setText("ŞARKI ADI :");

        veri_listesarkiad.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel24.setText("TÜR ID :");

        veri_listeturid.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel26.setText("DİNLENME SAYISI :");

        veri_listedsayi.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel28.setText("SÜRE :");

        veri_listesure.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jButton1.setText("ŞARKIYI DİNLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_calmalistesil.setText("ÇALMA LİSTEMDEN SİL");
        btn_calmalistesil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calmalistesilActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("POP ÇALMA LİSTEM");

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 204));
        jLabel23.setText("JAZZ ÇALMA LİSTEM");

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 153));
        jLabel25.setText("  KLASİK ÇALMA LİSTEM");

        javax.swing.GroupLayout pnl_calmalisteleriLayout = new javax.swing.GroupLayout(pnl_calmalisteleri);
        pnl_calmalisteleri.setLayout(pnl_calmalisteleriLayout);
        pnl_calmalisteleriLayout.setHorizontalGroup(
            pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_calmalisteleriLayout.createSequentialGroup()
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                        .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                                .addContainerGap(62, Short.MAX_VALUE)
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_calmalisteleriLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel26))
                                .addGap(51, 51, 51)
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                                        .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(veri_listedsayi)
                                            .addComponent(veri_listesure)
                                            .addComponent(veri_listeturid)
                                            .addComponent(veri_listesarkiad))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                                        .addComponent(veri_listesarkiid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_calmalisteleriLayout.createSequentialGroup()
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_calmalistesil, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGap(89, 89, 89)))))
                .addGap(66, 66, 66))
        );
        pnl_calmalisteleriLayout.setVerticalGroup(
            pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addGap(39, 39, 39)
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                        .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_calmalisteleriLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(veri_listesarkiad)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(veri_listesarkiid))
                                .addGap(68, 68, 68)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_calmalisteleriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)))
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veri_listeturid)
                    .addComponent(jLabel24))
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(veri_listedsayi))
                        .addGap(46, 46, 46))
                    .addGroup(pnl_calmalisteleriLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_calmalistesil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnl_calmalisteleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(veri_listesure))
                .addGap(96, 96, 96))
        );

        tabbedpnl.addTab("tab5", pnl_calmalisteleri);

        getContentPane().add(tabbedpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 930, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlg_anasayfaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlg_anasayfaMouseClicked
        tabbedpnl.setSelectedIndex(0);
        pnlg_anasayfa.setBackground(Color.white);
        pnlg_top10.setBackground(new Color(204, 204, 255));
        pnlg_kullanicilar.setBackground(new Color(204, 204, 255));
        pnlg_takipci.setBackground(new Color(204, 204, 255));
        pnlg_çalmalisteleri.setBackground(new Color(204, 204, 255));

    }//GEN-LAST:event_pnlg_anasayfaMouseClicked

    private void pnlg_top10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlg_top10MouseClicked
        tabbedpnl.setSelectedIndex(1);
        pnlg_top10.setBackground(Color.WHITE);
        pnlg_anasayfa.setBackground(new Color(204, 204, 255));
        pnlg_kullanicilar.setBackground(new Color(204, 204, 255));
        pnlg_takipci.setBackground(new Color(204, 204, 255));
        pnlg_çalmalisteleri.setBackground(new Color(204, 204, 255));

        try {

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
            while (myRs.next()) {
                comboBox.addItem(myRs.getNString("ulke_ad"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlg_top10MouseClicked

    private void pnlg_takipciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlg_takipciMouseClicked
        tabbedpnl.setSelectedIndex(3);
        pnlg_takipci.setBackground(Color.white);
        pnlg_anasayfa.setBackground(new Color(204, 204, 255));
        pnlg_top10.setBackground(new Color(204, 204, 255));
        pnlg_kullanicilar.setBackground(new Color(204, 204, 255));
        pnlg_çalmalisteleri.setBackground(new Color(204, 204, 255));
        lbl_takipesarkiid.setVisible(false);
        lbl_takipeturid.setVisible(false);
        lbl_takipedsayi.setVisible(false);
    }//GEN-LAST:event_pnlg_takipciMouseClicked

    private void pnlg_çalmalisteleriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlg_çalmalisteleriMouseClicked
        tabbedpnl.setSelectedIndex(4);
        pnlg_çalmalisteleri.setBackground(Color.white);
        pnlg_anasayfa.setBackground(new Color(204, 204, 255));
        pnlg_top10.setBackground(new Color(204, 204, 255));
        pnlg_takipci.setBackground(new Color(204, 204, 255));
        pnlg_kullanicilar.setBackground(new Color(204, 204, 255));

        String kullanici_mail = null, olusturan_id = null;
        int kullanici_id;

        modellistepop.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }

            kullanici_mail = jfKullDeneme.email;
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
            try {
                while (myRs.next()) {
                    olusturan_id = myRs.getString("kullanici_id");

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            kullanici_id = Integer.valueOf(olusturan_id);
            myRs = myStat.executeQuery("SELECT * FROM muzik.calma_liste,muzik.sarki WHERE muzik.calma_liste.id_sarki = muzik.sarki.id_sarki AND muzik.calma_liste.liste_id=1 AND olusturan_id=" + kullanici_id);
            modellistepop.setColumnIdentifiers(kolonlarlistepop);
            while (myRs.next()) {

                try {
                    satirlarlistepop[0] = myRs.getString("id_sarki");
                    satirlarlistepop[1] = myRs.getString("sarki_ad");
                    satirlarlistepop[2] = myRs.getString("id_tur");
                    satirlarlistepop[3] = myRs.getString("d_sayi");
                    satirlarlistepop[4] = myRs.getString("sure");
                    modellistepop.addRow(satirlarlistepop);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            tablo_calmalisteleripop.setModel(modellistepop);

            modellistejazz.setRowCount(0);
            myRs = myStat.executeQuery("SELECT * FROM muzik.calma_liste,muzik.sarki WHERE muzik.calma_liste.id_sarki = muzik.sarki.id_sarki AND muzik.calma_liste.liste_id=2 AND olusturan_id=" + kullanici_id);
            modellistejazz.setColumnIdentifiers(kolonlarlistejazz);
            while (myRs.next()) {

                try {
                    satirlarlistejazz[0] = myRs.getString("id_sarki");
                    satirlarlistejazz[1] = myRs.getString("sarki_ad");
                    satirlarlistejazz[2] = myRs.getString("id_tur");
                    satirlarlistejazz[3] = myRs.getString("d_sayi");
                    satirlarlistejazz[4] = myRs.getString("sure");
                    modellistejazz.addRow(satirlarlistejazz);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            tablo_calmalistelerijazz.setModel(modellistejazz);

            modellisteklasik.setRowCount(0);
            myRs = myStat.executeQuery("SELECT * FROM muzik.calma_liste,muzik.sarki WHERE muzik.calma_liste.id_sarki = muzik.sarki.id_sarki AND muzik.calma_liste.liste_id=3 AND olusturan_id=" + kullanici_id);
            modellisteklasik.setColumnIdentifiers(kolonlarlisteklasik);
            while (myRs.next()) {

                try {
                    satirlarlisteklasik[0] = myRs.getString("id_sarki");
                    satirlarlisteklasik[1] = myRs.getString("sarki_ad");
                    satirlarlisteklasik[2] = myRs.getString("id_tur");
                    satirlarlisteklasik[3] = myRs.getString("d_sayi");
                    satirlarlisteklasik[4] = myRs.getString("sure");
                    modellisteklasik.addRow(satirlarlisteklasik);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            tablo_calmalisteleriklasik.setModel(modellisteklasik);

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_pnlg_çalmalisteleriMouseClicked

    private void pnlg_kullanicilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlg_kullanicilarMouseClicked
        tabbedpnl.setSelectedIndex(2);
        pnlg_kullanicilar.setBackground(Color.WHITE);
        pnlg_çalmalisteleri.setBackground(new Color(204, 204, 255));
        pnlg_anasayfa.setBackground(new Color(204, 204, 255));
        pnlg_top10.setBackground(new Color(204, 204, 255));
        pnlg_takipci.setBackground(new Color(204, 204, 255));

    }//GEN-LAST:event_pnlg_kullanicilarMouseClicked

    private void btn_calmalistesilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calmalistesilActionPerformed
        String kullanici_mail = jfKullDeneme.email, olusturan_id = null;
        ResultSet myRs = mysql_baglanti.yap();
        try {
            myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
            myStat = (Statement) myConn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (myRs.next()) {
                olusturan_id = myRs.getString("kullanici_id");

            }

            String sql_sorgu = "DELETE FROM muzik.sarki WHERE id_sarki=" + veri_listesarkiid.getText();

            try {
                mysql_baglanti.sil(sql_sorgu);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_calmalistesilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String sql_sorgu = null;
        int d_Sayi = Integer.valueOf(veri_listedsayi.getText());
        d_Sayi++;
        sql_sorgu = "UPDATE muzik.sarki SET d_sayi=" + d_Sayi + " WHERE id_sarki=" + veri_listesarkiid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablo_calmalisteleriklasikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_calmalisteleriklasikMouseClicked
        veri_listesarkiid.setText((String) tablo_calmalisteleriklasik.getModel().getValueAt(tablo_calmalisteleriklasik.getSelectedRow(), 0));
        veri_listesarkiad.setText((String) tablo_calmalisteleriklasik.getModel().getValueAt(tablo_calmalisteleriklasik.getSelectedRow(), 1));
        veri_listeturid.setText((String) tablo_calmalisteleriklasik.getModel().getValueAt(tablo_calmalisteleriklasik.getSelectedRow(), 2));
        veri_listedsayi.setText((String) tablo_calmalisteleriklasik.getModel().getValueAt(tablo_calmalisteleriklasik.getSelectedRow(), 3));
        veri_listesure.setText((String) tablo_calmalisteleriklasik.getModel().getValueAt(tablo_calmalisteleriklasik.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo_calmalisteleriklasikMouseClicked

    private void tablo_calmalistelerijazzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_calmalistelerijazzMouseClicked
        veri_listesarkiid.setText((String) tablo_calmalistelerijazz.getModel().getValueAt(tablo_calmalistelerijazz.getSelectedRow(), 0));
        veri_listesarkiad.setText((String) tablo_calmalistelerijazz.getModel().getValueAt(tablo_calmalistelerijazz.getSelectedRow(), 1));
        veri_listeturid.setText((String) tablo_calmalistelerijazz.getModel().getValueAt(tablo_calmalistelerijazz.getSelectedRow(), 2));
        veri_listedsayi.setText((String) tablo_calmalistelerijazz.getModel().getValueAt(tablo_calmalistelerijazz.getSelectedRow(), 3));
        veri_listesure.setText((String) tablo_calmalistelerijazz.getModel().getValueAt(tablo_calmalistelerijazz.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo_calmalistelerijazzMouseClicked

    private void tablo_calmalisteleripopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_calmalisteleripopMouseClicked
        veri_listesarkiid.setText((String) tablo_calmalisteleripop.getModel().getValueAt(tablo_calmalisteleripop.getSelectedRow(), 0));
        veri_listesarkiad.setText((String) tablo_calmalisteleripop.getModel().getValueAt(tablo_calmalisteleripop.getSelectedRow(), 1));
        veri_listeturid.setText((String) tablo_calmalisteleripop.getModel().getValueAt(tablo_calmalisteleripop.getSelectedRow(), 2));
        veri_listedsayi.setText((String) tablo_calmalisteleripop.getModel().getValueAt(tablo_calmalisteleripop.getSelectedRow(), 3));
        veri_listesure.setText((String) tablo_calmalisteleripop.getModel().getValueAt(tablo_calmalisteleripop.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo_calmalisteleripopMouseClicked

    private void btn_takipesarkidinleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takipesarkidinleActionPerformed

        String sql_sorgu = null;
        int d_Sayi = Integer.valueOf(lbl_takipedsayi.getText());
        d_Sayi++;
        sql_sorgu = "UPDATE muzik.sarki SET d_sayi=" + d_Sayi + " WHERE id_sarki=" + lbl_takipesarkiid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_takipesarkidinleActionPerformed

    private void btn_takipe_calmalisteekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takipe_calmalisteekleActionPerformed

        try {
            String liste_id, id_sarki = null, liste_ad, olusturan_id = null, tur_id = null, sql_sorgu, sarki_id = null, kullanici_mail = null;
            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }

            sarki_id = lbl_takipesarkiid.getText();
            tur_id = lbl_takipeturid.getText();

            if ("1".equals(tur_id)) {
                liste_id = "1";
                liste_ad = "pop";
            } else if ("2".equals(tur_id)) {
                liste_id = "2";
                liste_ad = "jazz";
            } else {
                liste_id = "3";
                liste_ad = "klasik";
            }

            kullanici_mail = jfKullDeneme.email;
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
            try {
                while (myRs.next()) {
                    olusturan_id = myRs.getString("kullanici_id");

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            boolean varMi = false;
            myRs = myStat.executeQuery("Select * From muzik.calma_liste ");
            while (myRs.next()) {
                if (myRs.getString("liste_id").equals(liste_id) && myRs.getString("id_sarki").equals(sarki_id) && myRs.getString("olusturan_id").equals(olusturan_id)) {
                    varMi = true;
                }

            }
            if (varMi == true) {

                JOptionPane.showMessageDialog(null, "Bu şarkı çalma listenizde mevcut.");
            } else {
                sql_sorgu = "INSERT INTO calma_liste (liste_id, id_sarki,liste_ad,olusturan_id,tur_id) VALUES (" + liste_id + "," + sarki_id + ",'" + liste_ad + "'," + olusturan_id + "," + tur_id + ")";

                myStat.executeUpdate(sql_sorgu);
                JOptionPane.showMessageDialog(null, "Şarkı çalma listenize eklendi.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_takipe_calmalisteekleActionPerformed

    private void btn_takipe_calmalisteekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_takipe_calmalisteekleMouseClicked

    }//GEN-LAST:event_btn_takipe_calmalisteekleMouseClicked

    private void tablo_takipeklasikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_takipeklasikMouseClicked
        lbl_takipesarkiid.setText((String) tablo_takipeklasik.getModel().getValueAt(tablo_takipeklasik.getSelectedRow(), 0));
        lbl_takipeturid.setText((String) tablo_takipeklasik.getModel().getValueAt(tablo_takipeklasik.getSelectedRow(), 2));
        lbl_takipedsayi.setText((String) tablo_takipeklasik.getModel().getValueAt(tablo_takipeklasik.getSelectedRow(), 3));
    }//GEN-LAST:event_tablo_takipeklasikMouseClicked

    private void tablo_takipejazzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_takipejazzMouseClicked
        lbl_takipesarkiid.setText((String) tablo_takipejazz.getModel().getValueAt(tablo_takipejazz.getSelectedRow(), 0));
        lbl_takipeturid.setText((String) tablo_takipejazz.getModel().getValueAt(tablo_takipejazz.getSelectedRow(), 2));
        lbl_takipedsayi.setText((String) tablo_takipejazz.getModel().getValueAt(tablo_takipejazz.getSelectedRow(), 3));
    }//GEN-LAST:event_tablo_takipejazzMouseClicked

    private void tablo_takipepopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_takipepopMouseClicked
        lbl_takipesarkiid.setText((String) tablo_takipepop.getModel().getValueAt(tablo_takipepop.getSelectedRow(), 0));
        lbl_takipeturid.setText((String) tablo_takipepop.getModel().getValueAt(tablo_takipepop.getSelectedRow(), 2));
        lbl_takipedsayi.setText((String) tablo_takipepop.getModel().getValueAt(tablo_takipepop.getSelectedRow(), 3));
    }//GEN-LAST:event_tablo_takipepopMouseClicked

    private void btn_takipelisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takipelisteleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_takipelisteleActionPerformed

    private void btn_takipelisteleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_takipelisteleMouseClicked

        modeltakipe.setRowCount(0);
        String kullanici_mail = jfKullDeneme.email, olusturan_id = null;
        ResultSet myRs = mysql_baglanti.yap();
        try {
            myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
            myStat = (Statement) myConn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (myRs.next()) {
                olusturan_id = myRs.getString("kullanici_id");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {

            String sql_sorgu = null;
            sql_sorgu = "SELECT * FROM muzik.kullanici_takipe,muzik.kullanici WHERE muzik.kullanici_takipe.kullanici_id=" + olusturan_id + " AND muzik.kullanici_takipe.takip_id = muzik.kullanici.kullanici_id";
            myRs = mysql_baglanti.sorgula(sql_sorgu);
            modeltakipe.setColumnIdentifiers(kolonlartakipe);
            while (myRs.next()) {

                try {
                    satirlartakipe[0] = myRs.getString("takip_id");
                    satirlartakipe[1] = myRs.getString("kullanici_ad");

                    modeltakipe.addRow(satirlartakipe);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_takipe.setModel(modeltakipe);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_takipelisteleMouseClicked

    private void tablo_takipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_takipeMouseClicked

        int takipe_kullaniciid;
        String xxx;
        xxx = (String) tablo_takipe.getModel().getValueAt(tablo_takipe.getSelectedRow(), 0);
        takipe_kullaniciid = Integer.valueOf(xxx);

        modelpoptakipe.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.calma_liste,muzik.sarki WHERE muzik.calma_liste.id_sarki = muzik.sarki.id_sarki AND muzik.calma_liste.liste_id=1 AND olusturan_id=" + takipe_kullaniciid);
            modelpoptakipe.setColumnIdentifiers(kolonlarpoptakipe);
            while (myRs.next()) {

                try {
                    satirlarpoptakipe[0] = myRs.getString("id_sarki");
                    satirlarpoptakipe[1] = myRs.getString("sarki_ad");
                    satirlarpoptakipe[2] = myRs.getString("id_tur");
                    satirlarpoptakipe[3] = myRs.getString("d_sayi");
                    satirlarpoptakipe[4] = myRs.getString("sure");
                    modelpoptakipe.addRow(satirlarpoptakipe);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_takipepop.setModel(modelpoptakipe);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        modeljazztakipe.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.calma_liste,muzik.sarki WHERE muzik.calma_liste.id_sarki = muzik.sarki.id_sarki AND muzik.calma_liste.liste_id=2 AND olusturan_id=" + takipe_kullaniciid);
            modeljazztakipe.setColumnIdentifiers(kolonlarpoptakipe);
            while (myRs.next()) {

                try {
                    satirlarjazztakipe[0] = myRs.getString("id_sarki");
                    satirlarjazztakipe[1] = myRs.getString("sarki_ad");
                    satirlarjazztakipe[2] = myRs.getString("id_tur");
                    satirlarjazztakipe[3] = myRs.getString("d_sayi");
                    satirlarjazztakipe[4] = myRs.getString("sure");
                    modeljazztakipe.addRow(satirlarjazztakipe);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_takipejazz.setModel(modeljazztakipe);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelklasiktakipe.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.calma_liste,muzik.sarki WHERE muzik.calma_liste.id_sarki = muzik.sarki.id_sarki AND muzik.calma_liste.liste_id=3 AND olusturan_id=" + takipe_kullaniciid);
            modelklasiktakipe.setColumnIdentifiers(kolonlarklasiktakipe);
            while (myRs.next()) {

                try {
                    satirlarklasiktakipe[0] = myRs.getString("id_sarki");
                    satirlarklasiktakipe[1] = myRs.getString("sarki_ad");
                    satirlarklasiktakipe[2] = myRs.getString("id_tur");
                    satirlarklasiktakipe[3] = myRs.getString("d_sayi");
                    satirlarklasiktakipe[4] = myRs.getString("sure");
                    modelklasiktakipe.addRow(satirlarklasiktakipe);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_takipeklasik.setModel(modelklasiktakipe);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tablo_takipeMouseClicked

    private void btn_takipetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takipetActionPerformed

        try {

            String kullanici_mail = jfKullDeneme.email, olusturan_id = null;
            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }

            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
            try {
                while (myRs.next()) {
                    olusturan_id = myRs.getString("kullanici_id");

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (olusturan_id.equals(veri_kullaniciid.getText())) {
                JOptionPane.showMessageDialog(null, "KENDİNİZİ TAKİP EDEMEZSİNİZ ");
            } else {
                boolean varMi = false;
                myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici_takipe WHERE kullanici_id= " + olusturan_id);
                while (myRs.next()) {

                    if (myRs.getString("takip_id").equals(veri_kullaniciid.getText())) {
                        varMi = true;
                    }

                }

                if (varMi == true) {
                    JOptionPane.showMessageDialog(null, "Kullanıcıyı zaten takip ediyotsunuz ");
                } else {

                    myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_id= " + veri_kullaniciid.getText());
                    while (myRs.next()) {

                        if (myRs.getString("odeme").equals("0")) {
                            JOptionPane.showMessageDialog(null, "Kullanıcı premium olmadığından takip edemezsiniz ");
                        } else {
                            String sql_sorgu = null;
                            sql_sorgu = "INSERT INTO muzik.kullanici_takipe (kullanici_id,takip_id) VALUES (" + olusturan_id + "," + veri_kullaniciid.getText() + ")";
                            JOptionPane.showMessageDialog(null, "Kullanıcı takip edilenlere eklendi ");
                            try {
                                mysql_baglanti.ekle(sql_sorgu);
                            } catch (SQLException ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_takipetActionPerformed

    private void btn_kullanicilisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullanicilisteleActionPerformed

        modelkullaniciliste.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici ");
            modelkullaniciliste.setColumnIdentifiers(kolonlarukullaniciliste);
            while (myRs.next()) {

                try {
                    satirlarkullaniciliste[0] = myRs.getString("kullanici_ad");
                    satirlarkullaniciliste[1] = myRs.getString("kullanici_id");
                    if (myRs.getString("odeme").equals("0")) {
                        satirlarkullaniciliste[2] = "FREE";
                    } else {
                        satirlarkullaniciliste[2] = "PREMİIUM";
                    }

                    modelkullaniciliste.addRow(satirlarkullaniciliste);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo_kullanicilistesi.setModel(modelkullaniciliste);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_kullanicilisteleActionPerformed

    private void tablo_kullanicilistesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_kullanicilistesiMouseClicked

        veri_kullaniciadi.setText((String) tablo_kullanicilistesi.getModel().getValueAt(tablo_kullanicilistesi.getSelectedRow(), 0));
        veri_kullaniciid.setText((String) tablo_kullanicilistesi.getModel().getValueAt(tablo_kullanicilistesi.getSelectedRow(), 1));

    }//GEN-LAST:event_tablo_kullanicilistesiMouseClicked

    private void btn_top10sarkidinleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_top10sarkidinleActionPerformed

        String sql_sorgu = null;
        int d_Sayi = Integer.valueOf(lbl_verisarki_dsayi.getText());
        d_Sayi++;
        sql_sorgu = "UPDATE muzik.sarki SET d_sayi=" + d_Sayi + " WHERE id_sarki=" + lbl_verisarkiid.getText();
        ResultSet myRs = mysql_baglanti.yap();
        try {
            mysql_baglanti.update(sql_sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_top10sarkidinleActionPerformed

    private void btn_top10listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_top10listeleActionPerformed

        modelgeneltop.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sarki  ORDER BY d_sayi DESC  LIMIT 10 ");
            modelgeneltop.setColumnIdentifiers(kolonlargeneltop);
            while (myRs.next()) {

                try {
                    satirlargeneltop[0] = myRs.getString("id_sarki");
                    satirlargeneltop[1] = myRs.getString("sarki_ad");
                    satirlargeneltop[2] = myRs.getString("id_tur");
                    satirlargeneltop[3] = myRs.getString("d_sayi");
                    satirlargeneltop[4] = myRs.getString("sure");
                    modelgeneltop.addRow(satirlargeneltop);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo10_genel.setModel(modelgeneltop);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelpoptop.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sarki WHERE id_tur=1 ORDER BY d_sayi DESC  LIMIT 10 ");
            modelpoptop.setColumnIdentifiers(kolonlarpoptop);
            while (myRs.next()) {

                try {
                    satirlarpoptop[0] = myRs.getString("id_sarki");
                    satirlarpoptop[1] = myRs.getString("sarki_ad");
                    satirlarpoptop[2] = myRs.getString("id_tur");
                    satirlarpoptop[3] = myRs.getString("d_sayi");
                    satirlarpoptop[4] = myRs.getString("sure");
                    modelpoptop.addRow(satirlarpoptop);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo10_pop.setModel(modelpoptop);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        modeljazztop.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sarki WHERE id_tur=2 ORDER BY d_sayi DESC  LIMIT 10 ");
            modeljazztop.setColumnIdentifiers(kolonlarjazztop);
            while (myRs.next()) {

                try {
                    satirlarjazztop[0] = myRs.getString("id_sarki");
                    satirlarjazztop[1] = myRs.getString("sarki_ad");
                    satirlarjazztop[2] = myRs.getString("id_tur");
                    satirlarjazztop[3] = myRs.getString("d_sayi");
                    satirlarjazztop[4] = myRs.getString("sure");
                    modeljazztop.addRow(satirlarjazztop);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo10_jazz.setModel(modeljazztop);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelklasiktop.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();

            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }
            myRs = myStat.executeQuery("SELECT * FROM muzik.sarki WHERE id_tur=3 ORDER BY d_sayi DESC  LIMIT 10 ");
            modelklasiktop.setColumnIdentifiers(kolonlarklasiktop);
            while (myRs.next()) {

                try {
                    satirlarklasiktop[0] = myRs.getString("id_sarki");
                    satirlarklasiktop[1] = myRs.getString("sarki_ad");
                    satirlarklasiktop[2] = myRs.getString("id_tur");
                    satirlarklasiktop[3] = myRs.getString("d_sayi");
                    satirlarklasiktop[4] = myRs.getString("sure");
                    modelklasiktop.addRow(satirlarklasiktop);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo10_klasik.setModel(modelklasiktop);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelulketop.setRowCount(0);

        try {
            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }

            String ulke;
            ulke = (String) comboBox.getSelectedItem();      
            myRs = myStat.executeQuery("SELECT *  FROM muzik.sarki,muzik.sanatci_sarki,muzik.sanatci,muzik.ulke WHERE muzik.sarki.id_sarki= muzik.sanatci_sarki.id_sarki and muzik.sanatci_sarki.id_sanatci = muzik.sanatci.idsanatci and muzik.sanatci.ulke = muzik.ulke.ulke_id AND muzik.ulke.ulke_ad='" + ulke + "' ORDER BY d_sayi DESC  LIMIT 10 ");
            modelulketop.setColumnIdentifiers(kolonlarulketop);
            while (myRs.next()) {

                try {
                    satirlarulketop[0] = myRs.getString("id_sarki");
                    satirlarulketop[1] = myRs.getString("sarki_ad");
                    satirlarulketop[2] = myRs.getString("id_tur");
                    satirlarulketop[3] = myRs.getString("d_sayi");
                    satirlarulketop[4] = myRs.getString("sure");
                    modelulketop.addRow(satirlarulketop);

                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            tablo10_ulke.setModel(modelulketop);

        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_top10listeleActionPerformed

    private void tablo10_klasikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo10_klasikMouseClicked
        lbl_verisarkiid.setText((String) tablo10_klasik.getModel().getValueAt(tablo10_klasik.getSelectedRow(), 0));
        lbl_verisarkiad.setText((String) tablo10_klasik.getModel().getValueAt(tablo10_klasik.getSelectedRow(), 1));
        lbl_verisarkiturid.setText((String) tablo10_klasik.getModel().getValueAt(tablo10_klasik.getSelectedRow(), 2));
        lbl_verisarki_dsayi.setText((String) tablo10_klasik.getModel().getValueAt(tablo10_klasik.getSelectedRow(), 3));
        lbl_verisarkisure.setText((String) tablo10_klasik.getModel().getValueAt(tablo10_klasik.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo10_klasikMouseClicked

    private void btn_calmalistesinekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calmalistesinekleActionPerformed
        try {
            String liste_id, id_sarki = null, liste_ad, olusturan_id = null, tur_id = null, sql_sorgu, sarki_id = null, kullanici_mail = null;
            ResultSet myRs = mysql_baglanti.yap();
            try {
                myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik", "root", "toor4321");
                myStat = (Statement) myConn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
            }

            sarki_id = lbl_verisarkiid.getText();
            tur_id = lbl_verisarkiturid.getText();

            if ("1".equals(tur_id)) {
                liste_id = "1";
                liste_ad = "pop";
            } else if ("2".equals(tur_id)) {
                liste_id = "2";
                liste_ad = "jazz";
            } else {
                liste_id = "3";
                liste_ad = "klasik";
            }

            kullanici_mail = jfKullDeneme.email;
            myRs = myStat.executeQuery("SELECT * FROM muzik.kullanici WHERE kullanici_mail='" + kullanici_mail + "'");
            try {
                while (myRs.next()) {
                    olusturan_id = myRs.getString("kullanici_id");

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            boolean varMi = false;
            myRs = myStat.executeQuery("Select * From muzik.calma_liste ");
            while (myRs.next()) {
                if (myRs.getString("liste_id").equals(liste_id) && myRs.getString("id_sarki").equals(sarki_id) && myRs.getString("olusturan_id").equals(olusturan_id)) {
                    varMi = true;
                }

            }
            if (varMi == true) {
                JOptionPane.showMessageDialog(null, "Bu şarkı çalma listenizde mevcut.");
            } else {

                sql_sorgu = "INSERT INTO calma_liste (liste_id, id_sarki,liste_ad,olusturan_id,tur_id) VALUES (" + liste_id + "," + sarki_id + ",'" + liste_ad + "'," + olusturan_id + "," + tur_id + ")";
                myStat.executeUpdate(sql_sorgu);
                JOptionPane.showMessageDialog(null, "Şarkı çalma listenize eklendi.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDeneme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_calmalistesinekleActionPerformed

    private void btn_calmalistesinekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calmalistesinekleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_calmalistesinekleMouseClicked

    private void tablo10_jazzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo10_jazzMouseClicked
        lbl_verisarkiid.setText((String) tablo10_jazz.getModel().getValueAt(tablo10_jazz.getSelectedRow(), 0));
        lbl_verisarkiad.setText((String) tablo10_jazz.getModel().getValueAt(tablo10_jazz.getSelectedRow(), 1));
        lbl_verisarkiturid.setText((String) tablo10_jazz.getModel().getValueAt(tablo10_jazz.getSelectedRow(), 2));
        lbl_verisarki_dsayi.setText((String) tablo10_jazz.getModel().getValueAt(tablo10_jazz.getSelectedRow(), 3));
        lbl_verisarkisure.setText((String) tablo10_jazz.getModel().getValueAt(tablo10_jazz.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo10_jazzMouseClicked

    private void tablo10_ulkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo10_ulkeMouseClicked
        lbl_verisarkiid.setText((String) tablo10_ulke.getModel().getValueAt(tablo10_ulke.getSelectedRow(), 0));
        lbl_verisarkiad.setText((String) tablo10_ulke.getModel().getValueAt(tablo10_ulke.getSelectedRow(), 1));
        lbl_verisarkiturid.setText((String) tablo10_ulke.getModel().getValueAt(tablo10_ulke.getSelectedRow(), 2));
        lbl_verisarki_dsayi.setText((String) tablo10_ulke.getModel().getValueAt(tablo10_ulke.getSelectedRow(), 3));
        lbl_verisarkisure.setText((String) tablo10_ulke.getModel().getValueAt(tablo10_ulke.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo10_ulkeMouseClicked

    private void tablo10_genelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo10_genelMouseClicked

        lbl_verisarkiid.setText((String) tablo10_genel.getModel().getValueAt(tablo10_genel.getSelectedRow(), 0));
        lbl_verisarkiad.setText((String) tablo10_genel.getModel().getValueAt(tablo10_genel.getSelectedRow(), 1));
        lbl_verisarkiturid.setText((String) tablo10_genel.getModel().getValueAt(tablo10_genel.getSelectedRow(), 2));
        lbl_verisarki_dsayi.setText((String) tablo10_genel.getModel().getValueAt(tablo10_genel.getSelectedRow(), 3));
        lbl_verisarkisure.setText((String) tablo10_genel.getModel().getValueAt(tablo10_genel.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo10_genelMouseClicked

    private void tablo10_popMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo10_popMouseClicked
        lbl_verisarkiid.setText((String) tablo10_pop.getModel().getValueAt(tablo10_pop.getSelectedRow(), 0));
        lbl_verisarkiad.setText((String) tablo10_pop.getModel().getValueAt(tablo10_pop.getSelectedRow(), 1));
        lbl_verisarkiturid.setText((String) tablo10_pop.getModel().getValueAt(tablo10_pop.getSelectedRow(), 2));
        lbl_verisarki_dsayi.setText((String) tablo10_pop.getModel().getValueAt(tablo10_pop.getSelectedRow(), 3));
        lbl_verisarkisure.setText((String) tablo10_pop.getModel().getValueAt(tablo10_pop.getSelectedRow(), 4));
    }//GEN-LAST:event_tablo10_popMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anasayfaad;
    private javax.swing.JButton btn_calmalistesil;
    private javax.swing.JButton btn_calmalistesinekle;
    private javax.swing.JToggleButton btn_kullanicilistele;
    private javax.swing.JToggleButton btn_takipe_calmalisteekle;
    private javax.swing.JToggleButton btn_takipelistele;
    private javax.swing.JButton btn_takipesarkidinle;
    private javax.swing.JToggleButton btn_takipet;
    private javax.swing.JButton btn_top10listele;
    private javax.swing.JButton btn_top10sarkidinle;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbl_anasayfa;
    private javax.swing.JLabel lbl_hesapturu;
    private javax.swing.JLabel lbl_hesaptürüfp;
    private javax.swing.JLabel lbl_takipedsayi;
    private javax.swing.JLabel lbl_takipesarkiid;
    private javax.swing.JLabel lbl_takipeturid;
    private javax.swing.JLabel lbl_top10genel;
    private javax.swing.JLabel lbl_top10jazz;
    private javax.swing.JLabel lbl_top10klasik;
    private javax.swing.JLabel lbl_top10pop;
    private javax.swing.JLabel lbl_top10ulke;
    private javax.swing.JLabel lbl_verisarki_dsayi;
    private javax.swing.JLabel lbl_verisarkiad;
    private javax.swing.JLabel lbl_verisarkiid;
    private javax.swing.JLabel lbl_verisarkisure;
    private javax.swing.JLabel lbl_verisarkiturid;
    private javax.swing.JPanel pnl_anasayfa;
    private javax.swing.JPanel pnl_calmalisteleri;
    private javax.swing.JPanel pnl_kullanicilar;
    private javax.swing.JPanel pnl_takipe;
    private javax.swing.JPanel pnl_top10;
    private javax.swing.JPanel pnlg_anasayfa;
    private javax.swing.JPanel pnlg_kullanicilar;
    private javax.swing.JPanel pnlg_takipci;
    private javax.swing.JPanel pnlg_top10;
    private javax.swing.JPanel pnlg_çalmalisteleri;
    private javax.swing.JTabbedPane tabbedpnl;
    private javax.swing.JTable tablo10_genel;
    private javax.swing.JTable tablo10_jazz;
    private javax.swing.JTable tablo10_klasik;
    private javax.swing.JTable tablo10_pop;
    private javax.swing.JTable tablo10_ulke;
    private javax.swing.JTable tablo_calmalistelerijazz;
    private javax.swing.JTable tablo_calmalisteleriklasik;
    private javax.swing.JTable tablo_calmalisteleripop;
    private javax.swing.JTable tablo_kullanicilistesi;
    private javax.swing.JTable tablo_takipe;
    private javax.swing.JTable tablo_takipejazz;
    private javax.swing.JTable tablo_takipeklasik;
    private javax.swing.JTable tablo_takipepop;
    private javax.swing.JLabel veri_kullaniciadi;
    private javax.swing.JLabel veri_kullaniciid;
    private javax.swing.JLabel veri_listedsayi;
    private javax.swing.JLabel veri_listesarkiad;
    private javax.swing.JLabel veri_listesarkiid;
    private javax.swing.JLabel veri_listesure;
    private javax.swing.JLabel veri_listeturid;
    // End of variables declaration//GEN-END:variables
}
