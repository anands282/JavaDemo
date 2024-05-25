public class NumberToWords {
    public static int getDigitCount(int number){
        if(number<0)
            return -1;
        if(number==0)
            return 1;
        int count = 0;
        while(number >0){
            number /=10;
            count++;
        }
        return count;
    }
    public static void numberToWords(int number){
        if(number <0){
            System.out.println("Invalid Value");
            return;
        }
        int reversedNum = reverse(number);
        int countDiff = getDigitCount(number) - getDigitCount(reversedNum);
        int digit = 0;
        if(number ==0){
            System.out.println("Zero");
            return;
        }
        while(reversedNum>0){
            digit = reversedNum % 10;
            reversedNum /=10;
            switch (digit){
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("Other");

            }
            System.out.print(" ");
        }
        while(countDiff>0){
            System.out.print("Zero");
            countDiff--;
            System.out.print(" ");
        }
    }
    public static int reverse(int number){
        int temp = Math.abs(number);
        int digit,reverseNum =0;
        while(temp>0){
            digit = temp% 10;
            temp = temp/10;
            reverseNum = reverseNum*10 + digit;
        }
        if(number<0)
            return reverseNum*-1;
        else
            return reverseNum;
    }
}
