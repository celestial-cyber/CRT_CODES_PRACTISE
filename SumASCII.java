import java.util.*;

public class SumASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a string: ");  // 👈 added print statement

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum += (int) ch;
        }

        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
