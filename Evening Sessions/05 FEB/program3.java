//count elements with exactly 2 digits 
// [10 2 34 5 6]
// for(i=0;i<size;i++){
//num = array[i];

//while(num!=0)
//num = num/10;
//count++;
//num=num%10;
//}

//if (count == 2){
//count2Digits++;
//}


import java.util.Scanner;

class program2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int count2Digits = 0;

        for (int i = 0; i < size; i++) {
            int num = array[i];
            int count = 0;
            while (num != 0) {
                num = num / 10;
                count++;
            }
            if (count == 2) {
                count2Digits++;
            }
        }

        System.out.println(count2Digits);
    }
}
