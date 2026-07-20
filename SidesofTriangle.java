import java.util.Scanner;
	public class SidesofTriangle{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("enter a"); 
	int a = input.nextInt();

	System.out.print("enter b");
	int b = input.nextInt();

	System.out.print("enter c");
	int c = input.nextInt();

	int perimeter = a + b + c;
 	System.out.println("perimeter:" + perimeter);

	int area = a + b / 2;
	System.out.println("area:" + area);

	}

}