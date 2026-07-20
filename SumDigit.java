import java.util.Scanner;

	public class SumDigit{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("number");
	int number = input.nextInt();

	int numberOne = number % 10;

	int numberTwo = number /10;
	numberTwo = numberTwo % 10;

	int numberThree = number / 100;
	numberThree = numberThree % 10;

	int sum = numberOne + numberTwo + numberThree;
	System.out.println("the sum:" + sum);



	}

}