/*
Question:
Given an array of positive integers and an integer Target, find the minimum length of a contiguous
subarray whose sum is greater than or equal to Target. If no such subarray exists, print 0.

Description:
- Input:
    - Integer Target: required minimum sum.
    - Integer N: number of elements.
    - N space-separated positive integers.
- Output:
    - The minimum length of a contiguous subarray whose sum ≥ Target.
    - Print 0 if no such subarray exists.

Approach (Sliding Window) [web:75][web:78][web:80][web:81][web:82]:
- Maintain a window [left, right] and its current sum.
- Expand right, adding elements to sum until sum ≥ Target.
- Then shrink from left while sum ≥ Target, updating the minimum length.
- Time complexity: O(N), space complexity: O(1), since each element enters and leaves the window at most once.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long target = sc.nextLong();
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        long sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < N; right++) {
            sum += arr[right];

            while (sum >= target) {
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                }
                sum -= arr[left];
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLen);
        }

        sc.close();
    }
}
