import java.util.ArrayList;
import java.util.Scanner;

public class GCD {
    public int GCDNumber(int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }

        for (int j = 0; j < m; j++) {
            if (m % j == 0) {
                arr2.add(j);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int n2 = sc.nextInt();
            GCD ct = new GCD();
            System.out.println(ct.GCDNumber(n, n2));
        } finally {
            sc.close();
        }
    }
}
