// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String str = sc.nextLine();
        
        for(int i = 0 ; i < str.length() ; i++){   // FIXED: < instead of <=
            char ch = str.charAt(i);
            int ascii = ch;
            sum += ascii;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
