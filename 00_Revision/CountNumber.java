package Revision;

import java.util.Scanner;

public class CountNumber {

    // Time complexity of the code is (nlogn)
    public int numberCount(int n) {
        // logic here
        int count = 0;
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // Optimised Solution in static time: O(1)
    public int optimisedSolution(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        n = (int) Math.log10(n) + 1;
        System.out.println(n);

        // logic here
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            CountNumber ct = new CountNumber();
            int answwer = ct.numberCount(n);
            ct.optimisedSolution(n);
            System.out.println(answwer);
        } finally {
            sc.close();
        }

    }
}
