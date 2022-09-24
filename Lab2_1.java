import java.util.Scanner;

public class Lab2_1
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the x coordinate in point 1: ");
        double x = input.nextDouble();
        //first double input
        System.out.print("enter the y coordinate in point 1: ");
        double y = input.nextDouble();
        //secound double input
        System.out.print("enter the z coordinate in point 1: ");
        double z = input.nextDouble();
        //third double input
        System.out.print("enter the i coordinate in point 2: ");
        double i = input.nextDouble();
        //forth double input
        System.out.print("enter the j coordinate in point 2: ");
        double j = input.nextDouble();
        //fifth double input
        System.out.print("enter the k coordinate in point 2: ");
        double k = input.nextDouble();
        //last double input
        Double distanceCalc = Math.sqrt(((i-x)*(i-x))+((j-y)*(j-y))+((k-z)*(k-z)));
        //calculates the distance formula and stores it into a double
        int distanceCalcInt = distanceCalc.intValue();
        //casts the distance clac into an integer
        System.out.println("the distance between point 1 and point 2 is: "+ distanceCalc);
        System.out.println("the integer value is "+distanceCalcInt);
        System.out.println("the value of the decimal is: "+(distanceCalc-distanceCalcInt));
        //prints out the decimal only value
    }
}
