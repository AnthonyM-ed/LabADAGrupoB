//Problema 1
//crearArray(int cant) crear un array de acuerdo a la cantidad que se pida
//binarySearch(int arr[], int inf, int sup, int x) buscar el valor x dentro
//del array usando la busqueda binaria y mostrar el tiempo que demora
public class Main {

    public static void main(String[] args) {
        int n = 10;
        int arr[] = crearArray(n);
        int sup = n - 1;
        int x = 1;
        double inicio = System.nanoTime();
        int rpta = binarySearch(arr, 0, sup, x);
        double fin = System.nanoTime();
        if (rpta != -1) {
            System.out.println("Encontrado en la posición " + rpta);
        } else {
            System.out.println("No encontrado...");
        }
        System.out.println("Se demoró: " + (fin - inicio) + " nanosegundos");
    }

    public static int[] crearArray(int cant) {
        int[] arr = new int[cant];
        for (int i = 1; i < cant; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int inf, int sup, int x) {
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