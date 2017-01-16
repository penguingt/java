import java.util.Scanner;
public class Factorial{
	public static void main( String []args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number greater than 0: ");
		long number = reader.nextInt();
		long product = 1;
		long count = 1;
		while(count <= number){

			product = product * count;
			System.out.println(product);
			count++;
			System.out.println("The value of count is " + count + " and the value of number is " + number);
		}
		
		System.out.println("The factorial of " + number + " is " + product);
			


	}

}


