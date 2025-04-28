// Leetcode #1941

import java.util.HashMap;
import java.util.Scanner;

public class EqualOccurrence {

    public boolean areOccurrenceNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int freq = map.getOrDefault(c, 0) + 1;
            map.put(c, freq);
        }
        int freq = 0;
        for (int value : map.values()) {
            freq = value;
            break;
        }

        for (int value : map.values()) {
            if (value != freq) {
                return false;
            }
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
