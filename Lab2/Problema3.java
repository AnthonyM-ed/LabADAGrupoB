//Problema 3
//sort(int[]array) realiza el ordenamiento del array
//imprimir(int[]array) imprime el array
public class Main {
    public static void main(String[] args) {
        int[]arr={3,1,4,7,19,11,15,6,12};
        imprimir(arr);
        sort(arr);
        imprimir(arr);
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
    public static void imprimir(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
