package TUF;

public class Palindrome {

    public int CheckPalindrome(int n) {
        // Reverse the number
        int answer = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            answer = (answer * 10) + lastDigit;
            n = n / 10;

        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 4554;
        int check = n;
        Palindrome chk = new Palindrome();
        int finalanswer = chk.CheckPalindrome(n);
        System.out.println(finalanswer);
        if (finalanswer == check) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
