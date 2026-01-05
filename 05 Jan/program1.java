//7 take two pinter one will start from 0 and other will start from left (n-1)
//if the element is greater than pivot element - put in in left side else right side 

//make an unsorted array such that all the smalleer elements than pivot element is in left else right side 

import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int res[] = new int[n];

        for(int i =0 ; i < n ;i++){
            a[i]= sc.nextInt();
        }
        int index = sc.nextInt();
        int pivot = a[index];
        int left = 0 , right = n-1;

        for(int i = 0 ; i < n ;i++){
            if(index==i){
                continue;
            }
            if (a[i]<pivot){
                res[left++]= a[i];
            }
            else{
                res[right--]=a[i];
            }

        }
        res[left]= pivot;
        for(int i  =0 ; i < n;i++){
            System.out.print(res[i]+" ");
        }



    }
}