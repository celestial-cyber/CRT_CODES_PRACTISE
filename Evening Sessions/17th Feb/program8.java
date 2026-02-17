//print first three and last three element 

// Print first three and last three elements
import java.util.*;

class program8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        if (size < 3) {
            System.out.println("Array size should be at least 3");
            return;
        }

        // First three
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }

        // Last three
        for (int i = size - 3; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
