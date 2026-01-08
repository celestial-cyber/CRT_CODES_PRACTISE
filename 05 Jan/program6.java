//dont use break but use return to stop the exectution and go back to main method  as break will only end
//come out of one loop - again the lop will start - whic we dont want - for reference run this code with break 

import java.util.*;
class program6{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int();

        for(int i=0;i<n;i++){
            a[i]= sc.nextint();
        }



        int f=-1;
        for(int i =0;i<n;i++){
            for(int j = 1; j < n;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                    f++;
                    return;
                }

            }
        }
        if(f==-1){
            System.out.print(f);
        }
    }
}