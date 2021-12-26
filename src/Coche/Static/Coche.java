package Coche.Static;

public class Coche {
    private String color, marca, modelo, matrícula;
    private double kilometraje;
    static double kilometrajeTotal=0;
    static int numCoches=0;
    //constructores de la clase
//constructor por defecto
    public Coche(){
        this.color="";
        this.marca="";
        this.matrícula="";
        this.modelo="";
        this.kilometraje=0.0;
        numCoches++;
    }
    //constructor con todos los argumentos
    public Coche( String color, String marca, String modelo, String matrícula, double kilometraje){
        this.color=color;
        this.marca=marca;
        this.matrícula=matrícula;
        this.modelo=modelo;
        this.kilometraje=kilometraje;
        numCoches++;
    }
    //método toString()
    public String toString(){
        String resultado;
        resultado= "--> El coche es de color "+ this.color+ " y la marca y modelo es "+ this.marca+" "+ this.modelo+
                " y la matrícula es " + this.matrícula+ " y el cuenta kilómetro marca "+ this.kilometraje;
        return resultado;
    }
    //método público para obtener el valor del cuenta kilometros de cada coche
    public double getKilometraje(){
        return kilometraje;
    }

    //método estático para obtener el kilometraje total
    static double getKilometrajeTotal(){
        return kilometrajeTotal;
    }
    //método público para los kilómetros que recorre un coche
    public void recorre (double kilometraje){
        this.kilometraje+=kilometraje;
        kilometrajeTotal +=kilometraje;
    }


}
