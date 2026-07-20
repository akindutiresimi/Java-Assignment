import java.util. Scanner;
	public class ThreeTriangle{
	public static void main(String[] args){ 

	Scanner input = new Scanner(System.in);
	
	System.out.print("A");
	int A = input.nextInt();   

	System.out.print("B");
	int B = input.nextInt();  

	System.out.print("C");
	int C = input.nextInt(); 

	if (A == B && B == C && C == A){
	System.out.println("Equilateral");
	} 
 
	 else if (A == B && B != C && C != A && A == C && C == B){
	System.out.println("Isosceles");
	} 
	
	else if (A != B && B != C && C != A){
	System.out.println("Scalene"); 
 	}
	}
}