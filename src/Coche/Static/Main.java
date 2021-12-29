package Coche.Static;


public class Main {
    public static void main(String[] args){
//Creamos varios coches
        Coche cocheDePepa = new Coche("rojo","Mercedes", "93", "SE-9991-NBM",45000.4);
        Coche cocheDeJuan = new Coche("gris plata","BMW", "2021", "9991-XXX",4.5);
        Coche otroCoche=new Coche();
        Coche otroCocheMas=new Coche();
//Mostramos ambos coches
        System.out.println("Coche de Juan ");
        System.out.println(cocheDeJuan);
        System.out.println("Coche de Pepa");
        System.out.println(cocheDePepa);
// ahora vamos a hacerle kilometros a ambos coches
        cocheDePepa.recorre(30);
        cocheDePepa.recorre(40);
        cocheDePepa.recorre(220);
        cocheDeJuan.recorre(60);
        cocheDeJuan.recorre(150);
        cocheDeJuan.recorre(90);
        System.out.println("El coche de Pepa ha recorrido " + cocheDePepa.getKilometraje() + " Km");
        System.out.println("El coche de Juan ha recorrido " + cocheDeJuan.getKilometraje() + " Km");
        System.out.println("Los km recorridos por los coches ha sido de " + Coche.getKilometrajeTotal() + " KM");
        System.out.println("el número de coches creados es de "+ Coche.numCoches);
// estado final de cada coche
        System.out.println("Coche de Juan ");
        System.out.println(cocheDeJuan);
        System.out.println("Coche de Pepa");
        System.out.println(cocheDePepa);
        System.out.println("Coche 3");
        System.out.println(otroCoche);
        System.out.println("Coche 4");
        System.out.println(otroCocheMas);



    }
}


