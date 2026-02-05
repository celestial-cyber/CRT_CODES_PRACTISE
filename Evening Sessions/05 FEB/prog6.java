//create a new array with each element = previous + next

import java.util.*;
class prog6{
public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int array[] = new int[size];
    int array2[] = new int[size];

    for(int i = 0;i<size;i++){
        array[i]= in.nextInt();
    }

    for(int i = 0;i<size;i++){
        if(i==0){
            array2[i] = array[i+1]; //only next
        }
        else if(i == size-1){
            array2[i] = array[i-1];
        }
        else{
            array2[i] = array[i-1] + array[i+1];
        }
    }

    for(int i =0;i<size;i++){
        System.out.println(array2[i] + " ");
    }




}
}