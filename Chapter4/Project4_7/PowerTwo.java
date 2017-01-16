import java.util.Scanner;

public class PowerTwo{

	public static void main ( String [] args){
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the exponent: ");
		int num = reader.nextInt();
	
		if(num == -1){

			System.exit(0);
	
		}
		
		int total =1; 
		for( int i=0; i < num; i++){
		
		total *= 2;
				
		}






		System.out.println("2 raised to the " + num + " power is " + total );

	}




}
