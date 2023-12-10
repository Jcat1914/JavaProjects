package CapaNegocio;
import Dao.*;
import Modelos.*;

import java.util.HashMap;

public class BancoN {

    ClienteDao c = new ClienteDao();

    public String Insertar(Banco objB){
        return c.Insert(objB);
    }
    public HashMap Login(Banco objB){
        return c.Login(objB);
    }

}
