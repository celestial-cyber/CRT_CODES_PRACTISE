import java.util.*;

class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // If array size is less than 2, second largest cannot exist
        if (n < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } 
            else if (a[i] < max && a[i] > secondMax) {
                secondMax = a[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element: " + secondMax);
        }

        sc.close();
    }
}
