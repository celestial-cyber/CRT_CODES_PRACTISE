import java.util.*;

class Solution {
    public static void main(String args[]) {
       
        int count = 0;
        int sum = 0;

        int array[] = {2, 3, 1, 4, 5};

        // Enhanced for loop
        for (int x : array) {
            count++;      // count elements
            sum += x;     // sum elements
        }

        System.out.println("Number of elements: " + count);
        System.out.println("Sum of elements: " + sum);
    }
}
