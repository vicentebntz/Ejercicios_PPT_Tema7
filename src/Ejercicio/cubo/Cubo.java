package Ejercicio.cubo;
/**
 * Cubo.java
 * Definición de la clase Cubo
 *         */
public class Cubo {
// atributos ////////////////////////////

    String material, color;
    boolean asa;
    int capacidad; // capacidad máxima en litros
    int contenido; // contenido actual en litros

    // constructores
    public Cubo(){
        this.capacidad=10;
        this.contenido=0;
        this.material="plástico";
        this.asa = false;
        this.color="negro";
    }
    // otro constructor
    public Cubo (String material, String color, Boolean asa, int capacidad, int contenido) {
        this.material=material;
        this.color=color;
        this.asa= asa;
        this.capacidad = capacidad;
        this.contenido=contenido;
    }
    // constructor copia
    public Cubo (Cubo cubo){
        this.material=cubo.material;
        this.color=cubo.color;
        this.asa=cubo.asa;
        this.capacidad= cubo.capacidad;
        this.contenido=cubo.contenido;
    }
    // métodos getter
    public String getMaterial(){
        return this.material;
    }
    public String getColor(){
        return this.color;
    }
    public Boolean getAsa(){
        return this.asa;
    }
    public int getCapacidad() {

        return this.capacidad;
    }

    public int getContenido() {

        return this.contenido;
    }

    // métodos setter
    /*void setMaterial(String material) {

        this.material = material;
    }
    void setColor(String color) {

        this.color = color;
    }
    void setAsa(Boolean asa) {

        this.asa = asa;
    }
       */
    public void setCapacidad(int capacidad) {

        this.capacidad = capacidad;
    }

    public void setContenido(int litros) {

        this.contenido = litros;
    }

    // otros métodos
    // se vacía el cubo
    public void vacia() {

        this.contenido = 0;
    }

    /**
     * Llena el cubo al máximo de su capacidad.
     */
    public void llena() {

        this.contenido = this.capacidad;
    }



    /**
     * Pinta el cubo en la pantalla.
     * Se muestran los bordes del cubo con el carácter # y el
     * agua que contiene con el carácter ~.
     */
    public void pinta() {
        System.out.println("propiedades de Cubo:");
        System.out.println("material "+ this.material);
        System.out.println("asa "+ this.asa);
        System.out.println("color "+ this.color);
        System.out.println("capacidad "+ this.capacidad);
        System.out.println("contenido "+ this.contenido);
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~~~~~#");
            } else {
                System.out.println("#        #");
            }
        }
        System.out.println("##########");
    }

    /**
     * Vuelca el contenido de un cubo sobre otro.
     * Antes de echar el agua se comprueba cuánto le cabe al
     * cubo destino.
     */
    /**
     * Vuelca un cubo en otro
     * @param cuboOrigen
     */
    public void volcarCubo(Cubo cuboOrigen){
        int capacidadLibre= this.capacidad-this.contenido;
        //controlo si me va a caber o no toda el agua en el cubo destino(this)
        if (cuboOrigen.getContenido() <=capacidadLibre ) {
            this.contenido+=cuboOrigen.getContenido();
            cuboOrigen.vacia();
        }
        else {

            cuboOrigen.setContenido(cuboOrigen.getContenido()-capacidadLibre);
            this.llena();
        }
    }
}
