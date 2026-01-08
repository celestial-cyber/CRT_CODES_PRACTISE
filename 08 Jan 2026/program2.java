//find the product of all array elements 
import java.util.*;
class program2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int product = 1;

        int array[] = new int[size];
        for(int i =0;i<size;i++){
            array[i]= in.nextInt();
        }

        for(int i =0 ; i<size ; i++){ //size  can be replaced with array.length
            product = product * array[i];

        }
        System.out.println(product);

        
    }
}