//find the sum of all array elements 
import java.util.*;
class program3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int sum = 0;

        int array[] = new int[size];
        for(int i =0;i<size;i++){
            array[i]= in.nextInt();
        }

        for(int i =0 ; i<size ; i++){ //size  can be replaced with array.length
            sum = sum + array[i]; //sum+=x;

        }
        System.out.println(sum);

        
    }
}