import java.util.Scanner;
	public class Circle{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter radius");

	double radius = input.nextDouble();
	double diameter = (2 * radius);

	double pie = (3.14159);
	double circumference = (2 * pie * radius);	
	
	double area = (pie * radius * radius);
	
	System.out.printf("diameter of the number:%f%n", diameter);  
	System.out.printf("circumference of the number:%f%n", circumference);

	
 
	}
}