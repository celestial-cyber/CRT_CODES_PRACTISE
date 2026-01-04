//test case ->1
//7
//19 7 1 2 12 21 12 
//number having 1 and 2 digits are repeated 3 and 4 times
//print digits with max itrations 

//test case 2 -> 2
//3
//19 1 22
//2 digit number are repeated twice 

import java.util.*;

class DigitGroupFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];
        int c[] = new int[n];   // digit count for each number
        int maxDigits = 0;

        // read numbers
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // count digits for each number
        for (int i = 0; i < n; i++) {
            int temp = a[i];

            if (temp == 0) {
                c[i] = 1;  // 0 is 1-digit
            } else {
                while (temp != 0) {
                    c[i]++;
                    temp = temp / 10;
                }
            }

            if (c[i] > maxDigits) {
                maxDigits = c[i];
            }
        }

        // res[d] = how many numbers have d digits
        int res[] = new int[maxDigits + 1];

        for (int i = 0; i < n; i++) {
            res[c[i]]++;
        }

        // find maximum frequency among digit groups
        int maxFreq = 0;
        for (int d = 1; d <= maxDigits; d++) {
            if (res[d] > maxFreq) {
                maxFreq = res[d];
            }
        }

        // print digit groups that have this max frequency
        System.out.print("Digit lengths with max frequency (" + maxFreq + "): ");
        for (int d = 1; d <= maxDigits; d++) {
            if (res[d] == maxFreq) {
                System.out.print(d + " ");
            }
        }
        System.out.println();
    }
}
