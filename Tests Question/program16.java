/*
Question:
Check if an array is strictly sorted in increasing order and then possibly rotated.
Array is valid if it can be obtained by rotating a strictly increasing array (or is itself strictly increasing).

Key idea [web:165][web:166][web:174]:
- For a strictly increasing sorted-and-rotated array with distinct elements:
  - When traversing circularly, the sequence should have at most one "drop"
    where arr[i] > arr[(i+1) % n].
- If:
  - There are 0 such drops → array is strictly increasing (no rotation) → YES.
  - There is 1 such drop → sorted and rotated → YES.
  - More than 1 drop → NO.
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

        int breaks = 0;
        for (int i = 0; i < n; i++) {
            int next = arr[(i + 1) % n];
            if (arr[i] > next) {
                breaks++;
            }
        }

        if (breaks <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
