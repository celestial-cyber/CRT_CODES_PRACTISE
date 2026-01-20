import java.util.*;

public class  program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int i, temp, original = size;
        int array[] = new int[size];

        for(i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        // Reverse the array
        for(i = 0; i < original/2; i++){
            temp = array[size-1];
            array[size-1] = array[i];
            array[i] = temp;
            size -= 1;
        }

       
        for(i = 0; i < original; i++){
            System.out.print(array[i] + " ");
        }
    }
}
