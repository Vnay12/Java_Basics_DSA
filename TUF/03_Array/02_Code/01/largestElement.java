import java.util.Scanner;

public class largestElement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int[] arr;

        try {
            n = sc.nextInt();
            arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                sc.nextInt();
            }
            System.out.println(arr);
        } finally {
            sc.close();
        }

    }
}