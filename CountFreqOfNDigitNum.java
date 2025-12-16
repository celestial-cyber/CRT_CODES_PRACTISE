import java.util.*;

public class CountFreqOfNDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int oneDigit = 0, twoDigit = 0, threeDigit = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            num = Math.abs(num);   // handles negative numbers

            if (num >= 0 && num <= 9) {
                oneDigit++;
            } else if (num >= 10 && num <= 99) {
                twoDigit++;
            } else if (num >= 100 && num <= 999) {
                threeDigit++;
            }
        }

        System.out.println("1-digit numbers: " + oneDigit);
        System.out.println("2-digit numbers: " + twoDigit);
        System.out.println("3-digit numbers: " + threeDigit);

        sc.close();
    }
}
