import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

      
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

     
        System.out.println("Array after squaring elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
