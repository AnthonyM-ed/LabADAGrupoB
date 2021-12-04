//Problema 4
//RectangleCutting: Encuentra el mínimo de cortes necesarios sobre un rectangulo para que quede en 
//                  cuadrados, ademáas sus lados no pueden dividirse en decimales, deben ser siempre
//                  enteros.
import java.util.*;

public class RectangleCutting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] rect = new int[a + 1][b + 1];

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == j) {                       //quiere decir que es cuadrado, entonces no se hacen cortes
                    rect[i][j] = 0;
                    continue;
                }

                int min = Integer.MAX_VALUE;

                for (int k = 1; k < i; k++) {                       //corte en horizontal
                    if ((rect[k][j] + rect[i - k][j]) < min) {
                        min = rect[k][j] + rect[i - k][j];          
                    }
                }
                for (int k = 1; k < j; k++) {                       //corte en vertical
                    if ((rect[i][k] + rect[i][j - k]) < min) {
                        min = rect[i][k] + rect[i][j - k];          
                    }
                }
                rect[i][j] = min + 1;
            }
        }

        System.out.println(rect[a][b]);
    }
}
