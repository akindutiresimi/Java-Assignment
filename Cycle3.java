import java.util.Scanner;

	public class Cycle3{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter radius");
	double radius = input.nextDouble();

	System.out.print ("Enter pie");
	double pie = input.nextDouble();

	double perimeter = (2 * radius * pie);
	System.out.println("the result is:" + perimeter);

	double area = (radius * radius * pie);
	System.out.println("the result is:" + area);


	}	

}
