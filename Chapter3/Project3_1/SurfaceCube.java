
import java.util.Scanner;
public class SurfaceCube
{
	public static void main ( String [] args)
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("What is the length of an edge on the cube?");
		int edge = reader.nextInt();
		int surfaceArea = edge * edge *6;

		System.out.println("The surface area is " + surfaceArea);
	}
}

