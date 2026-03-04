//if the size of the list is even replace with 1 else replace with 0 
import java.util.*;
class program3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[]= new int[size];

        for(int i = 0;i<size;i++){
            array[i]= in.nextInt();
        }

        if(size%2==0){
            for(int i = 0;i<size;i++){
                array[i]=0;
            }
        }
        else{
            for(int i = 0;i<size;i++){
                array[i]=1;
            }
        }

       for(int i =0;i<size;i++){
        System.out.print(array[i]);
        
       }
    }

}