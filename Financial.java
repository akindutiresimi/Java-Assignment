import java.util. Scanner;

	public class Financial{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("subtotal");
	double subtotal = input.nextDouble();

	System.out.print("gratunity");
	double gratunity = input.nextDouble();

	double gradunityRate = (gratunity / 100) * subtotal;
	System.out.println("gradunityRate:" + gradunityRate);

	double total = subtotal + gradunityRate;
	System.out.println("total:" + total); 

	

	}


}