import java.util.Scanner;

public class ChangeBase{

	public static void main(String [] args){

		Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the exponent: ");
        int num = reader.nextInt();

        if(num == -1){

            System.exit(0);

        }

		System.out.println("Please enter the base value: ");
		int base = reader.nextInt();


        int total =1;
        for( int i=0; i < num; i++){

        total *= base;

        }

		System.out.println(base + " to the power of " + num + " is " + total);



	}







}
