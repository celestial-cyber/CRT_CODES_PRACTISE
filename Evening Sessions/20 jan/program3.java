import java.util.*;

public class program3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        char character = 'a';
        
        for(int i = 0; i < num ;i++){
            for(int j = 0 ; j<= i ; j++){
                System.out.print ((char)(character+j));
               
            }
            
            System.out.println();
             
        }
    }
}