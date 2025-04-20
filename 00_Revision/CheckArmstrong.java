import java.util.Scanner;

public class CheckArmstrong {

    // O(logN)
    public boolean checkNumberArmstrong(int n) {
        // logic here
        int sum = 0;
        int og = n;
        int count = (int) (Math.log10(n)) + 1;
        while (n != 0) {
            int lastdigit = n % 10;
            int power = (int) Math.pow(lastdigit, count);
            sum = sum + power;
            n = n / 10;
        }
        if (sum == og) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckArmstrong chk = new CheckArmstrong();
        try {
            int n = sc.nextInt();
            boolean answwer = chk.checkNumberArmstrong(n);
            System.out.println(answwer);
        } finally {
            sc.close();
        }
    }
}
