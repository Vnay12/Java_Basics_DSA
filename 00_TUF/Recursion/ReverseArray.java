import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    ArrayList<Integer> arr = new ArrayList<>();

    public int arrayReverse(int n) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseArray chk = new ReverseArray();
        try {
            // your code here
            int n = sc.nextInt();
            chk.arrayReverse(n);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
