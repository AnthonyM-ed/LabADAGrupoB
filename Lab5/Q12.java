//Complexity of ...
public class Q12 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {            
            for (int j = 1; j < n; j = j * 2) {  
                //statement                  
            }
        }
    }
}
//O(n log(n))