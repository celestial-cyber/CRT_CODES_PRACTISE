// Replace all even numbers with 1 and print the resultant array

import java.util.Scanner;

class Prog4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 1;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        in.close();
    }
}

/*
Output Example:
Input:
5
2 3 4 5 6

Output:
1 3 1 5 1
*/
