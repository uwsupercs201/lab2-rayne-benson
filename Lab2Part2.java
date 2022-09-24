import java.util.Scanner;
public class Lab2Part2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //creates new scanner input
        System.out.print("enter a number of seconds: ");
        int numSeconds = input.nextInt();
        //takes in input for number of seconds
        System.out.println(timeCalculator(numSeconds));
        //timeCalculator calls method and prints out the string

    }
    public static String timeCalculator(int secondsEntered)
    {
        int numMinutes = secondsEntered/60;
        //finds num Minutes
        int numHours = numMinutes/60;
        //finds num hours
        int numDays = numHours/24;
        //finds number of days
        int numWeeks = numDays/7;
        //finds number of weeks
        String printTime = secondsEntered+" Seconds is "+numWeeks+" weeks, "+numDays+ " days, "+numHours+" hours, "+numMinutes+" minutes, ";
        //creates the string printTime
        return printTime;
    }

}
