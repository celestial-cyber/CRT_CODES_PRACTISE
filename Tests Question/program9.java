/*
Question:
Rearrange the array so that all even numbers appear first and all odd numbers appear after,
while preserving the original relative order within the even group and within the odd group
(stable rearrangement).

Description:
- Input:
    - Integer N: number of elements.
    - N space-separated integers.
- Output:
    - The array rearranged such that:
        - All even numbers come first in their original order.
        - All odd numbers follow in their original order.
- Stable partition idea [web:85][web:86][web:91]:
    - Traverse the array once.
    - Collect even elements in order.
    - Collect odd elements in order.
    - Print all evens, then all odds.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                evens.add(x);
            } else {
                odds.add(x);
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (int x : evens) {
            if (!first) sb.append(' ');
            sb.append(x);
            first = false;
        }

        for (int x : odds) {
            if (!first) sb.append(' ');
            sb.append(x);
            first = false;
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
