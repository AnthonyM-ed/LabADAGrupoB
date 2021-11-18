//Complexity of ...
public class Q4 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {       // n + 1
            for (int j = 0; j < n; j++) {   // n * (n + 1)
                //statement                 // n * n
            }
        }
    }
}
//O(n^2)