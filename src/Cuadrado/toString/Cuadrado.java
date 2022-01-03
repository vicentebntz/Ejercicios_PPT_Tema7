package Cuadrado.toString;

public class Cuadrado {
    int lado;
    //Creación del constructor
    public Cuadrado (int l){
        this.lado=l;
    }

    /**Implementación del método toString()
     * la salida es un String

     */
    @Override
    public String toString(){

        int i, espacios;
        String resultado = "";
//pintamos el lado superior con dos ￿￿ ya que el salto de línea mete un espacio y el dibujo
//quedaría rectangular
        for (i = 0; i < this.lado; i++) {
            resultado += "￿￿";
        }
        resultado += "\n";
//pintamos los lados verticales
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "￿ ";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += "  ";
            }
            resultado += " ￿\n";
        }
//pintamos la base
        for (i = 0; i < this.lado; i++) {
            resultado += "￿￿";
        }
        resultado += "\n";
        return resultado;
    }
}


