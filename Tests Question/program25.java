/*
An electricity meter records consumption units dynamically.

You are given U units.

Rules:
1. Units are processed one by one from 1 to U.
2. For each unit:
   - If unit number is divisible by 3 → add 4 charge
   - Else → add 2 charge
3. If unit number is divisible by 6 → add extra 3 charge
4. If total charge becomes divisible by 10 → subtract 5
   (only once per occurrence)

Print the final total charge.

Input Format:
A single integer U — representing total electricity units consumed.

Constraints:
1 ≤ U ≤ 100000

Output Format:
Print a single integer — the final electricity charge.

Sample Input 1:
6

Sample Output 1:
14

Sample Input 2:
3

Sample Output 2:
8

Sample Input 3:
1

Sample Output 3:
2
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
      
        int total_charge = 0;
        
        for(int i =1 ; i<=units ; i++){
            if(i%3 == 0){
                total_charge = total_charge + 4;

            }
            else{
                total_charge = total_charge + 2;
            }
            if(i%6 == 0){
                total_charge = total_charge + 3;
            }
            
                   
            if(total_charge%10==0) {
                total_charge = total_charge - 5;
            }
           
        }
         
       System.out.println(total_charge);
        

    }
    
}