import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read first array
        System.out.print("Enter size of first array: ");
        int n1 = in.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }

        // Read second array
        System.out.print("Enter size of second array: ");
        int n2 = in.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = in.nextInt();
        }

        // Merge arrays
        int[] c = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            c[i] = a[i];
        }
        for (int i = 0, j = n1; i < n2; i++, j++) {
            c[j] = b[i];
        }

        // Print arrays separately
        System.out.println("\nFirst array:");
        for (int i = 0; i < n1; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSecond array:");
        for (int i = 0; i < n2; i++) {
            System.out.print(b[i] + " ");
        }

        // Print merged array
        System.out.println("\nMerged array:");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(c[i] + " ");
        }

        in.close();
    }
}
