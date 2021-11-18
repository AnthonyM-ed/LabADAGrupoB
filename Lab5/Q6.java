//Complexity of ...
public class Q6 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        int p = 0
        for (int i = 1; p <= n; i++) {
            p = p + i;
        }
    }
}
//  i       p
// ------------------------
//  1       0 + 1 = 1
//  2       1 + 2
//  3       1 + 2 + 3
//  4       1 + 2 + 3 + 4
//  .    
//  .    
//  .    
//  k       1 + 2 + 3 + 4 + ... + k

// Assume k > n
// p = k * (k + 1) / 2
//               p > n
// k * (k + 1) / 2 > n
// k^2 > n
// k > sqrt(n)
// O(n^(1/2))