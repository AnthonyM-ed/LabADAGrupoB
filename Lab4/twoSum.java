//Complejidad de ...
//twoSum() muestra los numeros de un array que sumados entre si 
//den como resultado 10, no se puede sumar a si mismo

public class Problema3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7};
        twoSum(array);
    }

    public static void twoSum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && ((array[i] + array[j]) == 10)) {
                    System.out.println(array[i] + " + " + array[j] + " = " + (array[i] + array[j]));
                }
            }
        }
    }
}
//Complejidad de O(n^2)