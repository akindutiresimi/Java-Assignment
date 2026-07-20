import java.util.Scanner;

	public class SecondSmallest2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int Smallest = 0;
	int SecondSmallest = 0;
	int Number = 0;

	System.out.println("Enter Number");
 	Number = input.nextInt();
	Smallest = Number;

	while(counter < 10){
	System.out.print("Enter Number");
	userInput = input.nextInt();

	if (Number > Smallest){
	 SecondSmallest = Smallest;
	 SecondSmallest = Number;
	}
	 else if (Number < Smallest && Number > SecondNumber);
	}
	
	counter++;
	}
	
	System.out.println("the Smallest number:" + Smallest); 
	System.out.println("the SecondSmallest number:" + SecondSmallest);

	}

}