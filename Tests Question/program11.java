/*
Question:
Count the total number of inversions in an array.
An inversion is a pair (i, j) such that i < j and arr[i] > arr[j].

Description:
- Input:
    - Integer N: number of elements.
    - N space-separated integers arr[0..N-1].
- Output:
    - A single integer: total number of inversions.

Notes:
- Constraints here allow N up to 10^3, so O(N^2) is acceptable.
- For larger N, a merge sort based O(N log N) algorithm is commonly used. [web:115][web:116][web:121]
- Simple approach:
    - Use two nested loops.
    - For each i, check all j > i.
    - If arr[i] > arr[j], increment the count.
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

        long inversions = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    inversions++;
                }
            }
        }

        System.out.println(inversions);
        sc.close();
    }
}
