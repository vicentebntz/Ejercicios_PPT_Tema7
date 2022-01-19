package Cuenta.Visibilidad;

public class Cuenta {
    public String nombre;
    private double saldo;
    String dni;

    /**
     * creo solo el constructor, desde el main voy a acceder a todos los atribitos sin get para ver
     * qué pasa
     * @param nombre
     * @param saldo
     * @param dni
     */
    public Cuenta(String nombre, double saldo, String dni) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

