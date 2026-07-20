import java.util.Scanner;
	
	public class Fuel{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter distance");
	double distance = input.nextDouble();	

	System.out.print("Enter fuelPrice");
	double fuelPrice = input.nextDouble();

	System.out.print("Enter milage");
	double milage = input.nextDouble();

	double fuel = (distance / milage);
	System.out.printf("the result of fuel: %.2f", fuel);

	double totalCost = (fuel * fuelPrice);
	System.out.printf("%nthe result of totalCost: %.2f", totalCost);

	double splitCost = (totalCost / 2);
	System.out.printf("%nthe result for splitCost: %.2f", splitCost);

	


	}

}