import java.util.Scanner;

public class PromptUser5Days
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
		
				String day[]= new String[5];
		
				day [0] = "Monday";
				day [1] = "Tuesday";
				day [2] = "Wednesday";
				day [3] = "Thursday";
				day [4] = "Friday";

				for ( int i=0; i<5; i ++)
				{
					System.out.println(" "); // gap between calculation and output
					System.out.println("What are your regular hours on " + day[i]);	
					System.out.println("What are your overtime hours on " + day[i]);
					System.out.println(" " );

				}
 

		}
}
