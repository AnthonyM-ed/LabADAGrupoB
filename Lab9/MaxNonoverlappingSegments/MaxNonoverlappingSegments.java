//Problema 1
//De dos Arrays encontrar el tamaño de un conjunto no superpuesto que contenga el número máximo de 
//segmentos, son superpuestas si tienen un punto en comun.
//solution(segmentos A, segmentos B): Devuelve el tamaño de un conjunto no superpuesto que contiene 
//                                    un número máximo de segmentos.

public class MaxNonoverlappingSegments {

    public static void main(String[] args) {
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};

        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {
        int n = A.length;
        if (n <= 1) {
            return n;
        }

        int cont = 1;
        int aux = B[0];

        for (int i = 1; i < n; i++) {
            if (A[i] > aux) {
                cont++;
                aux = B[i];
            }
        }

        return cont;
    }
}
