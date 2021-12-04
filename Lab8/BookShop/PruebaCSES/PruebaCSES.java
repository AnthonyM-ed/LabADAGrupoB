//Problema 2
//maxPages(precios, páginas, presupueto, capacidad): Nos devuelve la cantidad máxima de páginas de libros que
// 
import java.util.*;
public class PruebaCSES {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();      //capacidad
        int x = sc.nextInt();     //dinero disponible (presupuesto)
        
        int[] prices = new int[n];
        int[] pages = new int[n];
        
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }
        
        System.out.println(maxPages(prices, pages, x, n));
    }

    public static int maxPages(int[] prices, int[] pages, int x, int n) {
        int[][] paginas = new int[n + 1][x + 1]; //Creamos una matriz donde se van a agregar las páginas de los libros

        //Rellenamos la 1ª fila de ceros
        for (int i = 0; i <= x; i++) {
            paginas[0][i] = 0;
        }
        //Rellenamos la 1ª columna de ceros
        for (int i = 0; i <= n; i++) {
            paginas[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {                  //recorremos las siguientes columnas
            for (int j = 1; j <= x; j++) { 
                if (j < prices[i - 1]) {                //si no hemos sobrepasado el precio del libro
                    paginas[i][j] = paginas[i - 1][j];    //Se guarda el mismo libro
                } else {
                    if (paginas[i - 1][j] > paginas[i - 1][j - prices[i - 1]] + pages[i - 1]) {   //Si aún no se puede comprar otro libro debido al precio del siguiente libro 
                        paginas[i][j] = paginas[i - 1][j];                                        //Se continua con las páginas del mismo libro
                    } else {
                        paginas[i][j] = paginas[i - 1][j - prices[i - 1]] + pages[i - 1];         //Se compra el siguiente libro y agregan las páginas de este mismo
                    }
                }
            }
        }
        return paginas[n][x];
    }
}
