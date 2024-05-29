import java.util.Scanner;

public class ScannerInputReceive {
    public static void scannerInputReceive(){
        Scanner scanner = new Scanner(System.in);
        int counter= 1;
        int sum = 0;

        while(counter<=5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try{
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum +=number;
            }
            catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of the 5 nums: "+ sum);
    }
}
