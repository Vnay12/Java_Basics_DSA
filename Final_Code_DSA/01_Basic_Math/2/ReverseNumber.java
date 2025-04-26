/*
1) Time complexity is O(LogN)
2) Math Baics 
3) Leetcode #7
4) So this answer is incomplete as in LC question, there is a overfall check we have to do 
5) full answer is submitted in LC ( Overflow i have to study again )
*/

import java.util.Scanner;

public class ReverseNumber {
    public int reverse(int n) {
        int answer = 0;
        int lastdigit = 0;
        if (n == 0) { // handling 0
            return 0;
        }
        while (n != 0) {
            lastdigit = n % 10;
            answer = (answer * 10) + lastdigit;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            ReverseNumber ct = new ReverseNumber();
            System.out.println(ct.reverse(n));
        } finally {
            sc.close();
        }
    }
}
