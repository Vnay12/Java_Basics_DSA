import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public int OccuranceCount(int[] n) {
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i : n) {
            hsp.put(i, (hsp.getOrDefault(i, 0) + 1));
        }

        for (Map.Entry<Integer, Integer> entry : hsp.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Count Cnt = new Count();
            Cnt.OccuranceCount(arr);
        } finally {
            sc.close();
        }
    }
}
