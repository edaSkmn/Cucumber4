package _JDBC.Gun1;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void test1() throws SQLException {

        // baslangic bilgileri girildi
        // javaBaglanti : mysql e baglanti : url(hotname) : port / DB name
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";    // username
        String password="'\"-LhCB'.%k[4S]z"; // password

        //connection(baglantinin) kuruldugu yer
        Connection connection= DriverManager.getConnection(url, username,password); // baglantiya click yapar

        // sql lerin yazilacagi sayfa
        Statement statement= connection.createStatement(); // sorgulari calistirmak icin sayfa acar

        ResultSet rs= statement.executeQuery("select * from actor"); // sorgunun sonuclari olustu, DB de bekliyor
        // hizli calismak icin sonuclarin hepsi bilgisayarina gelmedi.

        rs.next(); // ilk satir bilgisayarina geldi, ilk satiri aldik.

        String firstname=rs.getString("first_name");
        String lastname=rs.getString("last_name");
        System.out.println("1. satir firstname ve lastname = " + firstname+ " "+ lastname);

        rs.next(); // 2. satiri gosteriyor

        firstname=rs.getString("first_name");
        lastname=rs.getString("last_name");

        connection.close();

    }


}
