import java.util.Scanner;

public class DiscoverPi{

	public static void main ( String [] args){

		Scanner reader = new Scanner(System.in);
		System.out.println("Please specify number of iterations to approximate the value of pi: ");
		int num = reader.nextInt();
		
		double sum = 0.0;
		double denom =1.0;
		double numerator =1.0;
		for( int i=0; i < num; i++){
			
			sum+= numerator/denom;
			numerator *= -1;
			denom+=2;
		}

		System.out.println("The approximation of pi is " + sum*4);

		
	
	}

}
