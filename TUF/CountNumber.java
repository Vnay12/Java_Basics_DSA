
package TUF;

public class CountNumber {

    // Time complexity of code is : O(Logn)
    public int checkNumber(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // More optionmal Solution in constant time : O(1)
    public int optimalCheckNumber(int n) {
        if (n == 0)
            return 1;
        n = Math.abs(n); // incase negative number
        int answer = (int) (Math.log10(n) + 1);
        return answer;
    }

    public static void main(String[] args) {
        int n = 1234;
        CountNumber chk = new CountNumber();
        int answer = chk.checkNumber(n);
        int optimalAnswer = chk.optimalCheckNumber(n);
        System.out.println(answer);
        System.out.println(optimalAnswer);

    }
}
