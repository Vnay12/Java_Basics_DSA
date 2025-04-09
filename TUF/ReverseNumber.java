package TUF;

public class ReverseNumber {
    public int numberReverse(int n) {
        int ans = 0;
        while(n>0){
            ans = n %10;
            n = n / 10;
            ans = (( ans * 10 ) + 1 );

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 9987;
        ReverseNumber rev = new ReverseNumber();
        int answer = rev.numberReverse(n);
        System.out.println(answer);

    }
}
