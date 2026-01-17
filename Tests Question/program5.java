/*
Question:
You are given an array of integers of size N and an integer K. Count the number of unique index pairs (i, j) such that i < j and the absolute difference of the corresponding elements is exactly K.

Description:
- Input:
    - An integer N: number of elements in the array.
    - An integer K: the required absolute difference.
    - N space-separated integers: the array elements.
- For each pair of indices (i, j) with i < j:
    - Compute |arr[i] - arr[j]|.
    - If the result equals K, count that pair.
- Each pair is counted only once.
- Output:
    - A single integer: the number of valid pairs.

Notes and required behavior:
- Constraints: 1 ≤ N ≤ 10^5, 0 ≤ K ≤ 10^9, elements are integers.
- Brute force O(N^2) is too slow for N up to 10^5.
- Efficient idea using frequency map / hash map [web:45][web:48][web:49]:
    - Count frequencies of each value.
    - If K > 0:
        - For each distinct value x, if (x + K) also appears, then all pairs (x, x + K) contribute freq[x] * freq[x + K].
    - If K == 0:
        - For each value x with frequency f, the number of index pairs using that value is f * (f - 1) / 2.
- This runs in O(N) expected time and uses O(N) extra space.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();

        Map<Integer, Long> freq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            freq.put(x, freq.getOrDefault(x, 0L) + 1L);
        }

        long count = 0;

        if (K == 0) {
            for (long f : freq.values()) {
                if (f > 1) {
                    count += f * (f - 1) / 2;
                }
            }
        } else {
            for (int x : freq.keySet()) {
                int y = (int)(x + K);
                if (freq.containsKey(y)) {
                    count += freq.get(x) * freq.get(y);
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
