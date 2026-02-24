//if all elementts are odd - print only odd elements else even elements - if both are present then print odd then even alternatively 
//printing array odd and even numbers altenatively 
// inp1=6
//in2 :100 101 110 , 96, 103 , 105 
//output = 1010 , 100 , 103 , 110 , 105 , 96 

//input 1 = 4
// inp2 = 107 103 107 99
//output only odd numbers 
import java.util.*;
class program1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];
        int ev = 0, od=0; //to take the count of even and odd numbers 
        int e =0 , o=0; // e= index of even array na do is hte index of odd array//
         int even[]=new int[ev];//to ceate the size of even array as no of even elements
        int odd[] = new int[od];

        for(int i =0;i<size;i++){
            array[i] = in.nextInt();
            if(array[i]%2==0){
                even[e] = array[i];
                ev++;
                e++;
                
            }
            else{
                odd[o]=array[i];
                od++;
                o++;
            }
        }
        int result[]=new int[e+o];
        if(ev==0){
            System.out.println("Only odd numbers");
        }
        if(od==0){
            System.out.println("Only even numbers");
        }
        if(ev!=0 && od!=0){
            //odd[3 7 9] even[4 6 8]
            //    0 1 2       0 1 2 
            //result[o e o e o e]
            //i======0 1 2 3 4 5 all odd elements on even index and vice versa 

         for(int i =0, j=0;i<e+o && j<o; j++,i+=2){//i=i+2 because w ewant i to take even index also 
            result[i]=odd[j];
         }
         for(int i=1,k=0;i<e+0 && k<e ; k++, i+=1){
            result[i]=even[k];
         }
        for(int i :result){
            System.out.print(i+" "):
        }

        }

        
       


    }
}