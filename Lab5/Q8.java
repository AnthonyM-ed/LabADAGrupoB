//Complexity of ...
public class Q8 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = n; i >= 1; i = i/2) {
            //statement
        }
    }
}
//  i       
// ------------------------
//  n
//  n / 2
//  n / 2^2
//  n / 2^3
//  .
//  .
//  .
//  n / 2^k


// Assume that i < 1
// Therefore n / 2^k < 1
//           n / 2^k = 1
//                 n = 2^k
//                 k = log_2(n)
//O(log_2(n))