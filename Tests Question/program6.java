/*
Question:
Given an array arr[0..N-1], count how many indices i are equilibrium indices, i.e., indices where
the sum of elements before i equals the sum of elements after i.

Formal definition:
Index i is an equilibrium index if:
arr[0] + arr[1] + ... + arr[i-1] == arr[i+1] + arr[i+2] + ... + arr[N-1]

Description:
- Input:
    - Integer N: number of elements in the array.
    - N space-separated integers: elements of arr.
- Output:
    - A single integer: the number of equilibrium indices in the array.

Constraints:
- 1 ≤ N ≤ 10^3
- -10^5 ≤ arr[i] ≤ 10^5

Efficient approach (prefix-sum style, O(N) time, O(1) extra space) [web:55][web:56][web:62]:
1) Compute totalSum = sum of all elements.
2) Maintain leftSum = 0.
3) For each index i from 0 to N-1:
    - Right sum after i is rightSum = totalSum - leftSum - arr[i].
    - If leftSum == rightSum, then i is an equilibrium index; increment the count.
    - Add arr[i] to leftSum before moving to the next index.
4) Print the count.
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

        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            long rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                count++;
            }
            leftSum += arr[i];
        }

        System.out.println(count);
        sc.close();
    }
}
