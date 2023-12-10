package Modelos;
import java.util.*;
public class Banco {
    private String numCuenta;
    private String clientName;
    private double saldo;
    protected int codigoSeg;

    public Banco(){

    }
    public Banco(String _numCuenta, String _clienteName, double _saldo, int _codigoSeg){

        this.numCuenta = _numCuenta;
        this.clientName = _clienteName;
        this.saldo = _saldo;
        this.codigoSeg = _codigoSeg;
    }
    public Banco(String _numCuenta, int _codigoSeg){
        this.numCuenta = _numCuenta;
        this.codigoSeg = _codigoSeg;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigoSeg() {
        return codigoSeg;
    }

    public void setCodigoSeg(int codigoSeg) {
        this.codigoSeg = codigoSeg;
    }
}
