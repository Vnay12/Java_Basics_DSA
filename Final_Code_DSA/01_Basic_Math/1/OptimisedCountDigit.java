/*
 * 1) Math Basic is all about playing with integer
 * 2) Time Complexity will be O(1) as we use Math Function 
 */

import java.util.Scanner;

public class OptimisedCountDigit {
    public int optimisedCountDigit(int n) {
        n = (int) Math.log10(n) + 1;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            OptimisedCountDigit ct = new OptimisedCountDigit();
            System.out.println(ct.optimisedCountDigit(n));
        } finally {
            sc.close();
        }
    }
}
