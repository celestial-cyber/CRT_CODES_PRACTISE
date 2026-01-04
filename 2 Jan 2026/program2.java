//6
//19 9 9 19 19 22
//19 3 9 2 22 1
//print frewuency of thr number it should the insertion order

//visiting array - marking or  indication -

//19 9 9 19 19 22
//0  1 2  3  4  5
//0  0 0  0  0  0
//3  2  1  1  1  1
//int c = 1
//int visited[] = new int[6]
import java.util.*;


class program2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int c[] = new int[n]; // stores digit count for each number

        int max = 0;

        // First pass: read numbers and count digits
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            int temp = a[i];
            while (temp != 0) {
                c[i]++;
                temp = temp / 10;
            }
            if (c[i] > max) {
                max = c[i];
            }
        }

        // res array should be sized by max digit length
        int res[] = new int[max + 1];

        // Count how many numbers have each digit length
        for (int i = 0; i < n; i++) {
            res[c[i]]++;
        }

        // Print results
        for (int i = 1; i <= max; i++) {
            System.out.println("Digit length " + i + ": " + res[i]);
        }
    }
}

