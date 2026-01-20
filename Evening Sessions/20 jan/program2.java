import java.util.*;

public class program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int count = 0;
        int remainder;
        int num2 = number;
        
        while(number!=0){
           number = number / 10;
           count++;
        }
        
        remainder = num2 % count;
        
        System.out.println(remainder);
        
       
    }
}