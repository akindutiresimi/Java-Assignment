import java.util.Scanner;
	public class Arithmetic{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number");
	int number1 = input.nextInt();

	System.out.print("Enter another number");
	int number2 = input.nextInt();

	int product = (number1 * number1);
	int product2 = (number2 * number2);

	int sum = (product + product2);
	int differences = (product - product2);

	System.out.printf("product of the numbers is %d%n", product);
	System.out.printf("product2 of the numbers is %d%n", product2);
	System.out.printf("sum of the numbers is %d%n", sum);
	System.out.printf("differences of the numbers is %d%n", differences);
		
	
	}
}