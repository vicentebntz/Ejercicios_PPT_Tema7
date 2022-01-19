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
    void setMaterial(String material) {

        this.material = material;
    }
    void setColor(String color) {

        this.color = color;
    }
    void setAsa(Boolean asa) {

        this.asa = asa;
    }

    public void setCapacidad(int capacidad) {

        this.capacidad = capacidad;
    }

    public void setContenido(int litros) {

        this.contenido = litros;
    }

    /**
     * Método para vaciar el cubo. No se requiere precondiciones
     * para vaciar el cubo igualamos el contenido a cero
      */
    public void vacia() {
        this.contenido = 0;
    }

    /**
     * Método sobrecargado de vacia(). se vaciará el cubo en tantos litros como se indique por parámetros.
     * si la cantidad de litros es negativa o 0 se devovlera un -1,si se desea vaciar más litros que el contenido
     * del cubo, devolverá la cantidad de litros que sobran y vaciará el cubo, si no, vaciará el cubo en los
     * litros indicados y devolverá 0
      * @param litros
     * @return
     */
    public int vacia(int litros){
        int rtdo;
        if (litros <= 0)
            rtdo=-1;
        else
            if (litros > (this.capacidad-this.contenido)) {
                this.vacia();
                rtdo = litros - this.capacidad;
            }else{
                this.capacidad -= litros;
                rtdo=0;

            }
        return rtdo;
    }

    /**
     * Llena el cubo al máximo de su capacidad.
     * NO se requieren precondiciones
     * Para llenar el cubo igualamos el contenido a la capacidad
     */
    public void llena() {
        this.contenido = this.capacidad;
    }

    /**
     * Precondición. ninguna
     * Método llena sobrecargado. el método validará que los litros a llenar han de ser >= que 0
     * si rebosa el cubo devolverá el número de litros que no ha podido llenar, si los litros son negativos,
     * devolverá -1, en caso contrario devolverá 0
     * @param litros
     * @return entero que indica si se ha podido realizar la opción y en su caso los litros que no han cabido en
     * el cubo destino
     */
    public int llena (int litros){
        int rtdo;
        if (litros < 0)
            rtdo = -1;
        else
            if (litros> (this.capacidad-this.contenido)) {
                this.llena();
                rtdo = litros - this.capacidad;
            }else{
                this.contenido+=litros;
                rtdo=0;
            }
        return rtdo;


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
//pintamos con toString
@Override
public String toString() {
    StringBuilder stringBuilder= new StringBuilder();
    stringBuilder.append("propiedades de Cubo:");
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append("material " + this.material );
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append ( "asa " + this.asa );
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append ( "color " + this.color );
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append ( "capacidad " + this.capacidad );
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append ( "contenido " + this.contenido );
    stringBuilder.append(System.lineSeparator());
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
        if (this.contenido >= nivel) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append ("#~~~~~~~~#");

        } else {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append( "#        #" );
        }
    }
    stringBuilder.append(System.lineSeparator());
    stringBuilder.append( "##########" );
    return stringBuilder.toString();
}

    /**
     * Vuelca el contenido de un cubo sobre otro.
     * Antes de echar el agua se comprueba cuánto le cabe al
     * cubo destino.
     */
    /**
     * Vuelca un cubo en otro
     * @param cuboOrigen
     * vuelca un cubo en otro solo la cantidad de litros que quepa en el cubo destino
     * he creado dos métodos distintos. este primero no lo llama nadie, solo de muestra
     */
    public void volcarCubo1(Cubo cuboOrigen) {
        int capacidadLibre = this.capacidad - this.contenido;
        //controlo si me va a caber o no toda el agua en el cubo destino(this)
        if (cuboOrigen.getContenido() <= capacidadLibre) {
            this.contenido += cuboOrigen.getContenido();
            cuboOrigen.vacia();
        } else {

            cuboOrigen.setContenido(cuboOrigen.getContenido() - capacidadLibre);
            this.llena();
        }
    }

    /**
     *
     * @param cuboOrigen
     * Similar al método anterior pero reusando los métodos de llenar y vaciar sobrecargados
     *
     */
        public void volcarCubo(Cubo cuboOrigen){
//control es para saber el resultado del método llena
            int control;
//lamo al metodo de llenar para llenar el cubo destino con el contenido del cubo origen
            control= this.llena(cuboOrigen.contenido);
            if (control>0){
                cuboOrigen.vacia();
                cuboOrigen.llena(control);
            }
            else{
                if (control==0){
                    cuboOrigen.vacia();
                }
            }

    }

    /**
     * similar al método anterior pero más simplificado aún
     * @param cuboOrigen
     */
    public void volcarCubo2(Cubo cuboOrigen) {
// directamen lleno el cubo destino, vacío el origen y lo lleno con lo que me devuelva el método de
// llenado del cubo
        int control = this.llena(cuboOrigen.contenido);
        this.vacia();
        this.llena(control);
    }
}

