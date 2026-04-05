import java.io.*;
import java.util.*;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] results = new int[n];
        
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            num = Math.abs(num);  
            
            int sum = 0;
            int position = 1;
            
           
            while(num > 0) {
                int digit = num % 10;
                sum += digit * position;
                position++;
                num /= 10;
            }
            
            results[i] = sum;
        }
        
      
        for(int i = 0; i < n; i++) {
            if(i > 0) System.out.print(" ");
            System.out.print(results[i]);
        }
    }
}