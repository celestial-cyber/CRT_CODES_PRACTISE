//always take one temporary variable to store the original value 
import java.util.*;
class SumDigits{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = n;
        int s= 0;
        while(t>=10){
            
            while(t!=0){
                s= s+(t%10);
                t=t/10;
            }
           
        }
        System.out.print(s);
        
    }
}
