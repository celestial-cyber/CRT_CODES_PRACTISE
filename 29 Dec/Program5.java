//challenege ques input =5 -> 5*5 = 25  such nuber is called automorphic number  like 6 -> 36 - the ending is same 
//is same  -- sma efor 76 = 5776 -> 76 = last num of (5776)= 76 =m76 
import java.util.*;
import java.lang.Math;
class Program5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.newInt(); //12
        int squared = num*num;//144

        int count = Math.log10(squared); //count = 2
        int count_num = Math.log10(num);

        int last = squared % (Math.pow(10,count)); //last = 144 % 100= 4 

        int last_num = num % (Math.pow(10,count_num));// last num = 12 % 10= 2 

        if (last == last_num){
            System.out.println("Automorpic Number");
        }
        else{
            System.out.println("Not Automorphic number");
        }



        

    }}


