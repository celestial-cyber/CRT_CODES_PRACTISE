import java.util.*;

public class BiggestOfAll {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Temporary array to store leaders
        int[] temp = new int[n];
        int count = 0;

        // Last element is always a leader
        int max = a[n - 1];
        temp[count++] = max;

        // Find elements bigger than all elements to their right
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                temp[count++] = a[i];
            }
        }

        // Sort the leaders
        Arrays.sort(temp, 0, count);

        // Print output (skip the smallest leader)
        for (int i = 1; i < count; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
// or int small = a[n-1];

//for(int i = n-2 ; i >=0 ; i--){
//if (a[i] > small)}//'' SOP(a[i]+"")
    //small = a[i];
//}
