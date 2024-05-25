public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            int ldx = x % 10;
            int ldy = y % 10;
            int ldz = z % 10;

            if (ldx != ldy && ldy != ldz && ldx != ldz)
                return false;
            else
                return true;
        }
        else
            return false;
    }
    public static boolean isValid(int num){
        if(num<10 || num > 1000)
            return false;
        return true;
    }
}
