/*
Question:
Given an array, find the index of a pivot element such that the sum of elements to its left
equals the sum of elements to its right. The pivot element itself is excluded from both sums.
If no such index exists, print -1. [web:185][web:186][web:187][web:189]

Efficient approach (O(n) time, O(1) extra space):
- Compute totalSum = sum of all elements.
- Maintain leftSum = 0.
- For each index i from 0 to n-1:
    - Right sum at i is totalSum - leftSum - arr[i].
    - If leftSum == rightSum, i is pivot → print i and return.
    - Otherwise, update leftSum += arr[i] and continue.
- If no index satisfies the condition, print -1.
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

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;
        int pivotIndex = -1;

        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                pivotIndex = i;
                break;
            }
            leftSum += arr[i];
        }

        System.out.println(pivotIndex);
        sc.close();
    }
}
