package Revision;

public class Armstrong {
    public boolean checkArmstrong(int n) {
        if (n == 0) {
            return false;
        }
        // logic here
        int number = (int) Math.log10(n) + 1;
        int og = n;
        int lastdigit = 0;
        int sum = 0;
        while (n > 0) {
            lastdigit = n % 10;
            sum = sum + (int) Math.pow(lastdigit, number);
            n = n / 10;

        }
        System.out.println(sum);
        if (sum == og) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        int n = 153;
        Armstrong chk = new Armstrong();
        boolean finalanswer = chk.checkArmstrong(n);
        System.out.println(finalanswer);
    }
}
