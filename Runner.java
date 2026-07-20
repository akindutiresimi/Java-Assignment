import java.util.Scanner;
 
	public class Runner{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("enter meter");
	double meter = input.nextDouble();

	System.out.print("enter time");
	double time = input.nextDouble();

	double averageSpeed = meter / time;
	System.out.println("result is:" + averageSpeed);


	}
}