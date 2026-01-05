//find the first triplet of elemenst whose sum is equal to the target element
//we can take three pointers 
import java.util.*;
class program2{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for(int i =0 ; i< n ;i++){
            a[i]= sc.nextInt();
        }

        int t = sc.nextInt();
        int f=0;

        for(int i = 0 ; i< n-2 ; i++){
            for(int j = i+1; j<n-1;j++ ){
                for(int k = j+1; k<n;k++){
                    if(a[i]+a[j]+a[j]==t){
                        System.out.print(a[i] + "+"+ a[j] + "+" + a[j]+ "="+ t);
                        f=1;
                    }
                }
            }
            if (f==0){
                System.out.println("No triplets found");
            }
        }
    }
}