import java.util.Scanner;

class program1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        int last = array[size - 1];
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] < last) {
                count++;
            }
        }

        System.out.println(count);
    }
}

//for statit array = use int last = a[a.length-1]
//for each loop -> for(int i:array) if(i<last) count ++;