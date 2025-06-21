import java.util.Scanner;
import java.util.HashMap;

public class StringHashMap {

    public void OptimisedStringHashing(char[] n) {
        HashMap<Character, Integer> freq = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 0; i < n.length; i++) {
                int tempfreq = freq.getOrDefault(n[i], 0) + 1;
                freq.put(n[i], tempfreq);
            }

            System.out.println("enter number of queries");
            int q = sc.nextInt();
            while (q != 0) {
                System.out.println("Which char you want to find and its freqency");
                char c = sc.next().charAt(0);
                System.out.println(freq.getOrDefault(c, 0));
                q--;
            }

        }

        finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("enter string");
            String input = sc.nextLine();
            char[] chr = input.toCharArray();
            StringHashMap str = new StringHashMap();
            str.OptimisedStringHashing(chr);

        } finally {
            sc.close();
        }
    }
}
