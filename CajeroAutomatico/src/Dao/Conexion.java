package Dao;

import java.sql.*;

public class Conexion {
    Connection cn;

    public Connection Connect(){
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbanco","root","admin");
            System.out.println("Connection Established Correctly");

        }catch (Exception e){
            System.out.println("Failed Connecting");
            e.printStackTrace();
        }
        return cn;
    }



}
