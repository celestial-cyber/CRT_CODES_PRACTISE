/*
Question:
Given an array, remove only consecutive duplicate elements, keeping the first element of each
consecutive group, and print the resulting array.

Description:
- Input:
    - Integer N: number of elements.
    - N space-separated integers.
- Output:
    - The array after removing consecutive duplicates, preserving original order of remaining elements.
- Example:
    - [1, 1, 2, 2, 3, 3] → [1, 2, 3]
    - [4, 4, 4, 4, 4] → [4]
Approach:
- Read first element, print/store it.
- For each next element, print/store it only if it differs from the previous element.
- Single pass, O(N) time, O(1) extra (besides output).
[web:136][web:137]
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        if (N > 0) {
            sb.append(arr[0]);
            for (int i = 1; i < N; i++) {
                if (arr[i] != arr[i - 1]) {
                    sb.append(' ');
                    sb.append(arr[i]);
                }
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
