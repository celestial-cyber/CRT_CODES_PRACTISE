//product of odd diagonal elements 

// returns the sum of odd elements whose ith and jth index are same.
import java.util.*;

class program4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int product = 1;
        boolean foundOdd = false;

        for (int i = 0; i < m && i < n; i++) {
            if (array[i][i] % 2 != 0) {
                product *= array[i][i];
                foundOdd = true;
            }
        }

        System.out.println(foundOdd ? product : 0);
    }
}