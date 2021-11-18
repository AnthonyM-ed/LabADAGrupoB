//Complexity of ...
public class Q5 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { //n+1
                //statement
            }
        }
    }
}
// Tracing the values of the variables
//  i   j      no of times
// ------------------------
//  0   0 ❌     0
// ------------------------
//  1   0 ✔️     1
//      1 ❌     
// ------------------------
//  2   0 ✔️     2
//      1 ✔️  
//      2 ❌ 
// ------------------------
//  .    
//  .    
//  .    
// ------------------------
//  n             n

// 1 + 2 + 3 + ... + n = n * (n + 1) / 2    
//O(n^2)