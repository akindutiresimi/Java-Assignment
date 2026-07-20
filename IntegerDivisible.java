import java.util.Scanner;

	public class IntegerDivisible{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
 
	int counter = 3;
	int Sum = 0;
	
	while(counter < 30){
	System.out.printf("%d ",  counter+3);
	
	counter+=3; 

	Sum = Sum + counter;

	}
	
	
	System.out.printf("the sum :%d%n ", Sum);


	}

}