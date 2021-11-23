/*
Problema 4
Se ingresa una cadena, si se lee # se borra el caracter anterior a este.
backspace(String ingresado): si lee un # realiza un pop en el deque, para evitar que el pop vote al 
                             elemento equivocado, cada vez que se añade se hace al comienzo del deque (p)
                             y retorna como resultado un nuevo deque (resp) que guarda al deque (p) porque
                             sabemos que los elementos están de atras hacia adelante.
*/
import java.util.*;

public class BackSpace {

    public static void main(String[] args) {
        String str = "abc#de##f#ghi#jklmn#op#";
        Deque<String> bs = backspace(str);
        for (String b : bs) {
            System.out.print(b);
        }
    }

    public static Deque<String> backspace(String str) {
        Deque<String> p = new ArrayDeque<>();
        Deque<String> resp = new ArrayDeque<>();
        
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '#' && !p.isEmpty()) {
                p.pop();
            } else {
                p.addFirst(String.valueOf(str.charAt(i)));
            }
        }
        for (String string : p) {
            resp.addFirst(string);
        }
        return resp;
    }
}
