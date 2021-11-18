//Hallar el inmediato mayor del numero n en el arreglo con busqueda binaria
//binarySearch(arreglo de números, numero a determinar): busca en el arreglo el número n y devuelve el 
//                                                       siguiente número del array.
public class BinarySearch2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int n = 3;
        int pos = binarySearch(arr, n);
        System.out.println(pos);
    }

    public static int binarySearch(int arr[], int n) {
        int down = 0;
        int top = arr.length;
        int midd = 0;

        while (down <= top) {
            midd = down + (top - down) / 2;

            if (arr[midd] == n) {
                return arr[midd + 1];
            } else if (arr[midd] < n) {
                down = midd + 1;
            } else {
                top = midd - 1;
            }
        }
        return arr[midd + 1];
    }
}
