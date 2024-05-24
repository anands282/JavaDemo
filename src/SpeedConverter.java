public class SpeedConverter {
    public long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        return milesPerHour;
    }
    public void printConversion( double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1 )
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour +" mi/h");
    }
}
