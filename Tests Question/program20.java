/*
Question:
Given an array of integers, find the maximum sum of any contiguous subarray
using Kadane’s Algorithm. [web:205][web:206][web:208][web:209][web:210][web:212][web:214]

Key Kadane idea (handles negatives correctly):
- Maintain:
  - currentSum = best sum ending at current index.
  - maxSum = best sum seen so far.
- Initialize both with the first element.
- For each element arr[i] (i from 1 to n-1):
  - currentSum = max(arr[i], currentSum + arr[i])
  - maxSum = max(maxSum, currentSum)
- At the end, maxSum is the answer (works even if all numbers are negative).
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

        long currentSum = arr[0];
        long maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
        sc.close();
    }
}
