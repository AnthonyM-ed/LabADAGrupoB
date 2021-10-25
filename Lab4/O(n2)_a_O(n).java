//Transformar O(n^2) a O(n)
//greatestNumber() encuentra el mayor numero de una array

import java.util.Arrays;

public class Problema1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7};
        System.out.println(Arrays.toString(array));
        System.out.println("El mayor es: " + greatestNumber(array));
    }

    public int greatestNumber(int[] array) {
        int numb = 0;
        for (int i = 0; i < array.length; i++) {
            if (numb < array[i]) {
                numb = array[i];
            }
        }
        return numb;
    }
}
