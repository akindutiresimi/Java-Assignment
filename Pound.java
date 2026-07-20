import java.util. Scanner;

	public class Pound{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("pound");
	double pound = input.nextDouble();

	double kilogram = pound * 0.454;
	System.out.println("kilogram:" + kilogram);

	}

}