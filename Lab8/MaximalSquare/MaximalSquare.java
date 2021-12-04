//Problema 5
//maximalSquare(matriz de unos y ceros): Calcula el área del cuadrado más grande que se pueda formar, los cuadrados
//                                       se forman con los 1's de la matriz.

public class MaximalSquare {

    public static void main(String[] args) {
        char[][] matrix
                = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};

        System.out.println(maximalSquare(matrix));
    }

    public static int maximalSquare(char[][] matrix) {
        int fila = matrix.length;
        int col = matrix[0].length;

        int[][] cuad = new int[fila + 1][col + 1];

        int resp = 0;

        for (int i = 1; i <= fila; i++) {       //recorremos la matriz y ubicamos los 1's
            for (int j = 1; j <= col; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    cuad[i][j] = Math.min(cuad[i - 1][j], Math.min(cuad[i][j - 1], cuad[i - 1][j - 1])) + 1; 
                    //Si hay 1's suficientes para formar un cuadrado más grande, sino seguirá del mismo tamaño.

                    if (resp < cuad[i][j]) {    //la respuesta se actualiza con la longitud del cuadrado posible.
                        resp = cuad[i][j];
                    }
                }
            }
        }

        return resp * resp;
    }
}
