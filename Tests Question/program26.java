import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextLong();
        }

        for(int i = 0; i < n - 1; i++){
            if(a[i] > a[i+1]){
                long diff = a[i] - a[i+1];
                a[i] -= diff;
                a[i+1] += diff;
            }
        }

        boolean ok = true;
        for(int i = 0; i < n - 1; i++){
            if(a[i] > a[i+1]){
                ok = false;
                break;
            }
        }

        if(ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
