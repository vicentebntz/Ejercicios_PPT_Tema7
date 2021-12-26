package Tema7_Ejercicio_1;

public class Cuenta {

    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;


    public Cuenta() {
        this.nombre = "";
        this.numeroCuenta = "";
        this.saldo = 0;
        this.tipoInteres = 0;

    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;

    }

    public Cuenta(Cuenta c) {
        this.nombre = c.nombre;
        this.numeroCuenta = c.numeroCuenta;
        this.saldo = c.saldo;
        this.tipoInteres = c.tipoInteres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTipoInteres() {
        return this.tipoInteres;
    }

    public boolean ingreso(int importe) {
        boolean resultado = false;
        if (importe > 0) {
            this.saldo += importe;
            resultado = true;
        }
        return resultado;
    }

    public boolean reintegro(int importe) {
        boolean resultado = false;
        if (( importe > 0 ) && ( this.saldo > importe )) {
            this.saldo -= importe;
            resultado = true;
        }
        return resultado;
    }

    public boolean transferencia(Cuenta cuentaDestino, int importe) {
        boolean resultado = false;
        if (this.reintegro(importe)) {
            cuentaDestino.ingreso(importe);
            resultado = true;
        }
        return resultado;
    }

}