//sum of even indexed element 
//replace every element with its before number 
import java.util.*;
class Solution{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    int array[] = new int[size];
    int sum = 0;

    for(int i =0 ;i<size;i++){
        array[i] = in.nextInt();
        
    }
    for(int i = 1;i<size;i++){
        if(i%2==0){
            sum = sum+ array[i];
        }
    }
    System.out.println(sum);
    
    }
    
}