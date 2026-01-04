//print the number of specific  digit number 
//foud the frequency of digits starting from one digit to maximum digit
//maintai three arrays 1. array will store the numbers , counter array will store the number of digits c[0] will maintain the number of diigitts presents 
//in the array[0] and result array will store the numbers of numbers having specific digits like result[1] -> 
//frequency of numbers having one digits in their number 

import java.util.*;

class Solution{
    public static void main(String arga[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int a[] = new int[n];

        int c[] = new int[n];

        int res[] = new int[n];
        int max =0;

        for(int i = 0 ; i < n;i++){
            a[i] = in.nextInt();
            while(a[i]!=0){
                c[i]++;
                a[i]= a[i]/10;
            }
        res[c[i]]++;
        if(c[i]>max){
            max=c[i];
        }
        
        System.out.println(i + " " +res[i]+" ");
        }



    }
}
