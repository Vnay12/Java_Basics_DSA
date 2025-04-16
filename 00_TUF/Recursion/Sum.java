import java.util.Scanner;

public class Sum {
    int sum_number = 0;

    public void addition(int n) {
        if (n < 1) {
            return;
        }
        sum_number = sum_number + n;
        System.out.println("Current" + n);
        System.out.println(sum_number);
        addition(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum chk = new Sum();
        try {
            // your code here
            int n = sc.nextInt();
            chk.addition(n);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
