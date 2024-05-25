public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int n = Math.abs(number);
        int sum =0, d =0;
        while(n > 0){
            d = n % 10;
            n = n/10;
            sum = sum * 10 + d;
        }
        if (sum == Math.abs(number))
            return true;
        else
            return false;
    }
}
