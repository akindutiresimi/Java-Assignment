import java.util.Scanner;
	public class CreditLimit{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter accountNumber && balance && charge && Credit && creditLimit");
	
	int accountNumber = input.nextInt();
	int balance = input.nextInt();
	int charge = input.nextInt();
	int credit = input.nextInt();
	int creditLimit = input.nextInt();

	int newBalance = (balance - charge - credit);
	System.out.println("the newBalance is :" + newBalance);

	if(newBalance > creditLimit){

	System.out.println("Credit limit exceeded");
	}
	
	
	}

}
