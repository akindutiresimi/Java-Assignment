import java.util.Scanner;

	public class PositiveNegativeNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int Smallest = 0;
	int NegativeNumber = 0;
	int PositiveNumber = 0;

	System.out.println("Enter userInput");
 	int userInput = input.nextInt();
	NegativeNumber = userInput;
	PositiveNumber = userInput;

	

	while(counter <= 10){
	System.out.print("Enter userInput");
	userInput = input.nextInt();

	
	 userInput = NegativeNumber;
	if (userInput < 0){ 
	userInput = NegativeNumber;
	NegativeNumber++;
	}
	userInput = PositiveNumber;
	if (userInput > 0){  
	userInput = PositiveNumber;
	PositiveNumber++;	
	}

	counter++;
	PositiveNumber++;
	NegativeNumber++;

	}
	
	System.out.println("the NegativeNumber:" + NegativeNumber++);
	System.out.println("the PositiveNumber:" + PositiveNumber++);

	}

}