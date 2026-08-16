public class ArraySubtraction{

	

	/public static int number(int[] number){

	int largest = 0; 
	;

	for (int count = 0; count < number.length; count++){
	if(largest < number[count]){
	largest = number[count];
	}
	}
	return largest;
	}

	public static int numbers(int[] number){

	int smallest = 0;

	for (int value = 0; value < number.length; value++){
	if (smallest > number[value]){
	smallest = number[value];
	}
	}
	return smallest;
	}



	public static void main(String[] args){

	int[] number = {2,5,1,9,7};

	System.out.println(numbers(number));


	}	
}