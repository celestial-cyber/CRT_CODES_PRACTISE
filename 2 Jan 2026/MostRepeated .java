//7 
//19 9 9 19 19 19 22
//it should show 19 is the most repeated number with count = 2

//test case 2
//4
//19 22 22 19
//19 and 22 are most repeated numebr with count 2 

import java.util.*;

class MostRepeated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int visited[] = new int[n];   // 0 = not processed, 1 = processed
        int freq[] = new int[n];      // store frequency for each unique element (by index)

        int maxFreq = 0;

        // Step 1: find frequency of each element (in insertion order)
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue; // already counted this value
            }

            int count = 1;
            visited[i] = 1;

            for (int j = i + 1; j < n; j++) {
                if (a[j] == a[i]) {
                    count++;
                    visited[j] = 1;
                }
            }

            freq[i] = count;       // frequency of a[i] stored at index i

            if (count > maxFreq) {
                maxFreq = count;   // track highest frequency
            }
        }

        // Step 2: check how many numbers have maxFreq
        int distinctWithMax = 0;
        for (int i = 0; i < n; i++) {
            if (freq[i] == maxFreq) {
                distinctWithMax++;
            }
        }

        // Step 3: print answer according to count of most frequent numbers
        if (distinctWithMax == 1) {
            // only one most repeated number
            for (int i = 0; i < n; i++) {
                if (freq[i] == maxFreq) {
                    System.out.println(a[i] + " is the most repeated number with count = " + maxFreq);
                    break;
                }
            }
        } else {
            // multiple most repeated numbers
            System.out.print("Numbers ");
            for (int i = 0; i < n; i++) {
                if (freq[i] == maxFreq) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println("are most repeated numbers with count = " + maxFreq);
        }
    }
}
