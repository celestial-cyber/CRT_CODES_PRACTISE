import java.util.*;
class Currency{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();  // Read the total amount from user input

        // Variables to store count of each denomination
        int r2000=0, r500=0, r200=0, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0, r1=0;
        
        // GREEDY ALGORITHM: Always use largest denomination first for minimum notes
        
        // Step 1: Handle ₹2000 notes
        if(amount/2000 > 0){  // Check if amount >= 2000 (division > 0 means at least 1 note fits)
            r2000 = amount/2000;  // Integer division gives number of full ₹2000 notes
            amount = amount%2000; // Modulo gives remaining amount after using those notes
        }
        
        // Step 2: Handle ₹500 notes (repeat same logic with updated remainder)
        if(amount/500 > 0){
            r500 = amount/500;
            amount = amount%500;
        }
        
        // Step 3: Handle ₹200 notes
        if(amount/200 > 0){
            r200 = amount/200;
            amount = amount%200;
        }
        
        // Step 4: Handle ₹100 notes
        if(amount/100 > 0){
            r100 = amount/100;
            amount = amount%100;
        }
        
        // Step 5: Handle ₹50 notes
        if(amount/50 > 0){
            r50 = amount/50;
            amount = amount%50;
        }
        
        // Step 6: Handle ₹20 notes
        if(amount/20 > 0){
            r20 = amount/20;
            amount = amount%20;
        }
        
        // Step 7: Handle ₹10 notes
        if(amount/10 > 0){
            r10 = amount/10;
            amount = amount%10;
        }
        
        // Step 8: Handle ₹5 notes
        if(amount/5 > 0){
            r5 = amount/5;
            amount = amount%5;
        }
        
        // Step 9: Handle ₹2 notes
        if(amount/2 > 0){
            r2 = amount/2;
            amount = amount%2;
        }
        
        // Step 10: Handle ₹1 notes (final remainder)
        if(amount/1 > 0){
            r1 = amount/1;  // amount/1 = amount itself
            amount = amount%1;  // %1 always = 0
        }
        
        // Output results - display count of each denomination used
        System.out.println("Rs 2000: " + r2000);
        System.out.println("Rs 500: " + r500);
        System.out.println("Rs 200: " + r200);
        System.out.println("Rs 100: " + r100);
        System.out.println("Rs 50: " + r50);
        System.out.println("Rs 20: " + r20);
        System.out.println("Rs 10: " + r10);
        System.out.println("Rs 5: " + r5);
        System.out.println("Rs 2: " + r2);
        System.out.println("Rs 1: " + r1);
    }
}
