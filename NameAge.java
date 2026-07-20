import java.util.Scanner;

	public class NameAge{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter age");
	int age = input.nextInt(); 
 	input.nextLine();

	System.out.print("Enter name");
	String name = input.nextLine();

	/*System.out.print("Enter age");
	int age = input.nextInt();*/

	if (age > 18){
	System.out.printf("%s is an adult", name);
	}

 	if (age < 18){
	System.out.printf("%s is a child", name);
	}

	}


}