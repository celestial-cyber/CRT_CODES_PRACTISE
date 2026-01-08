//finding count of odd numbers
import java.util.*;

class program6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[]= new int[size];
       
        int count = 0;
        for(int i=0;i<size;i++){
            array[i]= in.nextInt();
        }
        
        for(int i=0;i<size;i++){
            if(array[i]%2!=0){
                count++;
            }
        }
        
        System.out.print(count);
    }
}
