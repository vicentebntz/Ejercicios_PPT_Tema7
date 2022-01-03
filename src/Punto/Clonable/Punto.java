package Punto.Clonable;

public class Punto implements Cloneable{
    private int x;
    private int y;

    /**
     * constructores por defecto y con argumnentos
     */
    public Punto(){
    this.x=0;
    this.y=0;

    }
    public Punto(int x, int y){
        this.x=x;
        this.y=y;

    }
    /**
     * método clone
     * @return Object obj
     * para instanciar el objeto obj usamos el método clone() de la clase Object pero tenemos que hacerlo en un try,
     * no directamente en la creación del la variable Obj, si lo hacemos da error porque lo tenemos que incluir
     * dentro de código que controle la excepcion
     */
    public Object clone(){
        Punto obj = null;
        try {
            obj = (Punto) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("no se ha podido duplicar el objeto");
        }
        return obj;
    }

    /**
     * métddo para trasladar un punto las posiciones que se indican en los argumentos
     * @param dx
     * @param dy
     */
    public void trasladar (int dx, int dy){
    this.x +=dx;
    this.y +=dy;
    }

    public String toString(){
        String display = "";
        display = " Coordenadas x,y: "+this.x+ ", " + this.y;
        return display;

    }
// getter
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

}
