//replace all negativenumber with 0 
import java.util.*;
class Solution{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    int array[] = new int[size];

    for(int i =0 ;i<size;i++){
        array[i] = in.nextInt();
        if (array[i]<=0){
            array[i]=0;
        }
        System.out.print(array[i]+" ");
    }
    
    }
    
}