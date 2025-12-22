//take two arrays and merge them alternatively 
import java.util.*;

public class AlternateMerge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
        System.out.print("Enter size of first array: ");
        int n1 = in.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter " + n1 + " elements for first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }

      
        System.out.print("Enter size of second array: ");
        int n2 = in.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter " + n2 + " elements for second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = in.nextInt();
        }

        int[] c = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            c[k++] = a[i++];  
            c[k++] = b[j++];  
        }

      
        while (i < n1) {
            c[k++] = a[i++];
        }

      
        while (j < n2) {
            c[k++] = b[j++];
        }

      
        System.out.println("Merged alternate array:");
        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }

        in.close();
    }
}
