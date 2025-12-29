import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = in.nextInt();


        int squared = num * num;

     
        int count_num = (int) Math.log10(num) + 1;

       
        int last = squared % (int) Math.pow(10, count_num);

       
        if (last == num) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is Not an Automorphic Number");
        }

        in.close();
    }
}
