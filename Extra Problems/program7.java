import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            int num = Math.abs(sc.nextInt());

            int[] freq = new int[10];

            if(num == 0){
                freq[0]++;
            }

            while(num > 0){
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }

            int maxFreq = -1;
            int answer = 0;

            for(int d = 9; d >= 0; d--){
                if(freq[d] > maxFreq){
                    maxFreq = freq[d];
                    answer = d;
                }
            }

            if(i > 0) System.out.print(" ");
            System.out.print(answer);
        }
    }
}