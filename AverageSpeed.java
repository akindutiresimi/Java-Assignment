import java.util.Scanner;
	
	public class AverageSpeed{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter distance");
	double distance = input.nextDouble();

	System.out.print("Enter hour");
	double hour = input.nextDouble(); 

	System.out.print("Enter minute");
	double minute = input.nextDouble();

	double time = hour + (minute / 60);

	double averageSpeed = distance / time;
	System.out.println("averageSPeed:" + averageSpeed);


	}
}