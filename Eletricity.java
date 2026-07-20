import java.util.Scanner;
	public class Eletricity{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number");
	int kilowatts = input.nextInt(); 

	if(kilowatts >= 50 && kilowatts <= 150){
	int Amount = (kilowatt * 25);
	System.out.println("the monthly amount is" + amount);
	}

	if(kilowatts >= 100 && kilowatts <= 150){
	int Amount = (kilowatt * 45);
	System.out.println("the monthly amount is" + amount);
	}

	if (kilowatt > 150){
	int Amount = (kilowatt * 68);
	System.out.println("the amount for montly is" + amount);
	}

		


	}



}