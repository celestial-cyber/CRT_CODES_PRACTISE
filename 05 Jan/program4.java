//7
//find elements whose sum is even
//7
//3 2 2 0 5 2 7
//7= target element 
//print the continuos numbers array whose sum is equal to 7 
// 3 2 2 , 3 2 2 0, 2 0 5 , 0 5 2 , 5 2 , 7 
import jsvs.util.*;
class program3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = sc.nextInt();

        int a[]= new int[n];

        int i, j , k , flag =0;

        for(i = 0 ; i <n ;i++){
            a[i]= sc.nextInt();
        }
        

        for(i=0;i<n;i++){
            int sum =0;
            for(j=1;j<n;j++){
                s= s+a[j];
                if(sum%2==0){
                    f++;
            for(k=i;k<j;k++){
                    System.out.print(a[k]+" ");
            }
            System.out.println();
                }
            }
        }
        if(f==0){System.out.print("No Subarray Found");}

    }
}