package Dao;
import Modelos.*;

import java.net.ConnectException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class ClienteDao {

    Connection con1;
    Conexion cn = new Conexion();
    CallableStatement sp;
    ResultSet rs;

    public String Insert(Banco c){
        String rpta="";


        try{
            con1 = cn.Connect();
            sp = con1.prepareCall("{Call spInsertar (?,?,?,?)}");

            sp.setString(1, c.getNumCuenta());
            sp.setString(2,c.getClientName());
            sp.setDouble(3, c.getSaldo());
            sp.setInt(4, c.getCodigoSeg());

            sp.execute();
            rpta = "Se agrego correctamente el registro";
            con1.close();

            return rpta;

        }catch (Exception e){

            rpta = "No se pudo agregar el Registro";

            System.out.println(rpta);
            return rpta;
        }



    }
    public HashMap<String, String> Login(Banco b){

        boolean rpta = false;
        HashMap<String,String> table = new HashMap<>();

        try{
            con1 = cn.Connect();
            sp = con1.prepareCall("{Call spLogin(?,?)}");
            sp.setString(1, b.getNumCuenta());
            sp.setString(2, String.valueOf(b.getCodigoSeg()));

            rs = sp.executeQuery();
            while(rs.next()) {
                table.put(rs.getNString(1), rs.getNString(2));
            }
            con1.close();
            return table;

        }catch(Exception e){
            System.out.println("Error!!!");
            e.printStackTrace();
            return null;
        }

    }
}

