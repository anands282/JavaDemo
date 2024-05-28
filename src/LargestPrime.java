public class LargestPrime {

    public static int getLargestPrime(int number){
        if(number<0)
            return -1;
        int largestPrime = 0;
        boolean prime=true;
        for(int i=2;i<=number;i++){
            if(number %i ==0){
                for(int j=2;j<i;j++)
                    if(i%j==0){
                        prime=false;
                    }
                if(prime)
                    largestPrime = i;
            }
        }
        if(largestPrime == 0)
            return -1;
        else
            return largestPrime;
    }
}
