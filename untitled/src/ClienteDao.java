import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

import Conexion.Conexion;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ClienteDao {
    static Connection con1;
    static PreparedStatement st;
    static ResultSet rs;




    public DefaultTableModel list () {

        DefaultTableModel model = new DefaultTableModel();
        con1 = Conexion.Connect();
        try {
            st = con1.prepareStatement("Select * from cliente");
            rs = st.executeQuery();



            while (rs.next()) {
                Object [] data = {
                        rs.getInt("codcliente"),
                        rs.getString("nombreCompleto"),
                        rs.getInt("telefono"),
                        rs.getString("direccion")
                };
                model.addRow(data);

            }


        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();

            }
                 return model;
        }
    }




