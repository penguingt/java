import java.util.Scanner;

public  class KineticEnergy
{

		public static void main(String [] args)
		{
				Scanner reader = new Scanner(System.in);
				System.out.println("What is the objects mass in kilograms?");
				double mass = reader.nextDouble();
				System.out.println("What is the objects velocity in meters per second?");
				double velocity = reader.nextDouble();
				double momentum = velocity * mass;
				double kineticEnergy = (1.0/2.0) * mass * velocity *velocity;
				System.out.println("The objects momentum is " + momentum + " kg m/s");
				System.out.println("The objects kinetic energy is " + kineticEnergy + " joules");
        }
}
