//Problema 2: imprimir los numeros de manera inversa
class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};

    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.print(numbers[i] + " ");
    }
  }
}
