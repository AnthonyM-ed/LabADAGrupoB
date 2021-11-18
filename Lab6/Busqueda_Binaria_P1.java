//Determinar si el numero n es cuadrado usando busqueda binaria.
//binarySearch(arreglo de números, numero a determinar): busca en el arreglo un número que al elevarlo al cuadrado
//                                                       nos de el número a determinar, sino no es cuadrado.
public class BinarySearch1 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int n = 16;
        int pos = binarySearch(arr, n);

        if (pos * pos == n) {
            System.out.println("Es cuadrado");
        } else {
            System.out.println("No es cuadrado");
        }
    }

    public static int binarySearch(int arr[], int n) {
        int down = 0;
        int top = arr.length - 1;

        while (down <= top) {
            int middle = (int) ((top + down) / 2);
            int middElem = arr[middle];

            if (middElem * middElem == n) {
                return middle;
            }
            if (middElem * middElem > n) {
                top = middle - 1;
            } else {
                down = middle + 1;
            }
        }
        return -1;
    }
}