//Complexity of ...
public class Q12 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {           //This repeats n times      
            for (int j = 1; j < n; j = j * 2) { // and this inner loop n times * log(n)
                //statement                     //and this statement n times * log(n) 
            }
        }
    }
}

//O(n log(n))