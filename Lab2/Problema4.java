//Problema 4
//busqueda(int[]array, int value) busca el value en el array
//crear Array(int cantidad), crea los valores del array de acuerdo a la cantidad
//imprimir(int[]array) imprime el array
public class Main {

    public static void main(String[] args) {
        int[] array = crearArray(10000);
        double inicio = System.nanoTime();
        imprimir(array);
        System.out.println("Se encuentra 15? " + busqueda(array, 15));
        double fin = System.nanoTime();
        System.out.println("Se demoró: " + (fin - inicio) + " nanosegundos");
    }

    public static boolean busqueda(int[] array, int n) {
        boolean resp = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n) {
                resp = true;
                break;
            }
        }
        return resp;
    }

    public static int[] crearArray(int cant) {
        int[] arr = new int[cant];
        for (; cant > 0; cant--) {
            arr[cant - 1] = cant;
        }
        return arr;
    }

    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}