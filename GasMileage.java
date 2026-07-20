import java.util.Scanner;
	
	public class GasMileage{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
		int inputCounter = 0;
		int total = 0;
	
	System.out.println("Enter miles && gallon or -1 to quit:");
	int miles = input.nextInt();
	int gallon = input.nextInt();

	while(miles != - 1 && gallon != -1 ){

	int milesperGallon = (int)miles / gallon;
	total = total + milesperGallon;

	System.out.println("the total is," + total); 
		 
	System.out.println("Enter miles && gallon or -1 to quit:");
	miles = input.nextInt();
	gallon = input.nextInt();
	inputCounter++;
	}
	
	int averagemiles = (int)total / inputCounter;
 	System.out.println("the averagemiles is:" + averagemiles); 
		

	}
			
}