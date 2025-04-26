/*
1) Time complexity of this code is O(LogN)
2) Math Basics
*/

import java.util.Scanner;

public class Palindrome {
    public boolean isPalidrome(int n) {
        int og = n;
        int lastdigit = 0;
        int answer = 0;
        if (n < 0) { // Negative number are not palindrome
            return false;
        }
        while (n != 0) {
            lastdigit = n % 10;
            answer = (answer * 10) + lastdigit;
            n = n / 10;
        }
        if (answer == og)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            Palindrome ct = new Palindrome();
            System.out.println(ct.isPalidrome(n));
        } finally {
            sc.close();
        }
    }
}