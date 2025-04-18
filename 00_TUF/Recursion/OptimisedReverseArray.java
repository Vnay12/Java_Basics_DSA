import java.util.ArrayList;
import java.util.Scanner;

public class OptimisedReverseArray {
    public void reverseArray(int start, int end, ArrayList<Integer> A) {
        if (start >= end) {
            System.out.println(A);
            return;
        }
        int temp;
        temp = A.get(start);
        A.set(start, A.get(end));
        A.set(end, temp);
        reverseArray(start + 1, end - 1, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        OptimisedReverseArray chk = new OptimisedReverseArray();

        try {
            // your code here
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println(arr);
            int start = 0;
            int end = arr.size() - 1;
            chk.reverseArray(start, end, arr);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
