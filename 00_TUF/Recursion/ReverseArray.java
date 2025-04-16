import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public void arrayReverse(int i, ArrayList<Integer> A, ArrayList<Integer> B) {
        if (i < 0) {
            return;
        }
        B.add(A.get(i));
        arrayReverse(i - 1, A, B);
        System.out.println(B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ReverseArray chk = new ReverseArray();
        try {
            // your code here
            System.out.println("enter the elemets you want to input");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                arr.add(temp);
            }
            System.out.println(arr);
            chk.arrayReverse(arr.size() - 1, arr, arr2);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
