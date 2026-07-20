import java.util.Scanner;
	public class Table{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number");
	int number1 = 1;
	int square1 = number1 * number1;
	int cube1 = number1 * number1 * number1;

	int number2 = 2;
	int square2 = number2 * number2;
	int cube2 = number2 * number2 * number2;  

  	int number3 = 3;
	int square3 = number3 * number3;
	int cube3 = number3 * number3 * number3;

	int number4 = 4;
	int square4 = number4 * number4;
	int cube4 = number4 * number4 * number4;
	
	int number5 = 5;
	int square5 = number5 * number5;
	int cube5 = number5 * number5 * number5;
	
	System.out.printf("%d    %d   %d%n",    number1,          square1,           cube1);
	System.out.printf("%d    %d   %d%n",    number2,          square2,           cube2);
	System.out.printf("%d    %d   %d%n",    number3,          square3,           cube3);
	System.out.printf("%d    %d   %d%n",    number4,          square4,           cube4);         
	System.out.printf("%d    %d   %d%n",    number5,          square5,           cube5);  

	}
}