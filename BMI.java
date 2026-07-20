import java.util.Scanner;

	public class BMI{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight");
	double weight = input.nextDouble();

	System.out.print("Enter height");
	double height = input.nextDouble();
	
	double BMI = weight / (height * height);
	System.out.println("BMI:" + BMI);

	}

}