//Encontrar el menor elemento de un array rotado usando binary Search
//binarySearch(array rotado): busca el menor elemento dentro del array, realiza comparaciones con el tope
//rotar(array sin rotar, n): rota los primeros n elementos del array.
import java.util.Arrays;

public class BinarySearch3 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] aux = rotar(arr, 3);
        System.out.println(Arrays.toString(aux));//imprime el array rotado
        int pos = binarySearch(arr);
        System.out.println("El menor es: " + pos);
    }

    public static int binarySearch(int arr[]) {
        int down = 0;
        int top = arr.length;
        int midd = 0;

        while (down < top) {
            midd = down + (top - down) / 2;

            if (arr[midd] > arr[top - 1]) {
                down = midd;
            } else {
                top--;
            }
        }
        return arr[midd];
    }

    public static int[] rotar(int arr[], int n) {
        int[] aux = new int[arr.length];
        int j = n;
        for (int i = 0; i < arr.length; i++) {
            if (j == arr.length) {
                j = 0;
            }
            aux[i] = arr[j];
            j++;
        }
        return aux;
    }
}
