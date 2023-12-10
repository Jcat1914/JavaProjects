package Modelos;

public class Cliente{
    private String nombre;
    private int idCuenta;
    private double saldo;
    private String codigoSeg;

    public Cliente(){

    }
    public Cliente(String _nombre, int _idCuenta, double _saldo, String _codigoSeg){
        this.nombre = _nombre;
        this.idCuenta = _idCuenta;
        this.saldo = _saldo;
        this.codigoSeg = _codigoSeg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCodigoSeg() {
        return codigoSeg;
    }

    public void setCodigoSeg(String codigoSeg) {
        this.codigoSeg = codigoSeg;
    }


}
