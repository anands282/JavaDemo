public class MinutesToYearDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes <0){
            System.out.println("Invalid Value");
        }
        else
        {
            int years = (int)(minutes/525600);
            int days =(int) (minutes % 525600)/1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
