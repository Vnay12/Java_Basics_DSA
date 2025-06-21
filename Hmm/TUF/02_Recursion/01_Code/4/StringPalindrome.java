import java.util.Scanner;

public class StringPalindrome {
    public void checkpalindrome(int start, int end, String S) {
        if (start >= end) {
            return;
        }
        String clean = S.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String og = clean;
        System.out.println(og);
        char[] charArray = S.toCharArray();
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringPalindrome ST = new StringPalindrome();

        try {
            // your code here
            String input = sc.nextLine();
            System.out.println(input);
            int start = 0;
            int end = input.length() - 1;
            ST.checkpalindrome(start, end, input);
        } finally {
            // cleanup code here
            sc.close();
        }
    }
}
