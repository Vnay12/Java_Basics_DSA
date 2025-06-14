
/*

⁡⁢⁣⁢                                𝗗𝗦𝗔 𝗖𝗵𝗲𝗮𝘁 𝗦𝗵𝗲𝗲𝘁⁡

     * Time complexity sequence
     * O(1)
     * O(Log N)
     * O(Sqrt root N)
     * O(N)
     * O(N Log N)
     * O(N^2)
     


⁡⁣⁢⁡⁣⁢⁣⁡⁢⁣⁢# 𝗛𝗮𝘀𝗵𝗶𝗻𝗴 / 𝗛𝗮𝘀𝗵𝗠𝗮𝗽
    𝟭) 𝗖𝗿𝗲𝘁𝗶𝗻𝗴 𝗙𝗿𝗲𝗾𝘂𝗲𝗻𝗰𝘆 𝗛𝗮𝘀𝗵𝗠𝗮𝗽 - isFrequencyHashing
    𝟮) 𝗜𝘁𝗲𝗿𝗮𝘁𝗶𝗻𝗴 𝘁𝗵𝗿𝘂 𝗛𝗮𝘀𝗵𝗠𝗮𝗽 𝘁𝗼 𝗿𝗲𝘁𝗿𝗶𝘃𝗲 𝗞𝗲𝘆 𝗩𝗮𝗹𝘂𝗲 - isKeyValueHashing

# Array
    1) Display of array⁡ - ⁡⁢⁣⁢isArrayDisplay⁡


*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DSA_CheatSheet {

    // ⁡⁣⁢⁡⁢⁣⁢# Hashing / Hashmap⁡
    // ⁡⁣⁡⁣⁢⁡⁢⁣⁢1) This is creating HashMap from Array and then storing its
    // frequency⁡

    public int isFrequencyHashMap(int[] n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : n) {
            map.put(i, (map.getOrDefault(i, 0) + 1));
        }

        return 0;
    }

    // ⁡⁣⁢⁡⁢⁣⁢2) Creating HashMap and Iterating thru this key value and printing⁡

    public int isKeyValueHashing(int[] n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : n) {
            map.put(i, (map.getOrDefault(i, 0) + 1));
        }

        // Using Map.entry
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        // ⁡⁣⁢⁡⁢⁣⁢Using For each and lamda operator⁡

        map.forEach((key, value) -> System.out.println(key + value));

        return 0;
    }

    // ⁡⁢⁣⁢# Array⁡
    // ⁡⁢⁣⁢1) Display of Array⁡

    public int isArrayDisplay(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        return 0;
    }

    // #
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ⁡⁣⁢⁣~~~~~~~~~~~~~~𝗔𝗹𝗹 𝗩𝗮𝗿𝗶𝗮𝗯𝗹𝗲𝘀~~~~~~~~~~~~~~~⁡

        int n;
        int[] arr;

        try {
            n = sc.nextInt();
            arr = new int[n];

            // ~⁡⁣⁢⁣~~~~~~~Initialising Array~~~~~~~~~~~~~~~⁡

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

        } finally {
            sc.close();
        }
    }
}
