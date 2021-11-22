/*
Problema 2
Calcular el número dde parentesis necesarios para que sean válidos, es valido si tiene una apertura y un cierre ()
tienen que tener continuidad, )( no es válido.
calculateMinParentheses(cadena con los parentesis): recorre la cadena y toma cada caracter para comparar, 
Si es una apertura, lo guarda en el stack, 

si es un cierre y no había alguna apertura con anterioridad, se aumenta el numero de parentesis necesarios,
esto es posible si el stack estaba vacio o si el ultimo elemento añadido no es una apertura.
*/
import java.util.*;

public class Stack2 {

    public static void main(String[] args) {
        String p = "())(((";
        System.out.println("We need to add " + calculateMinParentheses(p) + " more parentheses.");
    }

    public static int calculateMinParentheses(String str) {
        Stack<Character> p = new Stack<>();

        int resp = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '(') {
                p.push(str.charAt(i));
            } else {
                if (p.isEmpty()) {
                    resp++;
                    continue;
                } else if (str.charAt(i) == ')' && p.peek() != '(') {
                    resp++;
                }
                p.pop();
            }
        }
        resp += p.size();
        return resp;
    }
}
