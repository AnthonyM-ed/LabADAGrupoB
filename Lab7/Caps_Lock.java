/*
Problema 3
Se ingresa una cadena, si se lee $ se guarda lo que había en la cola, si se lee @ todo lo de la cola se 
torna en mayusculas y tambien los que sigan hasta que se lea @ de nuevo.
caplock(String ingresado): para cada caracter del string se revisa si es $ o @ para realizar la accion necesaria.
Si toca $ guarda lo del queue en resp y borra el contenido del queue.
*/
import java.util.*;

public class Queue1 {

    public static void main(String[] args) {
        String str = "abc$d@ef$@g$";
        System.out.println(capLock(str));
    }

    public static String capLock(String str) {
        Queue<String> p = new LinkedList<>();

        String resp = "";
        Boolean mayus = false;
        for (int i = 0; i < str.length(); ++i) {
            int size = p.size();
            if (str.charAt(i) == '$' && !p.isEmpty()) {
                for (int j = 0; j < size; j++) {
                    resp += p.peek();
                    p.remove();
                }
            } else {
                if (str.charAt(i) == '@') {
                    mayus = !mayus;
                    if (mayus) {
                        for (int j = 0; j < size; j++) {
                            resp += p.peek().toUpperCase();
                            p.remove();
                        }
                    }
                } else {
                    if (mayus) {
                        p.add(String.valueOf(str.charAt(i)).toUpperCase());
                    } else {
                        p.add(String.valueOf(str.charAt(i)));
                    }
                }
            }
        }
        return resp;
    }
}
