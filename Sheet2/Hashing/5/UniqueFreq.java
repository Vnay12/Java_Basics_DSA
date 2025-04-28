
/*
Leetcode # 1207
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueFreq {

    public boolean freqCheck(int[] n) {
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i : n) {
            hsp.put(i, (hsp.getOrDefault(i, 0) + 1));
        }
        HashSet<Integer> map = new HashSet<>();
        for (int value : hsp.values()) {
            if (!map.add(value)) {
                return false;
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
            UniqueFreq uq = new UniqueFreq();
            System.out.println(uq.freqCheck(arr));
        } finally {
            sc.close();
        }
    }
}