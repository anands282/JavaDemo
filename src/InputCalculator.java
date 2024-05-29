import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int average =0;
        int counter = 0;
        while(true){
            String strNum = scanner.nextLine();
            try{
                int num = Integer.parseInt(strNum);
                counter++;
                sum += num;
                average = (int)(sum/counter);
            }
            catch(NumberFormatException nfe){
                System.out.println("SUM = "+ sum + " AVG = " + average);
            }

        }

    }
}
