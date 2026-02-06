// Problem Statement:
// Given a number N, generate the first N Fibonacci numbers.
// If the position of a Fibonacci number (1-based index) is prime, multiply that Fibonacci number by 2.
// If the position is not prime, print the Fibonacci number as it is.
// Print the transformed Fibonacci sequence as space-separated values.

import java.util.*;

class Main {
    // Helper function to check if a given position is prime
    private static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }
        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {  // simple prime check is enough for n ≤ 20 [web:85][web:88]
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();  // Read N (1 ≤ N ≤ 20)

        // Initial Fibonacci numbers: F1 = 0, F2 = 1 [web:86]
        int a = 0;  // F1
        int b = 1;  // F2

        for (int pos = 1; pos <= N; pos++) {
            int fib = a;  // current Fibonacci number at position 'pos'

            // If position is prime, multiply the Fibonacci number by 2
            if (isPrime(pos)) {
                System.out.print(fib * 2);
            } else {
                // If position is not prime, print Fibonacci number as it is
                System.out.print(fib);
            }

            if (pos != N) {
                System.out.print(" ");  // space between numbers
            }

            // Generate next Fibonacci number
            int c = a + b;
            a = b;
            b = c;
        }

        in.close();
    }
}
