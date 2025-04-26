
import java.util.Scanner;

public class temp {
    public boolean isisPalidrome(int n) {
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
            temp ct = new temp();
            System.out.println(ct.isisPalidrome(n));
        } finally {
            sc.close();
        }
    }
}
