import java.util.Scanner;
	public class Interest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter principal");
	double principal = input.nextDouble();

	System.out.print("Enter rate");
	double rate = input.nextDouble();

	System.out.print("Enter time");     
	double time = input.nextDouble(); 

	double interest = (principal * rate * time) / 100;
	System.out.println("inerest is:" + interest);

	}
}
