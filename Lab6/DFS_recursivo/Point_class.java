/*
La clase Point se usa para definir cada espacio de la tabla de puntos.

ATRIBUTOS:
    x: Representa una columna en la tabla, eje x.
    y: Representa una fila en la tabla, eje y.
    wall: Determina si este punto es un muro o no, es false por defecto.
    colored: Determina si este punto está coloreado o no, es false por defecto.

METODOS:
    Point(columna, fila): Constructor de la clase Point.
    Getters y Setters para todos los atributos.
    setWall() y setColored(): cambian el valor de wall y colored a true, no dejan establecer otro valor.
    toString(): retorna un String dependiendo de si este punto es muro(#) o un punto coloreado(0), en la
                clase main se establece que no puede ser ambos.
*/
public class Point {
    
    private int x;
    private int y;
    private boolean wall = false;
    private boolean colored = false;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall() {
        this.wall = true;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored() {
        this.colored = true;
    }

    @Override
    public String toString() {
        if (this.isWall()) {
            return "#";
        } else {
            if (this.isColored()) {
                return "0";
            }
        }
        return " ";
    }
}