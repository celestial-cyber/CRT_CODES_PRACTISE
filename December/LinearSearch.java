import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int t = sc.nextInt();

        int f = 0;
        int index = -1;   

        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                f = 1;
                index = i;
                break;
            }
        }

        if (f == 1) {
            System.out.println(t + " found at index " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
