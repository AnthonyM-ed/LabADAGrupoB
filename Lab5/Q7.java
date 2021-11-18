//Complexity of ...
public class Q7 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = 1; i < n; i = i*2) {
            //statement
        }
    }
}
//  i       
// ------------------------
//  1       
//  1 * 2 = 2
//  2 * 2 = 2^2
//  2 * 2^2 = 2^3
//  .    
//  .    
//  .    
//  2^k

// Assume i >= n
// Therefore i = 2^k
//      2^k >= n
//       2^k = n
//         k = log_2(n)
// O(log_2(n))