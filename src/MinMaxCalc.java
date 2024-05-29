import java.util.Scanner;

public class MinMaxCalc {
    public static void minMaxCalc(){
        Scanner scanner= new Scanner(System.in);
        double min = 0;
        double max = 0;


        while(true){
            String token = scanner.nextLine();
            try{

                double d= Double.parseDouble(token);
                if(d<min)
                    min =d;
                if(d>max)
                    max =d;

            }
            catch(NumberFormatException nfe){
                System.out.println("Exiting Loop, min: "+ min + " max: "+ max);
            }
        }



    }
}
