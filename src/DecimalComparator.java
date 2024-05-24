public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int truncatedNum1 = (int) (num1 * 1000);
        int truncatedNum2 = (int) (num2 * 1000);
        return truncatedNum1 == truncatedNum2;
    }
}
