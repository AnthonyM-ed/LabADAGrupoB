//Problema 5
//sort(int[]array) ordena los valores de un array
//crear Array(int cantidad), crea los valores del array de acuerdo a la cantidad
public class Main {

    public static void main(String[] args) {
        int[] array = crearArray(100000);
        double inicio = System.nanoTime();
        sort(array);
        double fin = System.nanoTime();
        System.out.println("Se demoró: " + (fin - inicio) + " nanosegundos");
    }

    public static void sort(int[]arr) {
        int aux, j;
        for (int i = 1; i < arr.length; ++i) {
            j = i;
            aux = arr[i];

            while (j > 0 && arr[j - 1] > aux) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = aux;
        }
    }

    public static int[] crearArray(int cant) {
        int[] arr = new int[cant];
        for (; cant > 0; cant--) {
            int num = (int) (Math.random()*(cant-1)+1);
            arr[cant - 1] = num;
        }
        return arr;
    }
}