
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {

    // Time complecity : O(N) and Runtime: 18ms
    public boolean chkDuplicate(int[] n) {
        // logic here
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            int tempfreq = hsp.getOrDefault(n[i], 0) + 1;
            hsp.put(n[i], tempfreq);
            if (tempfreq >= 2) {
                return true;
            }
        }
        return false;
    }

    // Time complexity:O(N) and Runtime: 11ms
    public boolean optimisedDuplicate(int[] n) {
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i : n) {
            if (hsp.get(i) >= 2) {

            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Duplicate DC = new Duplicate();
            for (int i = 0; i < arr.length; i++) {
                System.out.print("" + arr[i]);
            }
            System.out.println();
            System.out.println(DC.optimisedDuplicate(arr));

        } finally {
            sc.close();
        }

    }
}
