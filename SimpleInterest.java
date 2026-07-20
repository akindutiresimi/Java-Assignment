import java.util.Scanner;

	public class SimpleInterest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter principal");
	double principal = input.nextDouble();

	System.out.print("Enter rate");
	double rate = input.nextDouble();

	System.out.print("Enter time");
	double time = input.nextDouble();

	double SimpleInterest = principal * rate * time;
	double totalAmount = SimpleInterest + principal;

	System.out.println("SimpleInterest:" + SimpleInterest);
	System.out.println("totalAmount:" + totalAmount);	

	}

}