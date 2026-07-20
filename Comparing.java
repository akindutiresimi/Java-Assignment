import java.util.Scanner;
	public class Comparing{
	public static void main(String[] args){
  	
	Scanner input = new Scanner(System.in);
        System.out.print("Enter number");

	int number = input.nextInt(); 
	int product = (number * number);

	if(number >= 100){
	System.out.printf("%d >= %d%n", number, 100);
	}
	
}
}