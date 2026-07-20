import java.util.Scanner;

	public class SecondLargest4{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int Number = 0;
	int Largest = 0;
	int SecondLargest = 0;
	int Total = 0;
	double Average = 0;

	System.out.print("Enter Number");
	 Number = input.nextInt();
	 Largest = Number;
	

	while(counter < 10){
	System.out.print("Enter Number");
	Number = input.nextInt();

	if(Number > Largest){
	SecondLargest = Largest;
	Largest = Number;
	}
	else if (Number < Largest && Number > SecondLargest){
	}
	
	Total = Total + Number;
	
	Average = (double)Total / 10;

	
	counter++;
	}
	 
	System.out.println("the Largest number:" + Largest);

	System.out.println("the SecondLargest Number:" + SecondLargest);
  
	System.out.printf("Total %d%n, Average %f%n, Largest %d%n, SecondLargest%d%n", Total, Average, Largest, SecondLargest);
	

	}
}
