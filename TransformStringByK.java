//ASCII GAP FINDER - CALCULTAE THE DIFFERENCE OF ASCII Between TWO CONSECUTIVE numbers 
import java.util.*;
public class Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String string = sc.nextLine();
		
		System.out.println("Enter  the value of k ");
		String result = "";
		
	int k = sc.nextInt();
		
		if (k>0){
		    for(int i =0;i<string.length();i++){
		        int ascii = string.charAt(i);
		        ascii = ascii + k;
		        char newchar = (char)ascii;
		        result = result + newchar;
		        
		    }
		    System.out.println(result);
		}
	
		
	
	}

}
