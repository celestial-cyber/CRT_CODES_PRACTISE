/*
Question:
Given an array of integers of size N, find the maximum product that can be obtained by multiplying
any two distinct elements (at different indices).

Description:
- Input:
    - Integer N: number of elements.
    - N space-separated integers (can be negative, zero, or positive).
- Output:
    - A single integer: the maximum product of any two distinct elements.

Key idea [web:69][web:70][web:71]:
- The maximum product must be one of:
    1) Product of the two largest numbers.
    2) Product of the two smallest (most negative) numbers.
- Track:
    - max1, max2: largest and second largest.
    - min1, min2: smallest and second smallest.
- Answer = max(max1 * max2, min1 * min2).
- Time: O(N), Space: O(1).
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            long x = arr[i];

            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }

            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }

        long prod1 = max1 * max2;
        long prod2 = min1 * min2;

        long ans = Math.max(prod1, prod2);
        System.out.println(ans);

        sc.close();
    }
}
