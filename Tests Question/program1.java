//finding an array index such that ths sum of the elements to the left is equl to right 
//index element should not be included 
import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        int total = 0;

        for(int i =0;i<size; i++){
            array[i]=in.nextInt();
            total += array[i];
        }
        int left  =0;
        int result = -1;

        for(int i =0;i<size;i++){
            int right = total-left-array[i];
            if(left == right){
                result = i;
                break;
            }
            left += array[i];
        }
        System.out.println(result);
        in.close();



    }
}