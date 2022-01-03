package Punto.Clonable;

public class Rectangulo implements Cloneable {
// Punto origen, objeto de la clase punto
    private Punto origen;
    //dimensiones
    private int ancho, alto;
//Contructores
    public Rectangulo(){
        this.origen=new Punto(0,0);
        this.alto=0;
        this.ancho=0;
    }
    public Rectangulo(Punto p, int alto, int ancho){
        this.origen=p;
        this.alto=alto;
        this.ancho=ancho;
    }
//redefiniendo la función miembro de clone de Object
     public Object clone(){
        Rectangulo obj = null;
        try {
            obj= (Rectangulo) super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("no se ha podido clonar el rectángulo");
        }
//conamos el objeto punto del rectángulo
        obj.origen = (Punto)obj.origen.clone();
        return obj;
     }
    public Object cloneSuperficial(){
        Rectangulo obj = null;
        try {
            obj= (Rectangulo) super.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("no se ha podido clonar el rectángulo");
        }
//conamos el objeto punto del rectángulo
        return obj;
    }

    public Punto getOrigen() {
        return this.origen;
    }
    public String toString(){
        String display;
        display= this.origen.toString()+ " ancho: "+ this.ancho + " alto "+ this.alto;
        return display;
    }
}
