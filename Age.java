import java.util.Scanner;
	public class Age{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter age");
	int age = input.nextInt();

	int nextyear = age + 1;
	System.out.println("the result is:" +nextyear);

	}
}