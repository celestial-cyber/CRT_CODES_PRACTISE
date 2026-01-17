/*
Question:
You are given an array of integers of size N. Find the second smallest distinct element in the array
without sorting. If it does not exist, print -1.

Description:
- Input:
    - Integer N: number of elements.
    - N space-separated integers (can repeat).
- Output:
    - The second smallest distinct element.
    - Or -1 if there is no second distinct minimum.

Approach (single pass, O(N) time, O(1) extra space) [web:95][web:99][web:100]:
- Maintain two variables:
    - smallest: current smallest element.
    - secondSmallest: current second smallest distinct element.
- Initialize both to large sentinel values.
- For each x in array:
    - If x < smallest:
        - secondSmallest = smallest
        - smallest = x
    - Else if x > smallest and x < secondSmallest:
        - secondSmallest = x
- At the end:
    - If secondSmallest is still sentinel (no update), print -1.
    - Else print secondSmallest.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            long x = sc.nextLong();

            if (x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x > smallest && x < secondSmallest) {
                secondSmallest = x;
            }
        }

        if (secondSmallest == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondSmallest);
        }

        sc.close();
    }
}
