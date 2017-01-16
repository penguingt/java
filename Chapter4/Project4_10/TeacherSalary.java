import java.util.Scanner;

public class TeacherSalary{

	public static void main(String [] args){

		Scanner reader= new Scanner(System.in);
		System.out.println("Please enter the starting salary:" );
		double startingSalary = reader.nextDouble();
		System.out.println("Please enter the percentage increase: ");
		double percentageIncrease = reader.nextDouble();
		System.out.println("Please enter the number of years in the schedule: ");
		int years = reader.nextInt();

		double salary = startingSalary;
		int i =1;	
			while(i < 10 && i<=years){
			
				salary = salary + salary * (percentageIncrease/100);
				System.out.println("Year: " + i + "             " + "Salary: "  + salary);  
				i++;
			
			
	
				if(i==10){
					System.out.println("Year: 10            " + "Salary: " + salary);
					System.out.println("Salary plateaus at " + salary); 

				}
			}

			

		



	}








}
