public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number <0)
            return -1;
        int sum = 0,d;
        while(number > 0){
            d = number % 10;
            number /= 10;
            if(d % 2 ==0){
                sum +=d;
            }
        }
        return sum;
    }
}
