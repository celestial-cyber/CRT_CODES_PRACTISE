//ASCII GAP FINDER - CALCULTAE THE DIFFERENCE OF ASCII Between TWO CONSECUTIVE numbers 
import java.util.*;
public class Array{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] arr = new int[s];
		
		for(int i=0; i < s ; i++) {
			System.out.println("Enter" + arr[i]);
			arr[i] = sc.nextInt();
			
		}
		for(int i=0; i < s ; i++) {
			
			System.out.println(arr[0]);
		}
		sc.close();
		
		
	
	}

}

