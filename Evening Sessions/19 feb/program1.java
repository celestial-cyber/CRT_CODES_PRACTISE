//mobile data tacker - 1 use data , check data balalnce , datat alerts , exit 
// use data - ener data to use :
// 2-> used data , and remaining data 
//3. warning low data balance 
//take varaibles like available data = 2048(2G)

import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int choice;
        int totalData = 2048;
        int used =0 ;
        int available = 0;

        while(true){
            System.out.println("==========Mobile data Tracker==============");
            System.out.println("1.Use Data");
            System.out.println("2.Check Data Balance");
            System.out.println("3.Data alerts");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = in.nextInt();

            switch(choice){
                case 1: System.out.println("Enter Data to use");
                        used = in.nextInt();
                        if(used>totalData){
                            System.out.println("Not Enough data available");
                        }
                        else{
                        
                        available = totalData-used;
                        System.out.println("Data Used Successfullly");
                        }
                        break;

                case 2: System.out.println("Used Data is " + used);
                        System.out.println("Available data is"+ (totalData-used));
                        break;

                case 3: if (available<500){
                                    System.out.println("Data Warning:You have only 500 MB left");
                                        }
                        else{
                            System.out.println("You have enough data to use");
                        }
                    break;

                case 4: System.out.println("Existing Mobile data tracker");
                        return;

                default: System.out.println("Invalid choice");

                }

                
            }


        }
    }
