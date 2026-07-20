import java.util.Scanner;

	public class GeometryTwo{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("xOne");
	double xOne = input.nextDouble();

	System.out.print("xTwo");
	double xTwo = input.nextDouble();

	System.out.print("yOne");
	double yOne = input.nextDouble();

	System.out.print("yTwo");
	double yTwo = input.nextDouble();

	double distance = ((xTwo - xOne) + (yTwo - yOne));

	System.out.println("distance:" + distance);	

	}


}