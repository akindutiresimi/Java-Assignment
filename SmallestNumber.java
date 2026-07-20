import java.util.Scanner;

	public class SmallestNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int Smallest = 0;
	int Largest = 0;
	int secondLargest = 0;
	int NegativeNumber = 0;
	int PositiveNumber = 0;

	System.out.println("Enter userInput");
 	int userInput = input.nextInt();
	Smallest = userInput;

	while(counter <= 10){
	System.out.print("Enter userInput");
	userInput = input.nextInt();

	if (userInput < Smallest){
	 Smallest = userInput;
	}
	if (userInput > Largest){
	Largest = userInput;
	}
 
	if (userInput < 0){
	userInput = NegativeNumber + 1;
	NegativeNumber++;
	}

	if (userInput > 0){  
	userInput = PositiveNumber + 1;
	++PositiveNumber;	
	}

	
	counter++;
	}
	
	System.out.println("the Smallest number:" + Smallest);
	System.out.println("the Largest number:" + Largest);
	System.out.println("the NegativeNumber:" + NegativeNumber);
	System.out.println("the PositiveNumber:" + PositiveNumber); 
	


}
}