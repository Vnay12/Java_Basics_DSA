// Leetcode #1941

package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class EqualOccurrence {

    public boolean areOccurrenceNumber(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int freq = map.getOrDefault(String.valueOf(c), 0) + 1;
            map.put(String.valueOf(c), freq);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String s = sc.nextLine();
            s = s.toLowerCase();
            EqualOccurrence eq = new EqualOccurrence();
            eq.areOccurrenceNumber(s);
        } finally {
            sc.close();
        }
    }
}
