import java.util.Scanner;
public class Temperature{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input celsius:");
		int celsius = input.nextInt();

		int fahrenheit = (9*celsius/5)+32;
		System.out.printf("temperature in fahrenheit is: %d%n", fahrenheit);
         
}

}