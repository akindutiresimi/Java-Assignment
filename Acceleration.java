import java.util.Scanner;

	public class Acceleration{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("intialVelocity");
	double intialVelocity = input.nextDouble();

	System.out.print("finalVelocity");
	double finalVelocity = input.nextDouble();

	System.out.print("time");
	double time = input.nextDouble(); 
	double timeSecond = time * 60;

	double acceleration = (finalVelocity - intialVelocity) / timeSecond;

	System.out.println("acceleration:" + acceleration);

	}

}