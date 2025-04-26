import java.util.Scanner;

public class GCD {
    public int GCDNumber(int n1, int n2) {

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
