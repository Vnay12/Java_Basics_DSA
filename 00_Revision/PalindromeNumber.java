
// import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeNumber {

    // O(LogN) and will take extra run time space as we are creating reverse and
    // then comparing
    public boolean check_Palindrome(int n) {
        int reverse = 0;
        int og = n;
        while (n != 0) {
            int lastdigit = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + lastdigit;
        }
        if (reverse == og)
            return true;
        else
            return false;
    }

    //
    public int OptimisedCheckPalindrome(int n) {
        // logic here

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeNumber chk = new PalindromeNumber();
        // ArrayList<Integer> arr = new ArrayList<>();
        try {
            int n = sc.nextInt();
            boolean answer = chk.check_Palindrome(n);
            System.out.println(answer);
        } finally {
            sc.close();
        }
    }
}
