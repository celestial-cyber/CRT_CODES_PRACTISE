/*
Question:
Given an array where each element represents the maximum number of steps you can jump forward from that position, find the minimum number of jumps required to reach the last index from the first index. If it is not possible, print -1.

Greedy approach idea [web:155][web:156][web:157][web:159]:
- If n == 1, already at the end → 0 jumps.
- If arr[0] == 0 and n > 1 → cannot move → -1.
- Maintain:
    - maxReach: farthest index reachable so far.
    - steps: steps remaining within the current jump range.
    - jumps: number of jumps used.
- Iterate i from 1 to n-1:
    - Update maxReach = max(maxReach, i + arr[i]).
    - Use one step: steps--.
    - When steps becomes 0, a new jump is needed:
        - jumps++.
        - If current index i >= maxReach → cannot go further → -1.
        - Else set steps = maxReach - i (new range).
- If we reach or pass n-1, return jumps.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static int minJumps(int[] arr, int n) {
        if (n == 1) return 0;
        if (arr[0] == 0) return -1;

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;
                if (i >= maxReach) return -1;
                steps = maxReach - i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = minJumps(arr, n);
        System.out.println(ans);

        sc.close();
    }
}
