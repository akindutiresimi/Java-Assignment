import java.util.Scanner;
	public class Cubes{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number");
	int number = input.nextInt(); 

	int square = (number * number);
	int cube = (number * number * number);

	System.out.println("result is:" + square);
	System.out.println("result is:" + cube);

	}
}