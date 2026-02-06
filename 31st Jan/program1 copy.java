//Session by Chary Sir 
//divide the array into two parts - reverse teh first half and second half seperately 
// 6
// 3 5 6 3 2 4 
// 6 5 3 4 2 3 
import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int a[] = new int[size];
        for(int i = 0;i<size;i++){
            a[i]= in.nextInt();
            if(size>2){
                for(i =size/2-1;i>=0;i--){
                    System.out.println(a[i]+" ");
                }
                for(i=size-1;i>=size/2;i++){
                    System.out.println(a[i]+" ");
                }
            }

                
                else {
                    for(i = size-1;i>=0;i++){
                        System.out.println(a[i]+" ");

                    }
                }
        }
    }
}


                
            

        
        

    

