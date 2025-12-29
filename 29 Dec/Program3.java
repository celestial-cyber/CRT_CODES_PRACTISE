//12345 -> swap first and last number so that it becomes 52341
//find the last digit , count of digit , first digit , middle of ligit 
//last diigit = n= n%10 -> n = 5 
//to find the first number - number / 10 raised to count of digits n that number like 123 / 100 , 1234/1000
//count of digits = (int)Math.log10(n);
//it first = n/(int)Math.pow(10,count)
//to find the middle element - > (n%(int)Math.pow(10,count))/10;
//(12345%1000)= 2345/10 = 234.5 (int)= 234


//t0 get the final digits= last digit * Math.pow(10, 4) +(Middle*10)+first;
//50000 +2340 = 52340 + 1 = 53340


import java.util.Scanner;
import java.lang.Math;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Step 1: Find last digit
        int last = n % 10;

        // Step 2: Count digits (index of highest power of 10)
        int count = (int) Math.log10(n);

        // Step 3: Find first digit
        int first = n / (int) Math.pow(10, count);

        // Step 4: Find middle part (remove first and last digit)
        int middle = (n % (int) Math.pow(10, count)) / 10;

        // Step 5: Construct new number
        int result = last * (int) Math.pow(10, count) + middle * 10 + first;

        System.out.println("Original: " + n);
        System.out.println("Swapped : " + result);

        sc.close();
    }
}
