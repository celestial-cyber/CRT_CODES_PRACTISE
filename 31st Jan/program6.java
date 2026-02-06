//find the rank of an array 
//85 - 100 =1
//70-84 =2
//60 69-3
//36-59=4
//<=35
//np need to giv negative numbers - and more than 100 
//n=5 , 101 ,29 90 45 84
//5 1 4 2 
import java.util.*;

class Solution1 {

    // function to return rank for a single marks value
    static int rank(int marks) {
        if (marks >= 85 && marks <= 100) {
            return 1;
        } else if (marks >= 70 && marks <= 84) {
            return 2;
        } else if (marks >= 60 && marks <= 69) {
            return 3;
        } else if (marks >= 36 && marks <= 59) {
            return 4;
        } else if (marks >= 0 && marks <= 35) {
            return 5;
        } else {
            // invalid marks (<0 or >100), you said "no need to give"
            // you can choose to ignore or give 0; here we ignore by returning 0
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];
        int rankArr[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
            rankArr[i] = rank(array[i]);   // function call for each element
        }

        for (int i = 0; i < size; i++) {
            if (rankArr[i] != 0) {        // skip invalid marks if any
                System.out.print(rankArr[i] + " ");
            }
        }

        in.close();
    }
}
