//dynamic loop boundary modification 
//input is positive integer = limit - for loop runs from i=1 and is expected to execute while i<=limit - inside the loop 
// to i<=limit - inisde the loop the current value of i in printed - and the limit value is decremented by 1 during iteration 
//task is to determine the exact output produced by the program fora  given input 
import java.util.*;

class prgram1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int limit = in.nextInt();

       
        for(int i = 1 ;i <=limit-2;i++){
            System.out.print(i);
        }
        limit--;
        
    }

}