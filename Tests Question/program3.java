/*
Question:
Given a positive integer N, raise each digit to the power of its position (1-based, right to left)
and output the sum of these powered digits.

Description:
- Input: A single positive integer N (1 ≤ N ≤ 10^9).
- Number the positions of the digits from right to left starting at 1.
- For each digit d at position p, compute d^p and add it to a running sum.
- Output the final sum.

Example:
N = 123
Right to left: 3 (pos 1), 2 (pos 2), 1 (pos 3)
Sum = 3^1 + 2^2 + 1^3 = 3 + 4 + 1 = 8

N = 456
Right to left: 6 (pos 1), 5 (pos 2), 4 (pos 3)
Sum = 6^1 + 5^2 + 4^3 = 6 + 25 + 64 = 95
*/
import java.util.*;

public class program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int position = 1;
        long sum = 0;

        while (n > 0) {
            int digit = (int)(n % 10);
            long value = 1;
            for (int i = 0; i < position; i++) {
                value *= digit;
            }
            sum += value;
            n /= 10;
            position++;
        }

        System.out.println(sum);
        sc.close();
    }
}
