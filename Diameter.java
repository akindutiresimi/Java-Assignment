import java.util.Scanner;
	public class Diameter{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter length");
	int length = input.nextInt();
	
	System.out.print("Enter width");
	int width = input.nextInt();

	int perimeter = 2 * length + width;
	System.out.printf("the result is %d%n", perimeter);

	int area = length * width;
	System.out.printf("the result is %d%n", area);

	int diagonal = length + width;
	System.out.printf("the result is %d%n", diagonal);
	 

}

}
