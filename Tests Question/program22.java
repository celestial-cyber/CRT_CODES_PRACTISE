/*
Question:
You are given an array of size n containing integers from 1 to n (not necessarily all present).
Count the frequency of each number and:
- If all numbers from 1..n appear exactly once, print: All 1
- Otherwise, print only the numbers that actually appear, in the format: num:freq (space-separated),
  in increasing order of num, for those with freq > 0. [web:215][web:216][web:217]

Approach:
- Use an int[] freq of size n+1 (1-based indexing).
- For each value x in the array, increment freq[x].
- Check if every freq[i] == 1 for i in 1..n:
    - If yes, print "All 1".
    - Else, for each i with freq[i] > 0, append "i:freq[i]" to output.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 1 && x <= n) {
                freq[x]++;
            }
        }

        boolean allOne = true;
        for (int i = 1; i <= n; i++) {
            if (freq[i] != 1) {
                allOne = false;
                break;
            }
        }

        if (allOne) {
            System.out.println("All 1");
        } else {
            StringBuilder sb = new StringBuilder();
            boolean first = true;
            for (int i = 1; i <= n; i++) {
                if (freq[i] > 0) {
                    if (!first) sb.append(' ');
                    sb.append(i).append(':').append(freq[i]);
                    first = false;
                }
            }
            System.out.println(sb.toString());
        }

        sc.close();
    }
}
