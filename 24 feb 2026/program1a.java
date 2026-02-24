import java.util.*;
class program1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];
        int ev = 0, od = 0; //to take the count of even and odd numbers 

        // First pass: count evens and odds
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
            if (array[i] % 2 == 0) {
                ev++;
            } else {
                od++;
            }
        }

        int even[] = new int[ev]; //to create the size of even array as no of even elements
        int odd[] = new int[od];
        int e = 0, o = 0; // e= index of even array and o is the index of odd array//

        // Second pass: fill even and odd arrays
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                even[e++] = array[i];
            } else {
                odd[o++] = array[i];
            }
        }

        int result[] = new int[e + o];

        if (ev == 0) {
            //if all elementts are odd - print only odd elements
            
                System.out.print("only odd numbers");
            
        } else if (od == 0) {
            //if all elementts are even - print only even elements
            
                System.out.print("only even numbers");
            
        } else {
            //if both are present then print odd then even alternatively 
            //odd[3 7 9] even[4 6 8]
            //    0 1 2       0 1 2 
            //result[o e o e o e]
            //i======0 1 2 3 4 5 all odd elements on even index and vice versa 

            int i = 0, j = 0, k = 0;
            while (j < o && k < e) {
                result[i++] = odd[j++];
                result[i++] = even[k++];
            }
            // If any odds left
            while (j < o) {
                result[i++] = odd[j++];
            }
            // If any evens left
            while (k < e) {
                result[i++] = even[k++];
            }

            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
