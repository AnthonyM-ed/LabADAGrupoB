//Complexity of ...
public class Q9 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = 0; i * i < n; i++) {
            //statement
        }
    }
}
// Condition       i * i < n
// To finish       i * i >= n
// We assume that     i^2 = n
//                      i = sqrt(n)
//O(sqrt(n))