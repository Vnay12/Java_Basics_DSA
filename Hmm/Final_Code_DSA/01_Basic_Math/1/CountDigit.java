/*
 * 1) Math Basic is all about playing with integer
 * 2) Time Complexity will be O(LogN) because we divide every integer by 10
 */

import java.util.Scanner;

public class CountDigit {

    public int count(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            CountDigit ct = new CountDigit();
            System.out.println(ct.count(n));
        } finally {
            sc.close();
        }
    }
}
