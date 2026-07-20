import java.util.Scanner;
	public class Largest2{
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

	System.out.print("Enter number5");
	int number5 = input.nextInt();
	
	System.out.print("Enter number6");
	int number6 = input.nextInt(); 

	if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5 && number1 < number6){         
	System.out.printf("number1 is smallest %n");                                                                        
	}                                                                                                                

	if (number2 < number1 && number2 < number3 && number2 < number4 &&  number2 < number5 && number2 < number6){     
	System.out.printf("number2 is smallest %n"); 
	}  	
 c
	if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5 && number3 < number6){
	System.out.printf("number3 is smallest %n"); 
	}  
	
	if (number4 < number1 && number4 < number2 && number4 < number3 && number4< number5 && number4 < number6){
	System.out.printf("number4 is smallest %n"); 
	}  

	if (number5 < number1 && number5 < number2 && number5 < number3 && number3 < number4 && number5 < number6){
	System.out.printf("number5 is smallest %n"); 
	}  
	
	if (number6 < number1 && number6 < number2 && number6 < number3 && number6 < number4 && number6 < number5){
	System.out.printf("number6 is smallest %n"); 
	}  

	if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5 && number1 > number6){
	System.out.printf("number1 is largest %n"); 
	}  

	if (number2 > number1 && number2 > number3 && number2 > number4 &&  number2 > number5 && number2 > number6){
	System.out.printf("number2 is largest %n"); 
	}  	

	if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5 && number3 > number6){
	System.out.printf("number3 is largest %n"); 
	}  
	
	if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5 && number4 > number6){
	System.out.printf("number4 is largest %n"); 
	}  

	if (number5 > number1 && number5 > number2 && number5 > number3 && number3 > number4 && number5 > number6){
	System.out.printf("number5 is largest %n"); 
	}  
	
	if (number6 > number1 && number6 > number2 && number6 > number3 && number6 > number4 && number6 > number5){
	System.out.printf("number6 is largest %n"); 
	}  

 	}
	
}


pseudocode

call in scanner 
input all the 6 number 
use if statement 
using both < &>
pick the number 1 by 1 on the straight line using < &. > for all the to the next then to the next