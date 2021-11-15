/*
La entrada es una matriz con  símbolos que representen muros y espacios  vacios, y un punto de  inicio, lo que 
se quiere es pintar los vecinos laterales del punto de inicio y lo mismo para sus vecinos, no se pueden pintar
muros y se está usando recursividad.

MÉTODOS:
    initTable(matriz, tabla de puntos, símbolo de muro, símbolo de espacio vacío):
        Lee la matriz de ingreso y de acuerdo a los símbolos inicializa la tabla de puntos (Point).

    printTable(tabla de puntos):
        Imprime la tabla de puntos.

    paintTable(tabla de puntos, punto para analizar): METODO RECURSIVO
        Pinta el punto a analizar si este no es un muro o ya está pintado, antes de analizar a sus vecinos
        se  usan condicionales  para  que no se trate de analizar vecinos que no  sean ni muros o pintados,
        simplemente que salgan del rango de la matriz.
*/
public class DFS {

    public static void main(String[] args) {
        String[][] matrix = {
            {"#", "#", "#", "#", "#", "#"},
            {"#", "o", "o", "o", "o", "#"},
            {"#", "o", "o", "o", "o", "#"},
            {"#", "o", "o", "o", "o", "#"},
            {"#", "o", "o", "o", "#", "o"},
            {"#", "#", "#", "#", "o", "o"}
        };

        Point[][] table = new Point[matrix.length][matrix[0].length];
        initTable(matrix, table, "#", "o"); 
        printTable(table);

        int row = 2, col = 2; 
        Point initPoint = table[row][col]; //punto de inicio

        if (initPoint.isWall()) {
            System.out.println("No se puede pintar...");
        } else {
            paintTable(table, initPoint);
        }
    }

    public static void paintTable(Point[][] table, Point p) {
        if (!p.isWall() && !p.isColored()) {
            p.setColored();
            printTable(table);

            int i = p.getY();
            int j = p.getX();

            System.out.println("Se pintó (" + i + "," + j + ")");

            if (i + 1 < table.length) {
                paintTable(table, table[i + 1][j]);
            }
            if (i - 1 >= 0) {
                paintTable(table, table[i - 1][j]);
            }
            if (j + 1 < table[0].length) {
                paintTable(table, table[i][j + 1]);
            }
            if (j - 1 >= 0) {
                paintTable(table, table[i][j - 1]);
            }
        }
    }

    public static void initTable(String[][] matrix, Point[][] table, String wall, String empty) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Point p = new Point(j, i);
                if (matrix[i][j].equals(wall)) {
                    p.setWall();
                    table[i][j] = p;
                }
                if (matrix[i][j].equals(empty)) {
                    table[i][j] = p;
                }
            }
        }
    }

    public static void printTable(Point[][] table) {
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            System.out.print("  " + i + " ");
        }
        System.out.println("");

        for (int i = 0; i < 13; i++) {
            System.out.print("- ");
        }
        System.out.println("");

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print("|");
                System.out.print(" " + table[i][j].toString() + " ");
                if (j == table[0].length - 1) {
                    System.out.print("| " + i + "\n");
                }
            }
            for (int j = 0; j < 13; j++) {
                System.out.print("- ");
            }
            System.out.println("");
        }
    }
}