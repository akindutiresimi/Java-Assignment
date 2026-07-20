import java.util.Scanner;

	public class Geometry{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter sideOne");
	double sideOne = input.nextDouble();

	System.out.print("Enter sideTwo");
	double sideTwo = input.nextDouble();

	System.out.print("Enter sideThree");
	double sideThree = input.nextDouble();

	double s = (sideOne + sideTwo + sideThree) / 2;


	double area = 0.5 * (s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
	
	System.out.println ("area:" + area);
	

	}


}