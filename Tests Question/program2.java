import java.util.*;

/*
Question:
Given a positive integer N and a digit range [low, high], compute the sum of all digits of N
that lie within this inclusive range.

Description:
- You are given:
    - A positive integer N (1 ≤ N ≤ 10^9)
    - Two integers low and high such that 0 ≤ low ≤ high ≤ 9
- Consider each digit of N independently.
- If a digit d of N satisfies low ≤ d ≤ high, add d to the result.
- Output the final sum.

Example:
Input:  123 2 4
Digits: 1, 2, 3
Valid digits in [2,4] → 2 and 3, sum = 5
Output: 5

Input:  567 6 8
Digits: 5, 6, 7
Valid digits in [6,8] → 6 and 7, sum = 13
Output: 13
*/

public class program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();   // positive integer N
        int low = sc.nextInt();   // lower bound of digit range
        int high = sc.nextInt();  // upper bound of digit range
        
        int sum = 0;
        
        // Process each digit of N
        while (N > 0) {
            int digit = (int)(N % 10);  // extract last digit
            if (digit >= low && digit <= high) {
                sum += digit;          // add if within [low, high]
            }
            N /= 10;                   // remove last digit
        }
        
        System.out.println(sum);
        
        sc.close();
    }
}
