//fidning missing element in cnsecutive series 
//5
//1 2 3 5 6 - print missing element that is 4 
import java.util.*;
class program7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];


        for(int i =0;i<n;i++){
            a[i]= sc.nextInt();
        }
        //for(int i=0;i<n-1 ; i++){
        // if (a[i+1]-a[i]!=1){
        //System.out.print(a[i]+1)}}

        for(int i = a[0] ; i<n;i++){
            if (i==a[i]){
                continue;
            }
            else{
                System.out.print("Missing element is " + a[i]);
            }
        }


    }


}