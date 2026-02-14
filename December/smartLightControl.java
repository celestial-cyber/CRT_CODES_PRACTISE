import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int total = 0;
        int i = 1;

        while (i <= t) {
            int energy;

            // Odd → 2, Even → 3
            if (i % 2 == 0) {
                energy = 3;
            } else {
                energy = 2;
            }

            // Double if divisible by 5
            if (i % 5 == 0) {
                energy *= 2;
            }

            total += energy;

            // Skip next if total divisible by 7
            if (total % 7 == 0) {
                i += 2;
            } else {
                i += 1;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
