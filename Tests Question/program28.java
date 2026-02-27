//1. start with amount A 
//foreach denominations 
//notes = A/denomination
//add notes to count 
// update A = A% DENOMINATIOn 

import java.util.*;

public class program28{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();

        int[] notes = {2000,500,100,50,20,10,5,2,1};
        int count = 0;

        for(int note : notes){
            count += A / note;
            A= A % note;

        }
        System.out.println(count);
    }
}