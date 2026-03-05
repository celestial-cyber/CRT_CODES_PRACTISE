//Grocery Store billing System
//task is to calculate the total bill amount and apply the discount based on the final bill value 
// discount rules 
// total bills>5000 - 20%discount 
//else if total bills >2000 apply 10% discount 
//othersie no disount 
//finally print he final amount to be paid after applying the discount 

//input format 
//N - number of items purchased
//next N lines each conatin two integers : price of item , quantiy of each item

//output format 
// print the final bill amount after applying the discount 

//constraints -> 1<= N <= 50
//3
// 100 5 
// 200 3 
//50  10
//total bill = 1600

import java.util.*;
class Solutions{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
        int N = in.nextInt();
        int price , quantity;
        int[] total_bill = new int[N];
        int result = 0;
        int to_pay;
        int amount;
        
        for(int i = 0;i<N;i++){
            price = in.nextInt();
            quantity = in.nextInt();
            total_bill[i] = price*quantity;
        }
        
        for(int i = 0;i<N;i++){
            result = result + total_bill[i];
        }
        System.out.println(result);
        
        if(result>5000){
            amount =(int) 0.20 * result;
            to_pay =  result - amount;
            
        }
        else if (result>2000 && result < 5000){
            amount = (int)0.10 * result;
            to_pay = result - amount;
        }
        else {
            to_pay = result;
        }
        System.out.println(to_pay);
        
        
    }
    
}