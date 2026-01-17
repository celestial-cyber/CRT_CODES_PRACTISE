/*
Question:
Given an array of integers of size n, find the length of the longest contiguous subarray
in which elements are strictly increasing (each element > previous one). [web:175][web:179]

Idea:
- Scan from left to right.
- Maintain:
  - currentLen: length of current increasing subarray.
  - maxLen: maximum length found so far.
- If arr[i] > arr[i-1], extend currentLen.
- Otherwise, reset currentLen to 1 (start new subarray at i).
- Answer is maxLen.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        System.out.println(maxLen);
        sc.close();
    }
}
