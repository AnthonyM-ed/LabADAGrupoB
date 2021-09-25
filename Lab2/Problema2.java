//Problema 2
//buscar(int number, int[]array) busca un numero dentro de un array
//retorna true si lo encuentra y false si no.
public class Main {
    public static void main(String[] args) {
        int n = 15;
        int[] array = {1, 4, 8, 9, 11, 15, 7, 12, 13, 6};
        System.out.println("Buscamos: " + n);
        System.out.println(buscar(n, array));
    }

    public static boolean buscar(int n, int[] array) {
        boolean rpta = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                rpta = true;
            }
        }
        return rpta;
    }
}