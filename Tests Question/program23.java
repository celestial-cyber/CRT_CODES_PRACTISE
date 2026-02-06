//"""You are given a number N. Generate the first N Fibonacci numbers.
//If a Fibonacci number is even, add it to the sum.
//If a Fibonacci number is odd, subtract it from the sum.
//Print the final calculated sum.
import java.util.*;

class program23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();   // number of Fibonacci terms
        long sum = 0;

        int a = 0;  // F0
        int b = 1;  // F1

        for (int i = 1; i <= N; i++) {
            int fib = a;       // current Fibonacci number

            if (fib % 2 == 0) {
                sum += fib;    // even: add
            } else {
                sum -= fib;    // odd: subtract
            }

            int c = a + b;     // next Fibonacci
            a = b;
            b = c;
        }

        System.out.println(sum);
        in.close();
    }
}
