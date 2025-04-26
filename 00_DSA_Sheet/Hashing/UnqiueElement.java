// Leetcode 1748

package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class UnqiueElement {

    public int sumElement(int[] n) {
        int sum = 0;
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            int tempfreq = hsp.getOrDefault(n[i], 0) + 1;
            hsp.put(n[i], tempfreq);
        }

        for (int key : hsp.keySet()) {
            if (hsp.get(key) == 1) {
                sum = sum + key;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            UnqiueElement unq = new UnqiueElement();
            System.out.println(unq.sumElement(arr));
        } finally {
            sc.close();
        }
    }
}
