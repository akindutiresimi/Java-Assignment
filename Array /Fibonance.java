import java.util.Arrays;
public class Fibonance{

public static int[] fibonance(int number){

	
	int numberOne = 0;
	int numberTwo = 1;
	int sum = 0;
	int[] numbers = new int[number];
	int counter = 0;

	for(int count = 1; count <= number; count++){
	
		sum = numberOne + numberTwo;
		 numberOne = numberTwo;
		 numberTwo = sum;
		numbers[counter] += sum;
		counter++;
		 	
	}
	return numbers;
	}


public static void main(String[] args){
int number = 7;
System.out.println(Arrays.toString(fibonance(number)));
}
}	
