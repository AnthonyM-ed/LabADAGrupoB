/*Problema 3
Cuánto dinero en efectivo se puede obtener de las personas que están actualmente en la cola antes de que cierre el banco 
sirviendo como máximo a una persona por minuto.
maxAmount(N personas, T minutos): Devuelve el máximo de dinero que se puede obtener.
*/
import java.util.*;

public class BankQueue {

    private static class Person implements Comparable<Person> { //Clase Persona

        private int money;                                      //monto a depositar
        private int time;                                       //minutos disponibles

        public Person(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Person person) {                   //Para poder realizar comparaciones
            int pm = person.money;
            int pt = person.time;

            if (money < pm) {
                return -1;
            }
            if (money > pm) {
                return 1;
            }
            if (time < pt) {
                return -1;
            }
            if (time > pt) {
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int T;
        N = sc.nextInt();
        T = sc.nextInt();

        System.out.println(maxAmount(N, T));
    }

    public static int maxAmount(int N, int T) {
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        int index = 0;

        PriorityQueue<Person> queue = new PriorityQueue<>(N, Collections.reverseOrder()); //Cola de prioridad con comparador inverso

        for (int i = 0; i < N; i++) {                               //añadimos las personas
            queue.add(new Person(sc.nextInt(), sc.nextInt()));
        }

        boolean[] flags = new boolean[T];                           //cada bandera representa un minuto del tiempo que estará abierto el banco
        Person auxPerson;

        while (index < N && !queue.isEmpty()) {                     //Recorremos las personas de la cola
            auxPerson = (Person) queue.poll();                      //devuelve el elemento máximo de la cola
            int cont = auxPerson.time;                              //tiempo que la persona está disponible

            while (cont >= 0 && flags[cont]) {                      //Determina el tiempo que le queda a la persona
                cont--;                                             
            }

            if (cont != -1) {                                       //si la persona aún tiene tiempo
                index++;
                flags[cont] = true;                                 //pasó un minuto
                amount += auxPerson.money;                          //se realiza el deposito
            }
        }
        return amount;
    }
}
