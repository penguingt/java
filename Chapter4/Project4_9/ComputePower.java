import java.util.Scanner;
import java.io.*;

public class ComputePower{

	public static void main(String [] args){
		Scanner reader = new Scanner(new File("BaseExponentData.txt"));
		int number =0;
		int total =1; 
		while(reader.hasNext()){
        	for( int i =0; i < reader.nextInt(); i++){
				total *= reader.nextInt();


			}
		}
	


	System.out.println("The total is" + total ); 
	}











}
