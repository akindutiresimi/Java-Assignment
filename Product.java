import java.util.Scanner;
	public class Product{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number");
	int number1 = input.nextInt();

	System.out.print("Enter number2");
	int number2 = input.nextInt();

	int product = (number1 * number2);
	System.out.println("product is: " + product);
	

}
}