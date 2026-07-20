import java.util.Scanner;
	
	public class SalesCommission{
	public static void main(String[] args){

	Scanner input =	new Scanner(System.in);
	double inputcounter = 0;
	double total = 0;

	System.out.println("Enter value  or -1 to quit:");
	double value = input.nextDouble(); 

	while(value != -1){
	double earning = (0.09) * (double)value;
	total = total + earning;
	}
	
	
	System.out.println("the total is," + total);
	System.out.println("Enter value  or -1 to quit:");
	value = input.nextDouble(); 
	inputcounter++;

	



	
	
	}

}