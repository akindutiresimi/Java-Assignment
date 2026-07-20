import java.util.Scanner;

	public class Plaindrome{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number");
	int number = input.nextInt(); 

	int numberOne = number % 10;
 	
	int numberTwo = number / 10;
	numberTwo = numberTwo % 10;

	int numberThree =  number / 100;
	numberThree= numberThree % 10;
	
	int numberFour = number / 1000;
	numberFour = numberFour % 10;

	int numberFive = number / 10000;
	numberFive = numberFive % 10; 

	int plaindrome = 0;

	if (numberOne == numberFive  && numberTwo == numberFour){
	plaindrome = number;
	System.out.println ("the number is:" + plaindrome);
	} 

	if (numberOne != numberFive  && numberTwo != numberFour){
	System.out.println("the number error");
	}
  	
	}

}


	
	
	