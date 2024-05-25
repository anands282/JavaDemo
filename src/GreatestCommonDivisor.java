public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10)
            return -1;
        int lesserNum = first;
        int greaterNum = second;
        if(first > second) {
            lesserNum = second;
            greaterNum = first;
        }
        if(greaterNum % lesserNum ==0)
            return lesserNum;
        for(int i = lesserNum/2;i>=1;i--){
            if(lesserNum % i ==0)
                if(greaterNum%i ==0)
                    return i;
        }
        return 1;
    }
}
