import java.util.Scanner;

	public class LargestNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int smallest = 0;

	System.out.println("Enter userInput");
 	int userInput = input.nextInt();
	smallest = userInput;

	while(counter <= 5){
	System.out.print("Enter userInput");
	userInput = input.nextInt();

	if (userInput < smallest){
	 smallest = userInput;
	}

	counter++;
	}
	
	System.out.println("the smallest number:" + smallest);
	
	


}
}