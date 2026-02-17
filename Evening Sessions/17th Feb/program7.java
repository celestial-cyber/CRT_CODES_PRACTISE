//find the largest number at the even index 
// Online Java Compiler
/// Find the largest number at the even index
import java.util.*;

class program7{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int largest =0;

        for (int j = 0; j < size; j++) {
            if (j % 2 == 0) {   // even index
                if (array[j] > largest) {
                    largest = array[j];
                }
            }
        }

        System.out.println("Largest number at even index = " + largest);
    }
}
