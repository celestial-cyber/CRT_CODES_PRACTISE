/*
Question:
You are given an array of size n containing integers from 1 to n.
Exactly one number is missing and one number is repeating exactly once.
Find and print:
Missing:x Repeating:y

Description:
- Input:
    - Integer n: size of the array.
    - n space-separated integers, each in [1, n].
- Output:
    - Print: Missing:<missing> Repeating:<repeating>

Approach (frequency array, O(n) time, O(n) space) [web:145][web:150][web:151]:
- Create a frequency array freq[1..n], initialized to 0.
- Traverse the input array and increment freq[arr[i]].
- Traverse 1..n:
    - If freq[i] == 0 → i is the missing number.
    - If freq[i] == 2 → i is the repeating number.
- Print them in the required format.
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
            freq[x]++;
        }

        int missing = -1;
        int repeating = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] == 2) {
                repeating = i;
            }
        }

        System.out.println("Missing:" + missing + " Repeating:" + repeating);

        sc.close();
    }
}
