// Leetcode 442

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindDuplicate {

    public List<Integer> checkDuplicate(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]); // get actual number
            int index = val - 1; // map to index (1-based to 0-based)

            if (nums[index] < 0) {
                // already visited → duplicate
                result.add(val);
            } else {
                // mark as visited
                nums[index] = -nums[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> hsp = new HashMap<>();
        try {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int answer = sc.nextInt();
                if (answer >= 1 && answer <= n) {
                    int freq = hsp.getOrDefault(answer, 0) + 1;
                    hsp.put(answer, freq);
                    if (freq <= 2) {
                        arr[i] = answer;
                    } else {
                        System.out.println("out of bond");
                        i--;
                    }

                } else {
                    System.out.println("out of bond");
                    i--;
                }

            }
            FindDuplicate fnd = new FindDuplicate();
            fnd.checkDuplicate(arr);
        } finally {
            sc.close();
        }
    }
}
