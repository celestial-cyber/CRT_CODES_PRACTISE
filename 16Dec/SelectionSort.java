import java.util.*;

public class SelectionSort {  // Changed class name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        /* 
         * SELECTION SORT THEORY:
         * ---------------------
         * - Divide the array into sorted and unsorted parts.
         * - Initially, the sorted part is empty and unsorted part is the whole array.
         * - Find the smallest element in the unsorted part.
         * - Swap it with the first element of the unsorted part.
         * - Move the boundary of the sorted part one step forward.
         * - Repeat until the whole array is sorted.
         *
         * TIME COMPLEXITY: O(n^2)
         * SPACE COMPLEXITY: O(1)
         *
         * EXAMPLE:
         * Input:  [64, 25, 12, 22, 11]
         * Step 1: find min=11, swap with 64 -> [11, 25, 12, 22, 64]
         * Step 2: find min=12, swap with 25 -> [11, 12, 25, 22, 64]
         * Step 3: find min=22, swap with 25 -> [11, 12, 22, 25, 64]
         * Step 4: min=25 (already in place) -> [11, 12, 22, 25, 64]
         * Sorted array: [11, 12, 22, 25, 64]
         */

        for (int i = 0; i < n - 1; i++) {//last element si always sorted so take n-1
            int minIndex = i;  // assume first element of unsorted part is minimum
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;  // found new minimum
                }
            }
            // Swap the found minimum element with first element of unsorted part
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
