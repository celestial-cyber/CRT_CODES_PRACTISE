//block level reverse of array

//10 
//2 4 6 5 3 2 4 4 5 9 
//block size = 2
//output = 4 2 5 6 3 2 4 4 9 5 
import java.util.*;

class program4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt(); // block size

        // reverse in blocks of size k
        for (int start = 0; start < size; start += k) {
            int left = start;
            int right = Math.min(start + k - 1, size - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i != size - 1) System.out.print(" ");
        }

        in.close();
    }
}
