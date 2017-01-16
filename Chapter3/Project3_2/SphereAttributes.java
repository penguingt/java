import java.util.Scanner;

public class SphereAttributes
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("What is the radius of the sphere?");
		double radius =reader.nextDouble();
		double diameter = radius *2;
		double circumference = diameter * Math.PI;
		double volume = (4.0/3.0) * Math.PI * radius*radius*radius;
		double surfaceArea = 4.0 * Math.PI * radius *radius; 
		System.out.println("The diameter is " +diameter);
		System.out.println("The circumference is " + circumference);
		System.out.println("The volume is " + volume );
		System.out.println("The surface area is " + surfaceArea);
		
	}
}
 
		
		
		
