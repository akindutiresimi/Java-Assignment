import java.util.Scanner;

	public class RightTriangle{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter length");
	int length = input.nextInt();


	for(int counter = 1; counter <= length; counter++){
	
	if(length > 10){
	System.out.print("the length pass 10");
	break;
	
	}


	for(int asterisks = 1; asterisks <=counter; asterisks++){
	System.out.print("*");
	}
	
	System.out.println();
	}

	}



}