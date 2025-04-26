
public class ReverseNumber {
    public int numberReverse(int n) {
        // logic here
        int answer = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            answer = (answer * 10) + lastDigit;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = -123;
        ReverseNumber rvr = new ReverseNumber();
        int finalanswer = rvr.numberReverse(n);
        System.out.print(finalanswer);
    }
}
