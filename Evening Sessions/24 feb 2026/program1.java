//taek input index - if the array[i]==index - skip that element 
import java.util.*;

public class program1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      int size = sc.nextInt();
      int remove = sc.nextInt();
        
      int array[] = new int[size];
        
      for(int i = 0; i<size;i++){
        array[i] = sc.nextInt();
      }
      
        
    for(int i = 0;i<size;i++){
        if(i==remove){
            continue;
        }
        System.out.print(array[i] + " ");
        
        
    }
    
}
}



// 6
//3
//1 2 3 4 5 6 
//1 2 3 5 6 