import java.util.Scanner;
	public class Time{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter hour");
	int hour = input.nextInt();

	System.out.print("Enter minutes");
	int minutes = input.nextInt();

	System.out.print("Enter seconds");     
	int seconds = input.nextInt(); 

	System.out.print( hour + ":" + minutes + ":" + seconds);
	
	
	}
}