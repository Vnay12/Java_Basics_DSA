package Revision;

import java.util.Scanner;

public class ReverseNumber {
    public int numberReverse(int x) {
        int lastdigit = 0;
        int revnumber = 0;
        boolean negnumber = x < 0; // for negative case
        if (x == 0) // for zero case
            return 0;
        x = (int) Math.abs(x);
        while (x > 0) {
            lastdigit = x % 10;
            revnumber = (revnumber * 10) + lastdigit;
            x = x / 10;
        }
        if (revnumber < Math.pow(-2, 32) || (revnumber > Math.pow(2, 32) - 1)) {
            return 0;
        }
        return negnumber ? -revnumber : revnumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseNumber rev = new ReverseNumber();
        try {
            int m = sc.nextInt();
            int answer = rev.numberReverse(m);
            System.out.println(answer);
        } finally {
            sc.close();
        }
    }
}
