
import java.util.ArrayList;
import java.util.Scanner;

public class CommonDivisor {
    public int GCD(int n, int i) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int j = 1; j <= (int) Math.sqrt(n); j++) {
            if (n % j == 0) {
                arr.add(j);
            }
        }
        for (int j = 1; j <= (int) Math.sqrt(i); j++) {
            if (i % j == 0) {
                arr2.add(j);
            }
        }
        System.out.println(arr);
        System.out.println(arr2);

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int i = sc.nextInt();
            CommonDivisor chk = new CommonDivisor();
            chk.GCD(n, i);

        } finally {
            sc.close();
        }

    }
}
