import java.util.Scanner;

public class PrintName {
    public void print(int i, int n) {

        if (i > n)
            return;
        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        PrintName prt = new PrintName();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        try {
            int n = sc.nextInt();
            prt.print(i, n);

        } finally {
            sc.close();
        }

    }
}
