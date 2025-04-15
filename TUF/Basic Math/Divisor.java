
import java.util.ArrayList;

public class Divisor {

    // Time complexitiy: O(N)
    public int checkDivisor(int n) {
        if (n == 0)
            return 0;
        n = Math.abs(n);
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i);
            }
            i++;
        }

        return 0;
    }

    public int optimalDivisor(int n) {

        ArrayList<Integer> arr = new ArrayList<>();
        int square = (int) Math.sqrt(n);
        for (int i = 1; i <= square; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        System.out.println(arr);

        return 0;
    }

    public static void main(String[] args) {
        int n = 36;
        Divisor chk = new Divisor();
        // chk.checkDivisor(n);
        chk.optimalDivisor(n);
    }
}
