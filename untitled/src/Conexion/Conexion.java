package Conexion;

import java.sql.*;

public class Conexion {


        public static Connection Connect() {

           try {
               Connection con1;
               con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdfarmacia", "root", "admin");
               System.out.println("Conexion Establecida correctamente");
               return con1;
           }catch (SQLException e) {
               System.out.println("Error de Conexion con MySql ");
               e.printStackTrace();
               return null;
           }
        }

    public static void main(String[] args) {
            Connection con  = Connect();

    }

}
