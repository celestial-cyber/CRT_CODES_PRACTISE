import java.util.*;

class FindOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] a = new int[n];
        int[] odd = new int[n];
        int[] even = new int[n];
        int ev = 0, od = 0; // index counters

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] % 2 == 0) {
                even[ev] = a[i];
                ev++;
            } else {
                odd[od] = a[i];
                od++;
            }
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        if (ev == 0) {
            System.out.println("None");
        } else {
            for (int i = 0; i < ev; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
        }
        // Print odd numbers
        System.out.print("Odd numbers: ");
        if (od == 0) {
            System.out.println("None");
        } else {
            for (int i = 0; i < od; i++) {
                System.out.print(odd[i] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
