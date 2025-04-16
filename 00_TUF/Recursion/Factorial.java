import java.util.Scanner;

public class Factorial {
    int sum = 1;

    public void numberFactorial(int n) {
        if (n < 1) {
            return;
        }
        sum = sum * n;
        System.out.println(sum);
        numberFactorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial Fct = new Factorial();
        try {
            // your code here
            int n = sc.nextInt();
            Fct.numberFactorial(n);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
