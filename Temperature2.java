import java.util.Scanner;
	public class Temperature2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter temperature");
	double temperature = input.nextDouble();
	
	double kelvin = (temperature + 273);
	double celsius = (kelvin - 273.15);
	double fahrenheit = ((kelvin - 273.15) * 9 / 5 + 32);

	System.out.println("celsius = " + celsius);
 	System.out.println("fahrenheit = "  + fahrenheit);

	}
}
