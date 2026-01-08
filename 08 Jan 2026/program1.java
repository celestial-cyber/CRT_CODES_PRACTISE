//program to fidn the duplicate array elements // array size 6 -> 1 9 1 9 9 1 -> 1 1 9 9 1 9 
//if the numer is matching (comparrison is made between all the numbers and that digit )-> check ne by one if they are same then print the numbers 
import java.util.*;
class program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i =0 ; i< size ;i++){
            arr[i]= sc.nextInt();

        }
        for(int i=0;i<size;i++){
            for(int j =1 ; i<size ; j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[j]+ " ");
                }
            }
        }

    }

}