package Cuadrado2.toString;

public class Cuadrado {
    private int lado;
    public Cuadrado(int lado){
        this.lado=lado;
    }

    /**
     *
     * @return display el cuadrado pintado con el tamaño de lado del objeto
     */
    public String toString() {
        String display = "";
//pintamos la base
        for (int i = 0; i < this.lado; i++) {
            display += "*";
        }
        display += "\n";
//pintamos los lados, primero un asteriscos, luego los blancos y al final otro asterisco con el salto de linea
        for (int i=1; i< this.lado-1; i++) {
            display += "*";
            for (int j = 1; j < this.lado - 1; j++) {
                display += " ";
            }
            display += "*\n";
        }
//pintamos el ultimo lado del cuadrado
        for (int j = 0; j < this.lado; j++) {
            display += "*";
        }
        display += "\n";

        return display;

    }
}
