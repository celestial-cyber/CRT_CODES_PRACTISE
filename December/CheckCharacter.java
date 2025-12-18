import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int UpperV = 0, UpperC = 0, LowerV = 0, LowerC = 0, Spaces = 0, Digits = 0, Special = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    UpperV++;
                else
                    UpperC++;
            }

            else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    LowerV++;
                else
                    LowerC++;
            }

            else if (ch >= '0' && ch <= '9') {
                Digits++;
            }

            else if (ch == ' ') {
                Spaces++;
            }

            else {
                Special++;
            }
        }

        System.out.println("Uppercase Vowels: " + UpperV);
        System.out.println("Uppercase Consonants: " + UpperC);
        System.out.println("Lowercase Vowels: " + LowerV);
        System.out.println("Lowercase Consonants: " + LowerC);
        System.out.println("Digits: " + Digits);
        System.out.println("Spaces: " + Spaces);
        System.out.println("Special Characters: " + Special);

    }
}
