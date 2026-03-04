//Your task is to calculate the sum of all odd elements that lie on the main diagonal of the matrix (where row index = column index)The function calculateMatrixSum(int ** matrix, int m, int n) accepts a two dimensional

//Print a single integer: the sum of all odd diagonal elements.

//Sample Input 0

//3 3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 0

//15
import java.util.*;

public class program2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        // Read matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int sum = 0;

        // Traverse main diagonal
        for (int i = 0; i < m && i < n; i++) {
            if (matrix[i][i] % 2 != 0) {   // ONLY odd elements
                sum += matrix[i][i];
            }
        }

        System.out.println(sum);
    }
}

