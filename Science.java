import java.util.Scanner;
	
	public class Science{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("intialTemp");
	double intialTemp = input.nextDouble();

	System.out.print("finalTemp");
	double finalTemp = input.nextDouble();

	System.out.print("mass");
	double mass = input.nextDouble();

	double Q = mass * (finalTemp - intialTemp) * 4184; 

	System.out.print("Q:" + Q);

	}


}