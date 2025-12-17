import java.util.*;

public class SelectionSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No elements to sort.");
            sc.close();
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Sort in ascending or descending? (A/D): ");
        char choice = sc.next().toUpperCase().charAt(0);

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int selectedIndex = i;
            for (int j = i + 1; j < n; j++) {
                if ((choice == 'A' && a[j] < a[selectedIndex]) || 
                    (choice == 'D' && a[j] > a[selectedIndex])) {
                    selectedIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[selectedIndex];
            a[selectedIndex] = temp;
        }

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
