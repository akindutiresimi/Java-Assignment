import java.util.Scanner;
	public class Zero{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number");
	int number1 = input.nextInt();

	System.out.print("Enter number2");
	int number2 = input.nextInt();

	System.out.print("Enter number3");     
	int number3 = input.nextInt(); 

	System.out.print("Enter number4");
	int number4 = input.nextInt();  
	
	System.out.print("Enter number5");
	int number5 = input.nextInt(); 

	System.out.print("Enter number6");
	int number6 = input.nextInt();
	
	int positive = 0;
	int negative = 0;
	int zero = 0;
	int positivesum = 0; 
	int negativesum = 0;

	if (number1 > 0){
	positive = positive + 1;
	positivesum = positivesum + 1;
	}
	if (number1 < 0){
	negative = negative + 1;
	negativesum = negativesum + 1;
	}
	if (number1 == 0){
	zero = zero +1;
	}
	if (number2 > 0){
	positive = positive + 1;
	positivesum = positivesum + 1;
	}

	if (number2 < 0){
	negative = negative + 1;
	negativesum = negativesum + 1;
	}
	
	if (number2 == 0){
	zero = zero +1;
	}

	if (number3 > 0){
	positive = positive + 1;
	positivesum = positivesum + 1;
	}

	if (number3 < 0){
	negative = negative + 1;
	negativesum = negativesum + 1;
	}
	
	if (number3 == 0){
	zero = zero +1;
	}

	if (number4 > 0){
	positive = positive + 1;
	positivesum = positivesum + 1;	
	}

	if (number4 < 0){
	negative = negative + 1;
	negativesum = negativesum + 1;
	}
	
	if (number4 == 0){
	zero = zero +1;
	}

	if (number5 > 0){
	positive = positive + 1;
	positivesum = positivesum + 1;
	}

	if (number5 < 0){
	negative = negative + 1;
	negativesum = negativesum + 1;
	}
	
	if (number5 == 0){
	zero = zero +1;
	}

	if (number6 > 0){
	positive = positive + 1;
	positivesum = positivesum + 1;
	}

	if (number6 < 0){
	negative = negative + 1;
	negativesum = negativesum + 1;
	}
	
	if (number6 == 0){
	zero = zero + 1;
	}

	System.out.printf("positive = %d%n", positive);

	System.out.printf("negative = %d%n", negative);

	System.out.printf("zero = %d%n", zero); 
	
	System.out.printf("Sum of all negativesum  = %d%n", negativesum);
	
	System.out.printf("sum of all positivesum = %d%n", positivesum);


	}

}



	
	

	