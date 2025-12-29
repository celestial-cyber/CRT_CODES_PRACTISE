//to fidn the count of digits using logarithmic 
import java.util.*;
import java.lang.Math;
class Egdigits{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        int c =0;
        if (n==0){
            c=1;
        }
        else{
            c= (int)Math.log10(n)+1;
            System.out.println(c);
        }

    }
}

