/*
Question:
You are given an array of integers of size N and an integer K. Rotate the array to the right by K positions in-place (without using any extra array) and print the resulting array.

Description:
- Input:
    - An integer N: number of elements in the array.
    - An integer K: number of positions to rotate to the right.
    - N space-separated integers: the array elements.
- Right rotation by K:
    - Each element moves K positions to the right.
    - Elements that go past the end wrap around to the beginning.
- Important details:
    - Use only in-place operations (no extra array for rotation).
    - If K ≥ N, use K = K % N as the effective rotation.
    - If K % N == 0, the array remains unchanged.
- Output:
    - Print the rotated array as space-separated integers on a single line.

Approach (Reversal Algorithm for Right Rotation) [web:35][web:39][web:40][web:41]:
1) Normalize K: K = K % N.
2) Reverse the entire array.
3) Reverse the first K elements.
4) Reverse the remaining N - K elements.
This performs the right rotation in O(N) time and O(1) extra space.
*/
import java.io.*;
import java.util.*;

public class program4 {

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (N > 0) {
            K = K % N;

            if (K != 0) {
                reverse(arr, 0, N - 1);
                reverse(arr, 0, K - 1);
                reverse(arr, K, N - 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i > 0) sb.append(' ');
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());

        sc.close();
    }
}
