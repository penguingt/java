import java.util.Scanner;

public class Project4_2
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the lengths of three sides of a triangle: ");
		int len1 = reader.nextInt();
		int len2 = reader.nextInt();
		int len3 = reader.nextInt();
		if(len1 <=0 || len2 <= 0 || len3 <=0)
		{
			System.out.println("Invalid input");
		}
		else if ( len1 > len3 && len1 > len2)
		{
			if ( len1 == Math.sqrt(Math.pow(len3,2) + Math.pow(len2,2)))
			{
				System.out.println("The triangle is a right traingle");
			}
			


		}

		else if(len2>len3 && len2>len1)

		{
            	if (len2 == Math.sqrt(Math.pow(len3,2) + Math.pow(len1,2)))
            	{
            	    System.out.println("The triangle is a right traingle");
         		}
				else
				{
					System.out.println("The triangle is not a right triangle");
				}
	
		}	

		else if(len3>len1 && len3>len2)
		{
			    if (len3 == Math.sqrt(Math.pow(len1,2) + Math.pow(len2,2)))
                {
                    System.out.println("The triangle is a right traingle");
                }
	            else
                {
                    System.out.println("The triangle is not a right triangle");
                }

		}

	 	else
		{
			System.out.println("The triangle is not a right triangle.");
		}

	}




}

