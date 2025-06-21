/*
Leetcode # 1002
*/

import java.util.HashMap;
import java.util.Scanner;

public class CommonChar {

    public int charinCommon(String[] n) {
        HashMap<Character, Integer> hsp = new HashMap<>();

        for (String s : n) {

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < words.length; i++) {
                words[i] = sc.next();
            }
            CommonChar chr = new CommonChar();
            System.out.println(chr.charinCommon(words));
        } finally {
            sc.close();
        }
    }
}