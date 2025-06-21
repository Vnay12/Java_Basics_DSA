import java.util.Scanner;

public class printNameNto1 {
    public void print(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNameNto1 prt = new printNameNto1();

        try {
            int n = sc.nextInt();
            prt.print(n);

        } finally {
            sc.close();
        }
    }
}
