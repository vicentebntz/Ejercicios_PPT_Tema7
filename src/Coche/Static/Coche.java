package Coche.Static;

/**
 * la clase tiene los atributos color, marca, modelo, matrícula y kilometraje como atributos de instancia
 * y kilometrajeTotal y numCoches como atributos de la clase
 */
public class Coche {
    private String color, marca, modelo, matrícula;
    private double kilometraje;
    static double kilometrajeTotal=0;
    static int numCoches=0;

    /**
     * Cada vez que llamemos a alguno de los constructores aumentaremos el numero de coches, objetos, creados
     * con la variable de clase numCoches
      */
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

    /**
     *método público para obtener el valor del cuenta kilometros de cada coche
     * @return kilometraje de cada coche
     */

    public double getKilometraje(){
        return kilometraje;
    }

    /**
     * método estático para obtener el kilometraje total
     * @return kilometrajeTotal, contiene los km recorridos por todos los coches
     */

    static double getKilometrajeTotal(){
        return kilometrajeTotal;
    }

    /**
     * método público para aumentar los kilómetros que recorre un coche
     * @param kilometraje con los km que acaba de recorrer un coche con los que aumentaremos su
     * cuenta kilómetro
     */

    public void recorre (double kilometraje){
        this.kilometraje+=kilometraje;
        kilometrajeTotal +=kilometraje;
    }


}
