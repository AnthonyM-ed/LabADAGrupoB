//Problema 1
//uniquePathsWithObstacles(matriz): Determina los caminos posibles desde el primer término al último
//                                  de la matríz.
public class UniquePathII {

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int fila = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] caminos = new int[fila][col];
        boolean obstaculo = false;                              //determina la evaluación de un obstáculo

        for (int i = 0; i < col; i++) {                         //Evaluamos la primera columna
            if (!obstaculo && obstacleGrid[0][i] == 0) {        //Si no pasó por algún obstaculo y es 0
                caminos[0][i] = 1;
            } else {
                caminos[0][i] = 0;
                obstaculo = true;
            }
        }

        obstaculo = false;

        for (int i = 1; i < fila; i++) {                        //Evaluamos la primera fila
            if (!obstaculo && obstacleGrid[i][0] == 0) {        //Si no pasó por algún obstaculo y es 0
                caminos[i][0] = 1;
            } else {
                caminos[i][0] = 0;
                obstaculo = true;
            }
        }

        obstaculo = false;

        for (int i = 1; i < fila; i++) {                        //Evaluamos las demás filas y columnas
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    caminos[i][j] = caminos[i - 1][j] + caminos[i][j - 1];
                } else {
                    caminos[i][j] = 0;
                }
            }
        }

        return caminos[fila - 1][col - 1];
    }
}
