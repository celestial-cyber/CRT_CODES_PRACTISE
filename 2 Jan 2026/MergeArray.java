import java.util.*;

class MergeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // First array
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // Second array
        int m = in.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        // Result array
        int res[] = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Merge step
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        // Copy remaining elements
        while (i < n) {
            res[k++] = a[i++];
        }
        while (j < m) {
            res[k++] = b[j++];
        }

        // Print merged array
        for (int x = 0; x < res.length; x++) {
            System.out.print(res[x] + " ");
        }
    }
}
