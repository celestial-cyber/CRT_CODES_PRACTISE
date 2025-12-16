import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to check frequency: ");
        int t = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(t + " appears " + count + " time(s)");
        } else {
            System.out.println(t + " not found in the array");
        }

        sc.close();
    }
}
