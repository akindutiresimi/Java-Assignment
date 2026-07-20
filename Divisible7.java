import java.util.Scanner;
	public class Divisible7{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number");
	int number1 = input.nextInt();

	if (number1 % 7 == 0){
	System.out.println("the number1 is divided by 7");
	} 

	if (number1 % 7 == 0){
	System.out.println("the number is even");
	}
	
	if (number1 % 7 != 0){
	System.out.println("the number is not divisible by 7");
	}
	if (number1 % 7 != 0){
	System.out.println("thwe number is odd");
	} 

	
	}

}
pseudocode 
input scanner 
called the number
check if the number is divisible by 7
if it is print it 
if it not didvisble by 7 
print odd