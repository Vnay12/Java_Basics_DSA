import java.util.Scanner;

public class Reverse {

    public int checkReverse(int n) {
        int lastdigit = 0;
        int answer = 0;
        boolean negative = false;
        if (n == 0) { // for handling 0
            return 0;
        }
        if (n < 0) {
            negative = true;
            n = Math.abs(n);
        }

        while (n != 0) {
            lastdigit = n % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            answer = (answer * 10) + lastdigit;
            n = n / 10;
        }
        return negative ? -answer : answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse chk = new Reverse();
        try {
            // your code here
            int n = sc.nextInt();
            System.out.println(chk.checkReverse(n));
        } finally {
            // cleanup code here
            sc.close();
        }

    }
}
