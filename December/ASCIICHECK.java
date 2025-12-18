// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
       int ascii = ch;
       
       if (ascii>= 65 && ascii<=90){
           System.out.println("Uppercase charcter");
       }
       else if (ascii >= 97 && ascii<=127){
           System.out.println("Lowercase");
       }
       else if (ascii >= 48 && ascii <=57){
           System.out.println("Digits");
       }
       else{
           System.out.println("Special characters");
       }

    }
}