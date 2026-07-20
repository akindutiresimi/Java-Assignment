import java.util.Scanner;
	public class Comparing2{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
 	System.out.print("Enter number"); 
	int number = input.nextInt();

	int cube = number * number * number;
	System.out.printf("%d%n", cube);

	if (number >= 500){
	System.out.printf("%d >= %d%n", number, 500);
	}

	if (cube >= 500){
	System.out.printf("%d >= %d%n", cube, 500);
	}

	if (number < 500){
	System.out.printf("%d < %d%n", number, 500);
	}

	if (cube < 500){
	System.out.printf("%d < %d%n", cube, 500);
	}	
	
	}
} 
pseudocode 
ask for number 
input the number 
cube the number 
use the if statement to know the greater equal or less than