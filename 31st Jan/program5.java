// 5
//9 12 1 19 22 
// 2 4 
// if the number found is even then print its product

// all odd numbers 
//print no even numbers 
import java.util.*;
class program5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int a[]= new int[size];
        int product=1;
        int c = 0;

        int result[] = new int[size];
        for(int i =0;i<size;i++){
            a[i]= in.nextInt();
            int t = a[i];
            if(t%2==0){
                while(t!=0){
                int r =t%10;
                product = product * r;
                t= t/10;
                }
            
            result[c]= product;
            c++;
            }}
            if(c==0){
                System.out.println("No Even numbers");
            }
            else{
                for(int i =0;i<c;i++){
                    System.out.println(result[i]+" ");
                }
            
            
        }
    }

        


    }




