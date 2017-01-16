import java.util.Scanner;

public class Registrar
{

	public static void main ( String [] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("What is your last name?");
		String lastName = reader.nextLine();
		System.out.println("What is your first name?");
		String firstName = reader.nextLine();
		System.out.println("Enter class year: ");
		int classYear = reader.nextInt();
		System.out.println("What is your campus phone? ");
		int campusPhone = reader.nextInt();
	
		System.out.println(firstName + " " + lastName);
		System.out.println("Class year: " + classYear);
		System.out.println("Campus phone: " + campusPhone);
	}
}
