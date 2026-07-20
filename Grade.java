import java.util.Scanner;
	public class Grade{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number");
	int grade = input.nextInt();

	if(grade >= 60){
	System.out.println("passed");
	} 
	else{

	System.out.println("failed");
	}
	
}
} 