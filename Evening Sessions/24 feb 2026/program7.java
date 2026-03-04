//sum of elements at even index greater than twice k 
//6
//3 15 8 22 14 30
//7

//output = 0 

//5
//20 5 25 2 30
//10

//output = 55 


import java.util.*;

public class program7 {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        
    int size = in.nextInt();
    int array[]= new int[size];
        
    for(int i = 0 ; i<size; i++){
        array[i] = in.nextInt();
    }
        
    int target = in.nextInt();
    int sum = 0;
        boolean found = false;
    for(int i = 0 ;i<size;i++){
        if(array[i]> 2*target){
            sum+=array[i];
            found = true;
        }
    }
        System.out.println(found ? sum : 0);
    
    }
}
