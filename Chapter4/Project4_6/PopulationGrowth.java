import java.util.Scanner;

public class PopulationGrowth{
	public static void main ( String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the initial number of organisms: ");
		int start = reader.nextInt();
		System.out.println("Please enter the rate of growth: ");
		double growthRate = reader.nextDouble();
		System.out.println("Please enter the number of hours it takes to achieve this rate:" );
		double hours = reader.nextDouble();
		System.out.println("Please enter the number of hours during which the population grows: " );
		double numHours = reader.nextDouble(); // numHours


		double finalPopulation = start * growthRate * (numHours/hours);

		System.out.println("The total number of organisms after " + (int)numHours + "hours is " + finalPopulation); 
	}









}
