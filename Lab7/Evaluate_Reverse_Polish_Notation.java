//Problema 1
//Importar Stack y leer un array con numeros y simbolos operandos para realizar las operacione necesarias.

//operate(array de valores): lee cada elemento del arraay, si son números continua hasta encontrar un operador, 
//dependiendo del operador realiza una suma, resta, multiplicación o división con los 2 numeros en el tope del stack.
import java.util.*;

public class Stack1 {

    public static void main(String[] args) {
        String[] s = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        int result = operate(s);
        System.out.println(result);
    }

    public static int operate(String[] arr) {

        Stack<String> stack = new Stack<>();
        int x, y;
        String result = "";
        String choice;
        int value = 0;
        String p = "";

        for (String arr1 : arr) {
            if (!"+".equals(arr1) && !"-".equals(arr1) && !"*".equals(arr1) && !arr1.equals("/")) {
                stack.push(arr1);
                continue;
            } else {
                choice = arr1;
            }
            switch (choice) {
                case "+":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "-":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;

                case "*":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "/":
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
