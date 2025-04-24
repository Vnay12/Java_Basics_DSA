import java.util.Scanner;

public class Count {
    // O(LogN)
    public int countDigit(int n) {
        int count = 0;

        while (n != 0) {

            // logic here
            n = n / 10;
            count++;
        }
        return count;
    }

    // O(1)
    public int optimalCount(int n) {

        // logic here
        int answer = (int) (Math.log10(n)) + 1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count chk = new Count();
        try {
            // your code here
            int n = sc.nextInt();
            int answer = chk.optimalCount(n);
            System.out.println(answer);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
