//replace every element with maximun element 
//5
//1 2 3 4 5 
//5 5 5 5 5
import java.util.*;
class program6{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];

        for(int i = 0 ; i<size ;i++){
            array[i]= in.nextInt();
        }

        int max = array[0];
        for(int i = 1; i<size ; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        for(int i = 0 ;i<size;i++){
            array[i]=max;
        }

        for(int i = 0 ;i<size;i++){
            System.out.print(array[i]);
        }



    }
}