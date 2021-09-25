//Problema 3
class Main {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
            System.out.print(numbers[i]);
        } 
    }
    System.out.println("");
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 != 0) {
            System.out.print(numbers[i]);
        } 
    }
  }
}