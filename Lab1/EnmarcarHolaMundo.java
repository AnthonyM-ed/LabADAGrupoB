//Problema5
//marcoSup(String value) imprime el marco superior para el string
//marcoInf(String value) imprime el marco inferior para el string
class Main {
  public static void main(String[] args) {
    String word = "Hello World!";

    marcoSup(word);
    System.out.print("* " + word + " *");
    marcoInf(word);
  }
  
  public static void marcoSup(String word) {
        System.out.println("");
        for (int i = 0; i < word.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < word.length() + 4; i++) {
            if (i == 0 || i == word.length() + 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public static void marcoInf(String word) {
        System.out.println("");
        for (int i = 0; i < word.length() + 4; i++) {
            if (i == 0 || i == word.length() + 3) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < word.length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
