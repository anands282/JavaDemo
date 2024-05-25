public class hasSharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if((x>=10 && x<=99)&&(y>=10 && y<=99)){
            int fdx = x % 10;
            int sdx = x / 10;
            int fdy = y % 10;
            int sdy = y / 10;

            if (fdx == fdy || fdx == sdy || sdx == fdy || sdx ==sdy)
                return true;
            else
                return false;
        }
        else
            return false;

    }
}
