/*
Question:
Given an array, replace each element with the greatest element among the elements to its right.
The last element should be replaced with -1. [web:195][web:196][web:197][web:199][web:200][web:201]

Efficient approach (right-to-left, O(n) time, O(1) extra space):
- Traverse the array from right to left.
- Maintain maxRight = maximum value seen so far to the right.
- For each index i (from n-1 down to 0):
    - Store current = arr[i].
    - Replace arr[i] with maxRight.
    - Update maxRight = max(maxRight, current).
- Initialize maxRight = -1 so that the last element becomes -1.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long maxRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            long current = arr[i];
            arr[i] = maxRight;
            if (current > maxRight) {
                maxRight = current;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
