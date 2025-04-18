
import java.util.Scanner;

public class CheckPalindome {

    // Time complexity is O(Log n)
    public boolean numberPalindrome(int n) {
        int temp = n;
        int lastdigit = 0;
        int reversenumber = 0;
        if (n < 0)
            return false;
        while (n > 0) {
            lastdigit = n % 10;
            n = n / 10;
            reversenumber = (reversenumber * 10) + lastdigit;
        }
        if (reversenumber == temp) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPalindome chk = new CheckPalindome();
        try {
            int n = sc.nextInt();
            boolean answer = chk.numberPalindrome(n);
            System.out.println(answer);
        } finally {
            sc.close();
        }

    }
}
