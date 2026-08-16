import java.util.Arrays;
public class FibonanceOfNumber{

	public static int fibonanceOfNumber(int number){
	
	numberOne = 0;
	numberTwo = 1;

	int[] numbers = new int[number];

	for(int index = 0; index < number; index++){
		numbers[index] = numberOne;
		int nextNumber = numberOne + numberTwo;
		numberOne = numberTwo;
		numberTwo = nextNumber;	
	for(int index = 0; index < numbers; index++){
	result = numbers[index];
	}
	return result;
	}
}