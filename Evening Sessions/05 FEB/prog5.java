// Print elements that are multiples of both 2 and 3

import java.util.Scanner;

class prog5 {
    public static void prog5(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] array = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (array[i] % 6 == 0) {   // multiple of both 2 and 3
                System.out.print(array[i] + " ");
                count ++;
            }
        }

        System.out.println(count);

        in.close();
    }
}

/*
Output Example:
Input:
6
2 3 6 12 7 18

Output:
6 12 18
*/
