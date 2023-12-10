import com.mysql.fabric.xmlrpc.Client;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmCliente extends JFrame{
    private JTable tCliente;
    private JPanel panel1;
    private JLabel lbCliente;

    public frmCliente(){
        tCliente = new JTable();
        FillCliente();
        tCliente.setLocation(500,500);
        tCliente.setVisible(true);



        setSize(800,1000);
        //frame.pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        setVisible(true);
        add(panel1);
        add(tCliente);


    }

    ClienteDao cliente = new ClienteDao();

    void FillCliente(){
        DefaultTableModel model = new DefaultTableModel();
        model = cliente.list();
        tCliente.setModel(model);
    }
}
