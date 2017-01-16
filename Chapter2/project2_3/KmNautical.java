import java.util.Scanner;
public class KmNautical
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		double kilometers;
		System.out.println("How many km are you traveling?");
		kilometers= reader.nextDouble();
		double distance = 60 * 90;
		double nauticalMiles = kilometers * 1/10000 * distance;
		System.out.println( "The number of nautical miles is " + nauticalMiles );
	}
} 
