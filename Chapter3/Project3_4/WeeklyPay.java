import java.util.Scanner;

public class WeeklyPay
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner (System.in);
		
		System.out.println("What is the employees hourly wage");
		double hourlyWage = reader.nextDouble();
		System.out.println("Number of total regular hours?");
		double regularHours = reader.nextDouble();
		System.out.println("Number of total overtime hours?");
		double overtimeHours = reader.nextDouble();
		
		double weeklyPay = hourlyWage * regularHours + (overtimeHours *1.5 * hourlyWage);
		System.out.println("The employee's total weekly pay is $" + weeklyPay);
	}
}

