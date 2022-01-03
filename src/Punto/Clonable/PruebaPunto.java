package Punto.Clonable;

import java.util.logging.SocketHandler;

public class PruebaPunto {

//Clonacion del punto
    public static void main(String args[]){
        Punto miPunto = new Punto(4,5);
        System.out.println("Punto recién creado:");
        System.out.println(miPunto.toString());
//Voy a clonar mi punto
        Punto miPunto2 = (Punto) miPunto.clone();
        System.out.println("Punto clonado:");
        System.out.println(miPunto2.toString());
//Creación del rectángulo
        Rectangulo miRectángulo = new Rectangulo(new Punto(4,5),7,8);
//clonación del rectángulo
        Rectangulo miRectángulo2= (Rectangulo) miRectángulo.clone();
        Rectangulo miRectángulo3= (Rectangulo) miRectángulo.cloneSuperficial();
        System.out.println("rectángulo original"+ miRectángulo.toString());
        System.out.println("rectángulo clonado en profundidad "+ miRectángulo2.toString());
        System.out.println("rectángulo clonado superfifial "+ miRectángulo3.toString());
    }

}
