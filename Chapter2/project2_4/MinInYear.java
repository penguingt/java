public class MinInYear 
{

	public static void main(String [] args)
	{
		int year=1;
		int days = 365;
		int hours = 24;
		int minutes=60;
		
		int minutesYear = year * days * hours * minutes;
		System.out.println("The number of minutes in a year is " + minutesYear);
	}
}
