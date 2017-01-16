import java.util.Scanner;

public class Project4_1
{

	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Please input two integers: ");
		int value1 = reader.nextInt();
		int value2 = reader.nextInt();
		

		int quotient =0;
		int remainder =0;
		if(value2 ==0 || value1 == 0)
		{

		System.out.println("Invalid Input");
		}
		else if(value2 > value1)
		{
			quotient = value2/value1;
			remainder = value2%value1;
			System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);
		}
		else if( value1 < value2)
		{
			quotient = value1/value2;
    	    remainder = value1%value2;
			System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);
		}
		


	}
}
