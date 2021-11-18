//Complexity of ...
public class Q11 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        int p = 0
        for (int i = 1; i < n; i = i * 2) {
            p++;                            // p = log(n)
        }

        for (int j = 1; j < p; j = j * 2) {
            //statement                     // log(p)
        }
    }
}

// So, we have log(p) and p = log(n)
// replacing log log(n)
//O(log log(n))