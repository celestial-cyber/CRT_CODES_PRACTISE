import java.util.*;

class Program2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] a = new int[size];

   
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }

     
        int mid = size / 2;
        for (int i = 0; i < mid / 2; i++) {
            int temp = a[i];
            a[i] = a[mid - 1 - i];
            a[mid - 1 - i] = temp;
        }

       
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
