//Problema 3
//findNumberOfLIS(lista de numeros): Encuentra el total de subsecuencias crecientes de la lista, que tengan
//                                   la mayor longitud.
public class NumberOfLIS {

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(findNumberOfLIS(nums));
    }

    public static int findNumberOfLIS(int[] nums) {
        int x = nums.length;

        int[] lis = new int[x];             //guarda el largo de la(s) subsecuencia(s)
        int[] cont = new int[x];            //numero de subsecuencias con dicho largo

        for (int i = 0; i < x; i++) {       //se inicializan con 1
            lis[i] = 1;
            cont[i] = 1;
        }

        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (lis[j] >= lis[i]) {
                        lis[i] = lis[j] + 1;            //la lista creciente aumento de tamaño
                        cont[i] = cont[j];      
                    } else if (lis[i] == lis[j] + 1) {  //existe otra subsecuencia con el mismo tamaño
                        cont[i] += cont[j];             //aumenta el numero de subscuencias de dicho tamaño
                    }
                }
            }
        }

        int largo = 0;
        for (int i = 0; i < x; i++) {           //determina largo máximo de entre todas las subsecuencias
            if (lis[i] > largo) {
                largo = lis[i];
            }
        }

        int resp = 0;
        for (int i = 0; i < x; i++) {           //cuenta el total de listas con el largo máximo
            if (lis[i] == largo) {
                resp += cont[i];
            }
        }

        return resp;
    }
}
