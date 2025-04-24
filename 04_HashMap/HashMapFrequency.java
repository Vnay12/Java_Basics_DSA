
import java.util.Scanner;
import java.util.HashMap;

public class HashMapFrequency {

    public void arrayHashing(int[] n) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] HashMapping = new int[13]; // precompute making new array as i new max digit
            for (int i = 0; i < n.length; i++) {
                HashMapping[n[i]] += 1;
            }

            System.out.println("Number of queries");
            int q = sc.nextInt();
            while (q != 0) {
                int que = sc.nextInt();
                q--;
                System.out.println("Frequency" + " ");
                System.out.println(HashMapping[que]);
            }

        }

        finally {
            sc.close();
        }

    }

    // in this method we will use hashmap as we it is optimised way of hashing int
    // value
    // Hashmap has <Key, value> here key is int element and value is the frequence
    // time complexity: O(1)

    public void optimisedHashing(int[] n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        try {

            for (int i = 0; i < n.length; i++) {
                int freq = hm.getOrDefault(n[i], 0) + 1;
                hm.put(n[i], freq);
            }
            System.out.println("Number of queries");
            int q = sc.nextInt();
            while (q != 0) {
                int que = sc.nextInt();
                q--;
                System.out.println("Frequency" + " ");
                System.out.println(hm.get(que));
            }

        }

        finally {
            sc.close();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Size");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) { // normal way of initialising array
                arr[i] = sc.nextInt();
            }

            // calling function

            HashMapFrequency hsh = new HashMapFrequency();
            // hsh.arrayHashing(arr);
            hsh.optimisedHashing(arr);
        }

        finally {

            sc.close();
        }
    }
}
