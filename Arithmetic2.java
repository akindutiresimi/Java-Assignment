import java.util.Scanner;
	public class Arithmetic2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number1");
	int number1 = input.nextInt();

	System.out.print("Enter number2");
	int number2 = input.nextInt();

	int cube1 = number1 * number1 * number1;
	System.out.println("the result is:" +cube1);

	int cube2 = number2 * number2 * number2;
	System.out.println("the result is:" +cube2);
	
	int product = cube1 * cube2;
	System.out.println("the result is:" +product);

	int remainder = cube2 / cube1;
	System.out.println("the result is:" +remainder);

	}
}

pseudocode

the cube of a number = no* no* no
mutliplcation of the cubes = cube1 * cube2
didvision of the bigger than the smaller cube