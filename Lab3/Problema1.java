//Problema 1
//binarySearch(int arr[], int inf, int sup, int x) buscar el valor x 
//dentro del array usando la busqueda binaria
public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int sup = arr.length - 1;
        int x = 4;
        int rpta = binarySearch(arr, 0, sup, x);

        if (rpta != -1) {
            System.out.println("Encontrado en la posición " + rpta);
        } else {
            System.out.println("No encontrado...");
        }
    }

    public static int binarySearch(int arr[], int inf, int sup, int x) {
        int medio;
        if (sup >= inf) {
            medio = (inf + sup) / 2;
            if (arr[medio] == x) {
                return medio + 1;
            } else if (arr[medio] < x) {
                return binarySearch(arr, medio + 1, sup, x);
            } else {
                return binarySearch(arr, inf, medio - 1, x);
            }

        }
        return -1;
    }
}