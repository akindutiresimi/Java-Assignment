import java.util.Scanner;

	public class TotalBill{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter electricityUnitConsume");
	double electricityUnitConsume = input.nextDouble();

	System.out.print("Enter costperUnit");
	double costperUnit = input.nextDouble(); 

	double TotalBill = electricityUnitConsume * costperUnit;

	System.out.println("Totalbill:" + TotalBill);

	} 

}