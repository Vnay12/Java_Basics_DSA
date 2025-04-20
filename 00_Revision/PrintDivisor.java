import java.util.ArrayList;
import java.util.Scanner;

public class PrintDivisor {

    // O(N)
    public ArrayList<Integer> PrintDivisorNumber(int n) {
        // logic here
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);

            }
        }
        return arr;
    }

    public ArrayList<Integer> OPtimalPrintDivisorNumber(int n) {
        // logic here
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                arr.add(i);
                if (i != n / i) {
                    arr.add(n / i);
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintDivisor chk = new PrintDivisor();
        try {
            int n = sc.nextInt();
            System.out.println(chk.PrintDivisorNumber(n));
            System.out.println(chk.OPtimalPrintDivisorNumber(n));
        } finally {
            sc.close();
        }
    }
}
