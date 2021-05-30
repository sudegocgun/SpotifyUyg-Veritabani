
package müzik_kutusu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql_baglanti {
     static Connection myConn;
    static Statement myStat;

static ResultSet yap(){
    ResultSet  myRs=null;
    try {
        
     
        myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muzik","root","toor4321");
        myStat=(Statement) myConn.createStatement();   
       myRs= myStat.executeQuery("select * from kullanici");
       
    } catch (Exception e) {
    e.printStackTrace();
    }
    return myRs;
     
}


static void ekle(String sql_sorgu) throws SQLException{
    
    myStat.executeUpdate(sql_sorgu);
    
}

static void update(String sql_sorgu) throws SQLException{
    
    myStat.executeLargeUpdate(sql_sorgu);
    
}
static void sil(String sql_sorgu) throws SQLException{
    myStat.executeUpdate(sql_sorgu);
}
static ResultSet sorgula(String sql_sorgu) throws SQLException{
    ResultSet myRs=null;
    myRs=myStat.executeQuery(sql_sorgu);
    
    return myRs;
}
}
