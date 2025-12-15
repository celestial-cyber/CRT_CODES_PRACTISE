// Finding maximum element in the array

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read size of array
        int s = sc.nextInt();
        int[] a = new int[s];
        
        // Read elements into array
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        
        // Method 1: Using Arrays.sort
        Arrays.sort(a);
        int max1 = a[s - 1];
        System.out.println("Maximum element (via sort): " + max1);
        
        // Method 2: Without sorting (more efficient)
        int max2 = a[0];
        for (int i = 1; i < s; i++) {
            if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println("Maximum element (via loop): " + max2);
        
        sc.close();
    }
}
