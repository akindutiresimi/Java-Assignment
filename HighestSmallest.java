/*intilization of variable
using if and else
determine wether the 
number is big,medium, and small*/



import java.util. Scanner;
	public class HighestSmallest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("numberOne");
	int numberOne = input.nextInt(); 

	System.out.print("numberTwo");
	int numberTwo = input.nextInt(); 


	if (numberOne > numberTwo && numberTwo < numberOne){
	System.out.println("largest");
	} 

	else if (numberOne < numberTwo && numberTwo > numberOne){
	System.out.println("smallest");
	}
	}
}