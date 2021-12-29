package Madera.enumerado;

public class Main {
    enum TipoDeMadera {ROBLE, CAOBA, NOGAL,CEREZO, PINO};
    public static void main (String[] args) {
        TipoDeMadera madera = TipoDeMadera.ROBLE;
        System.out.println("La madera elegida por el usuario es de "+ madera.toString());
        System.out.println("¿Es la madera elegida por el usuario de Caoba? Resultado: " +
                (madera==TipoDeMadera.CAOBA));
        System.out.println("¿Es la madera elegida por el usuario de Roble? Resultado: " +
                (madera==TipoDeMadera.ROBLE));
    }
}
