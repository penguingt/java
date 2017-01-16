import java.util.Scanner;


public class Project4_3
{

	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the length of the call?");
		int lenCall = reader.nextInt();
		final double BASE_2_MINUTES = 1.15;
 		double cost =0.0;
		
		if (lenCall > 2) // if length of call is more than two minutes
		{
			cost = BASE_2_MINUTES + (lenCall-2)* (0.5); 

		}
		else if(lenCall ==2)
		{
			cost=BASE_2_MINUTES;
		}
		else
			cost =0; 

		System.out.println("The cost is : " + cost);


	}




}
