// ASCII GAP FINDER - CALCULATE THE DIFFERENCE OF ASCII BETWEEN TWO CONSECUTIVE CHARACTERS
import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        
        String test = sc.nextLine();
        
        if (test.length() < 2) {       // needs at least 2 chars for a gap
            System.out.println("No Gaps");
            return;
        }
        
        System.out.println("ASCII Differences:");
        
        for (int i = 0; i < test.length() - 1; i++) {
            char ch1 = test.charAt(i);
            char ch2 = test.charAt(i + 1);
            
            int diff = Math.abs(ch2 - ch1);     // ASCII difference
            
            System.out.println(ch1 + " -> " + ch2 + " = " + diff);
        }
    }
}
