import java.util.Scanner;

public class OptimisedReverseArray {
    public void ReverseArray(int n) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OptimisedReverseArray chk = new OptimisedReverseArray();

        try {
            // your code here
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i : arr) {
                System.out.print(i + "");
            }

        } finally {
            // cleanup code here
        }
    }
}
