
//find the elemnst bigger than their previous elements
import java.util.*;

public class Biggest2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int small = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > small) {
                System.out.print(a[i] + " ");
                small = a[i];
            }
        }

        sc.close();
    }
}
