//
//Problem no. 2 -> int n = 245678;
//If the combined sum of the first and last digit is even 
//The only extract the middle part and find the sum of the middle part – till reaches to single digit is even or odd 
import java.util.*;
import java.lang.Math;

class Program7{
public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            int n = sc. nextInt();

            int last = n % 10;
            int count = (int) Math.log10(n); // index of first digit
            int first = n / (int) Math.pow(10, count);

             int sumFL = first + last;
             if (sumFl%2==0){
                 int middle = (n % (int) Math.pow(10, count)) / 10;

             }
             }
}
        

        // Step 2: Sum of first and last digi

        if (sumFL % 2 == 0) {
            // Step 3: Extract middle part
           

            // Step 4: Reduce middle sum to single digit
            int singleDigit = digitSumToSingle(middle);

            // Step 5: Check even/odd
            if (singleDigit % 2 == 0) {
                System.out.println("Single digit " + singleDigit + " is EVEN");
            } else {
                System.out.println("Single digit " + singleDigit + " is ODD");
            }
        } else {
            System.out.println("Sum of first and last digit is ODD, so no further check.");
        }

        sc.close();
    }

    // Helper method: keep summing digits until single digit
    public static int digitSumToSingle(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Step 1: Find first and last digit
        int last = n % 10;
        int count = (int) Math.log10(n); // index of first digit
        int first = n / (int) Math.pow(10, count);

        // Step 2: Sum of first and last digit
        int sumFL = first + last;

        if (sumFL % 2 == 0) {
            // Step 3: Extract middle part
            int middle = (n % (int) Math.pow(10, count)) / 10;

            // Step 4: Reduce middle sum to single digit
            int singleDigit = digitSumToSingle(middle);

            // Step 5: Check even/odd
            if (singleDigit % 2 == 0) {
                System.out.println("Single digit " + singleDigit + " is EVEN");
            } else {
                System.out.println("Single digit " + singleDigit + " is ODD");
            }
        } else {
            System.out.println("Sum of first and last digit is ODD, so no further check.");
        }

        sc.close();
    }

    // Helper method: keep summing digits until single digit
    public static int digitSumToSingle(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
