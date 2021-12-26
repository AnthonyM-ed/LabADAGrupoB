//Problema 2
import java.util.*;

public class Dyslectionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> word = new ArrayList<>();
        ArrayList<String[]> wordsList = new ArrayList<>();
        int longest = -1;
        int wordsLimit = 0, groupsLimit = 0;

        while (true && wordsLimit < 100 && groupsLimit < 100) {
            String w = sc.nextLine();
            if (sc.hasNextLine()) {
                if (w.equals("")) {
                    wordsList.add(sortList(longest, word));
                    groupsLimit++;
                    word.clear();
                    longest = -1;
                    wordsLimit = 0;
                } else {
                    if (w.length() > longest) {
                        longest = w.length();
                    }
                    word.add(w);
                    wordsLimit++;
                }
            } else {
                wordsList.add(sortList(longest, word));
                groupsLimit++;
                break;
            }
        }

        sc.close();

        for (int i = 0; i < wordsList.size(); i++) {
            for (String string : wordsList.get(i)) {
                System.out.println(string);
            }
            if (i < wordsList.size() - 1) {
                System.out.println();
            }
        }
    }

    public static String[] sortList(int longest, ArrayList<String> words) {
        ArrayList<String> wordsAux = new ArrayList<>();
        String[] resp = new String[words.size()];
        for (String word : words) {
            wordsAux.add(reverse(word));
        }

        Collections.sort(wordsAux);
        int j = 0;
        for (String word : wordsAux) {
            word = reverse(word);
            String space = "";
            for (int i = 0; i < longest - word.length(); i++) {
                space = space + " ";
            }
            resp[j] = space + word;
            j++;
        }
        return resp;
    }

    public static String reverse(String str) {
        String nstr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
}