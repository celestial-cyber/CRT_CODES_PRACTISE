//finding count of even numbers
import java.util.*;

class program7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[]= new int[size];
       
        int count;
        for(int i=0;i<size;i++){
            array[i]= in.nextInt();
        }
        
       count = array[0];
       
       for(int i =0;i<size;i++){
           if(array[i]<count){
               count = array[i];
           }
       }
        
        System.out.print(count);
    }
}
