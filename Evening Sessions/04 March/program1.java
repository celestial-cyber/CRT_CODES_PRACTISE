//smart restaurant token system 
//curstomers arrive and take a token number they are served one by onein token order 
//task 1. issue tokens 2. calling token for service 3. handling cancellations , stopping when all customers are served
//system rules -> token starts from 1 , the restaurant can issue upto N tokens 
//for each token customer may cancel (1=cancel, 0=not cancel)
//cancelled tken must be slipped 
//the system must : 1. print token issued 2.if token is cancelled , 3. call tokens one by one , 4. skip cancelled tokens 
//after serving all valid token print final message 
//input format - N -> numbers of cumstomerrs 
// n integer (0 or 1)
//0 = customer stays , 1- customer cancels

//constraints - 1<= N <= 20, cancellation value mus tbe 0 or 1 
// sample input 
//5
//0
//1
//0
//0
//1
//sample output -> 
//token 1 issued 
//token 2 issued 
//token 3 issued 
//token 4 issued 
//token 5 issued 

//token  2 cncelled 
//token 5 cancelled 

//calling token 1 for service 
//serving token 1 completed.


//calling token 3 for service 
//serving token 3 completed.


//calling token 4 for service 
//serving token 4 completed.

// all customer served . counter closed 
import java.util.*;
pimport java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int N = sc.nextInt();
        int[] tokens = new int[N];
        for(int i = 0; i < N; i++) {
            tokens[i] = sc.nextInt();
        }
        
        
        for(int i = 1; i <= N; i++) {
            System.out.println("token " + i + " issued");
        }
        
        System.out.println();
        for(int i = 1; i <= N; i++) {
            if(tokens[i-1] == 1) {
                System.out.println("token " + i + " cancelled");
                
            }
        }
        System.out.println();
        for(int i = 1; i <= N; i++) {
            if(tokens[i-1] == 0) {
                System.out.println("calling token " + i + " for service");
                System.out.println("serving token " + i + " completed.");
                System.out.println();  
            }
        }
        
        System.out.println("all customer served . counter closed");
        
        sc.close();
    }
}
