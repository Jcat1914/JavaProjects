package Modelos;

import java.util.Hashtable;
import java.util.Map;

public class Cajero {

    Hashtable<String, Double> cuenta;

    static Cliente n = new Cliente("Juan Acuna", 190303,200.95,"1406K");

    void filler(Cliente c){
        cuenta = new Hashtable<>();
        cuenta.put(c.getCodigoSeg(), c.getSaldo());
    }

    public static void main(String[] args) {

        Cajero c = new Cajero();
        c.filler(new Cliente("John", 1234, 400.50, "1419J"));

        c.cuenta.forEach((k, v) -> {

            System.out.println(String.valueOf(k) + " " + String.valueOf(v));
        });
    }
}
