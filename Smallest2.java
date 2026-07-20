import java.util.Scanner;
	public class Smallest2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number");
	int number1 = input.nextInt();

	System.out.print("Enter number2");
	int number2 = input.nextInt();

	System.out.print("Enter number3");
	int number3 = input.nextInt(); 

	System.out.print("Enter number4");
	int number4 = input.nextInt(); 

	int sum = number1 + number2 + number3 + number4;
	System.out.printf("%d%n", sum);

	int average = sum / 2;
	System.out.printf("%d%n", average);

	int product = number1 * number2 * number3 * number4 ;
	System.out.printf("%d%n", product);

	if (number1 < number2 && number1 < number3 && number1 < number4){
	System.out.printf("number1 is smallest %n"); 
	}  

	if (number2 < number1 && number2 < number3 && number2 < number4){
	System.out.printf("number2 is smallest %n"); 
	}  	

	if (number3 < number1 && number3 < number2 && number3 < number4){
	System.out.printf("number3 is smallest %n"); 
	}  
	
	if (number4 < number1 && number4 < number2 && number4 < number3){
	System.out.printf("number4 is smallest %n"); 
	}  

	if (number1 > number2 && number1 > number3 && number1 > number4){
	System.out.printf("number1 is largest %n"); 
	}  

	if (number2 > number1 && number2 > number3 && number2 > number4){
	System.out.printf("number2 is largest %n");
	} 

 	if (number3 > number1 && number3 > number2 && number3 > number4){
	System.out.printf("number3 is largest %n");
	} 

	if (number4 > number1 && number4 > number2 && number4> number3){
	System.out.printf("number4 is largest %n"); 
	}  


	}
}