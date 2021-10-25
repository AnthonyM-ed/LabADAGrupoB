//Complejidad de ...
//everyOther() suma cada elemento de posicion par en el array
//con todos los numeros del array

import java.util.Arrays;

public class Problema2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7};
        System.out.println(Arrays.toString(array));
        everyOther(array);
    }

    public static void everyOther(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    System.out.println(array[i] + array[j]);
                }
                System.out.println();
            }
        }
    }
}
//Complejidad de O(n^2)