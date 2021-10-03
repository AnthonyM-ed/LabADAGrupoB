//Problema 3
//Algooritmo de Gale Shapley
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> mens = new ArrayList<>();
        ArrayList<Persona> women = new ArrayList<>();
        generarPersonas(mens, women);

        System.out.println("Lista de Preferencias");
        System.out.println("Varones");
        print(mens);
        System.out.println("Mujeres");
        print(women);

        galeShapley(mens, women);

        System.out.println("Parejas:");
        printParejas(mens);
    }

    public static void galeShapley(ArrayList<Persona> mens, ArrayList<Persona> women) { //realiza el emparejamiento
        int pos1 = 0, pos2 = 0;
        while (!pairedUp(mens)) {
            Persona m1 = mens.get(pos1);
            Persona w1 = m1.getListaPref().get(pos2);
            if (!w1.isPaired()) {
                m1.setPareja(w1);
                m1.setPaired(true);
                w1.setPareja(m1);
                w1.setPaired(true);
                pos1++;
                pos2 = 0;
                System.out.println(m1.getNombre() + " nueva pareja " + w1.getNombre());

            } else if (cabiariaPareja(w1, m1)) {
                Persona ex = w1.getPareja();
                ex.setPareja(null);
                ex.setPaired(false);
                m1.setPareja(w1);
                m1.setPaired(true);
                w1.setPareja(m1);
                System.out.println(w1.getNombre() + " cambió a " + ex.getNombre() + " por " + m1.getNombre());
                nuevaPareja(ex, w1);
                pos1++;
                pos2 = 0;
            } else {
                if (m1 != w1.getPareja()) {
                    System.out.println(w1.getNombre() + " rechazó a " + m1.getNombre());
                    pos2++;
                } else {
                    pos1++;
                }
            }
        }
    }

    public static void nuevaPareja(Persona unPaired, Persona exWoman) { //busca una nueva pareja para unPaired
        int i = unPaired.getListaPref().indexOf(exWoman);               //sin contar a exWoman de su lista de
        while (true) {                                                  //preferencias
            Persona newPareja = unPaired.getListaPref().get(i + 1);
            if (!newPareja.isPaired()) {
                unPaired.setPareja(newPareja);
                unPaired.setPaired(true);
                newPareja.setPareja(unPaired);
                newPareja.setPaired(true);
                System.out.println(unPaired.getNombre() + " nueva pareja " + newPareja.getNombre());
                break;
            } else {
                i++;
            }
        }
    }

    public static boolean pairedUp(ArrayList<Persona> lista) { //determina si una lista tiene todos sus
        boolean allPaired = true;                              //integrantes emparejados
        for (Persona persona : lista) {
            if (!persona.isPaired()) {
                allPaired = false;
            }
        }
        return allPaired;
    }

    public static void generarPersonas(ArrayList<Persona> mens, ArrayList<Persona> women) { //generar los datos y listas de preferencia
        Persona m1 = new Persona("Willi");
        Persona m2 = new Persona("Xavi");
        Persona m3 = new Persona("Yordy");
        Persona m4 = new Persona("Zeus");
        mens.add(m1);
        mens.add(m2);
        mens.add(m3);
        mens.add(m4);

        Persona w1 = new Persona("Anita");
        Persona w2 = new Persona("Brenda");
        Persona w3 = new Persona("Carla");
        Persona w4 = new Persona("Delia");
        women.add(w1);
        women.add(w2);
        women.add(w3);
        women.add(w4);

        mens.get(0).getListaPref().add(w1);
        mens.get(0).getListaPref().add(w3);
        mens.get(0).getListaPref().add(w2);
        mens.get(0).getListaPref().add(w4);

        mens.get(1).getListaPref().add(w1);
        mens.get(1).getListaPref().add(w2);
        mens.get(1).getListaPref().add(w3);
        mens.get(1).getListaPref().add(w4);

        mens.get(2).getListaPref().add(w4);
        mens.get(2).getListaPref().add(w3);
        mens.get(2).getListaPref().add(w2);
        mens.get(2).getListaPref().add(w1);

        mens.get(3).getListaPref().add(w3);
        mens.get(3).getListaPref().add(w4);
        mens.get(3).getListaPref().add(w1);
        mens.get(3).getListaPref().add(w2);

        women.get(0).getListaPref().add(m1);
        women.get(0).getListaPref().add(m3);
        women.get(0).getListaPref().add(m2);
        women.get(0).getListaPref().add(m4);

        women.get(1).getListaPref().add(m1);
        women.get(1).getListaPref().add(m2);
        women.get(1).getListaPref().add(m3);
        women.get(1).getListaPref().add(m4);

        women.get(2).getListaPref().add(m4);
        women.get(2).getListaPref().add(m3);
        women.get(2).getListaPref().add(m2);
        women.get(2).getListaPref().add(m1);

        women.get(3).getListaPref().add(m3);
        women.get(3).getListaPref().add(m4);
        women.get(3).getListaPref().add(m1);
        women.get(3).getListaPref().add(m2);
    }

    public static boolean cabiariaPareja(Persona woman, Persona man) { //determina si woman cambiaria su pareja actual por man
        ArrayList<Persona> preferW = woman.getListaPref();
        int i = preferW.indexOf(man);                         //posible nueva pareja
        int j = preferW.indexOf(woman.getPareja());           //pareja actual
        return i < j;
    }

    public static void printParejas(ArrayList<Persona> mens) { //imprimie todas las parejas
        for (Persona men : mens) {
            if (men.isPaired()) {
                System.out.println(men.getNombre() + " <=> " + men.getPareja().getNombre());
            } else {
                System.out.println(men.getNombre() + " no tiene pareja...");
            }
        }
    }

    public static void print(ArrayList<Persona> lista) { //imprime las listas de preferencia 
        for (Persona persona : lista) {
            System.out.println(persona.toString());
        }
    }
}
