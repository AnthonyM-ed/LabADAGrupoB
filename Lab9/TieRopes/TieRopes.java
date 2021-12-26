/*Problema 2
Unir los segmentos de tal manera que el número de segmentos cuya longitud sea mayor o igual que K sea máximo.
solution(longitud minima, segmentos): Devuelve el número máximo de segmentos de longitud mayor o igual que K 
									que se pueden crear.
*/                                    
public class TieRopes {

    public static void main(String[] args) {
        int k = 4;
        int[] A = {1, 2, 3, 4, 1, 1, 3};

        System.out.println(solution(k, A));
    }

    public static int solution(int k, int[] A) {
        int sgmts = 0;								
        int length = 0;

        for (int i = 0; i < A.length; i++) {
            length += A[i];
            if (length >= k) {
                sgmts++;
                length = 0;
            }
        }
        return sgmts;
    }
}
