//import java.util.Scanner;
	
		//public class GasMileage{
		//public static void main(String[] args){
		
		//Scanner input = new Scanner(System.in);
		//	int numberOne = 10;
		//	int numberTwo = 20;
			
		//for (count = 1; count <= 10; count++){
		//	number % count = 0;
			
		//	System.out.println(count);
		//}
			
		//}
public class PrimeNumber{	
public static void main(String[] args){

int primeCounter = 0;
	
for(int number = 1; number <= 100; number++){
	primeCounter = 0; 
	for(int check = 1; check <= number; check++){
		if(number % check == 0){
			primeCounter++;
			if (primeCounter == 20){
				break;
			}
		}
	}
	if(primeCounter == 2){
		System.out.println(number);
	}
}		
}
}