import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];
       

        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
         int element = in.nextInt();

        int sum = 0;
        for(int i = 0; i < size; i++) {
            if(i % 2 == 0) { // even index check
                if(array[i] > 2 * element) { // greater than twice K
                    sum = sum + array[i]; // accumulate
                }
            }
        }

        System.out.println(sum);
    }
}
