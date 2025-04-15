// Removed package declaration to match the directory structure

public class Armstrong {

    public boolean checkArmStrong(int n) {
        int original = n;
        if (n == 0)
            return true;
        n = Math.abs(n);
        int count = (int) (Math.log10(n) + 1);
        System.out.println(count);

        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            int cube = (int) Math.pow(lastDigit, count);
            sum = sum + cube;
            n = n / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int n = 1634;
        Armstrong arm = new Armstrong();
        boolean finalanswer = arm.checkArmStrong(n);
        System.out.println(finalanswer);
    }
}
