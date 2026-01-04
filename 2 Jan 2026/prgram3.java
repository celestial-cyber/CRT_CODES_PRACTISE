//n = 5 i pointer for first array 
//20 34 29 60 72
//m=3 j pointer for the second array 
//22 38 42
//int res[] = new int[n+m] k pointer for the third array

//res[0] = a[0],b[0] = 20,22=20
//res[1] = a[1],b[0]= 34,22=22
//res[2] = a[1],b[1]= 29, 38 = 29
//res[3]= a[2], b[1]= 29 , 38= 29

import java.util.*;

class Program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        int res[] = new int[n + m];

        int i = 0, j = 0, k = 0;

        // merge while both arrays have elements
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        // copy remaining elements of a[]
        while (i < n) {
            res[k++] = a[i++];
        }

        // copy remaining elements of b[]
        while (j < m) {
            res[k++] = b[j++];
        }

        // print result (optional)
        for (int x = 0; x < n + m; x++) {
            System.out.print(res[x] + " ");
        }
    }
}
