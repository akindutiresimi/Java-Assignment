import java.util.Scanner;
public class Rectangle{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);

		System.out.println ("Enter a value");
		int number1 = input.nextInt ();

		System.out.println ("Enter another value");
		int number2 = input.nextInt();

		int area = number1*number2;
		int perimeter = 2*(number1 + number2);
		System.out.printf("The area: %d%n and the perimeter: %d%n", area, perimeter);
	
	
	}
}