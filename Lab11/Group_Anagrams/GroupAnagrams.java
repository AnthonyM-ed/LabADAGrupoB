//Problema 1
//ordenar las palabras en conjuntos de acuerdo a laas letras que las conformen
//groupAnagrams(lista de palabras): si las palabras tienen las mismas letras pertencen al mismo conjunto, devuelve una lista
//con todos los conjuntos posibles formados.

import java.util.*;

public class GroupAnagrams {
	public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"}; 
        GroupAnagrams group = new GroupAnagrams();
        System.out.println(group.groupAnagrams(strs));
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagrams = new HashMap<>();   //llave (sorted character) y valor (string)
        for (String str : strs) {
            char[] charStrs = str.toCharArray();                //Obtenemos los caracteres de la palabra       e,a,t
            Arrays.sort(charStrs);                              //Ordenamos los caracteres                     a,e,t
            String tempStr = String.valueOf(charStrs);          //formamos un nuevo string de los caracteres   aet
            if(!anagrams.containsKey(tempStr)){                 //si no contiene la llave 
                anagrams.put(tempStr, new ArrayList<>());       //agregamos la llave y una lista que tendrá los valores
            }
            anagrams.get(tempStr).add(str);                     //en la llave (tempStr) agregamos la palabra
        }
        return new ArrayList<>(anagrams.values());
    }
}