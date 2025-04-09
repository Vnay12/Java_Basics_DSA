// Count all digits of a number


package TUF;



public class CountDigit {
   public int digitCount(int n) {
       // logic here
       int count = 0;
       while (n>0) {
        n = n / 10;
        count = count +=1;
       }
              return count;
   }
    
    public static void main(String[] args) {
        int n = 4;
        CountDigit cd = new CountDigit();
        int result = cd.digitCount(n);
        System.out.println(result);
    }   
}