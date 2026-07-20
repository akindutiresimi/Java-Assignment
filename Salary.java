import java.util.Scanner;
public class Salary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println ("Enter a value");
		int number1 = input.nextInt();

		System.out.println ("Enter another value");
		int number2 = input.nextInt();

		int weekly = number1*number2;
		System.out.printf("The weekly: %d%n", weekly);
		

	}
}