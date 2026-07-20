import java.util.Scanner;

	public class Pay{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter hourlyWorked");
	double hourlyWorked = input.nextDouble();

	System.out.print("Enter hourlyRate");
	double hourlyRate = input.nextDouble();

	System.out.print("Enter bonus");
	double bonus = input.nextDouble();
 
 	System.out.print("Enter taxRate");
	double taxRate = input.nextDouble();

	double grossPay = hourlyWorked * hourlyRate + bonus;
	double taxAmount = grossPay * taxRate;
	double netPay = grossPay - taxAmount;

	System.out.println("grossPay:" + grossPay);
	System.out.println("taxAmount:" + taxAmount); 
	System.out.println("netPay:" + netPay);	

	}

}