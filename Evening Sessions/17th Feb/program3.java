//replace every element with its before number 
import java.util.*;
class Solution{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    int array[] = new int[size];

    for(int i =0 ;i<size;i++){
        array[i] = in.nextInt();
    }
    for(int i = 0;i<size ; i++){
        array[i]= array[i]-1;
        System.out.print(array[i]);
    }
    }
    
}