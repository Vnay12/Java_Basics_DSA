import java.util.Scanner;

public class Print1toN {
    public int print(int n) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            Print1toN prt = new Print1toN();
            prt.print(n);
        } finally {
            sc.close();
        }
    }
}
