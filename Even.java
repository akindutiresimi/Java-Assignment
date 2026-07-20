import java.util.Scanner;
public class Even{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("input integer");
		int number1 = input.nextInt();	
 
		if(number1%2==0){
		System.out.print("The number is Even");
		} 
		else{
		System.out.print("The number is odd");
		}


}
}

