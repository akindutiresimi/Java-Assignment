public class Method{
	public static int add(int a, int b){
	int sum = a + b;
	return sum;
	}

	public static int subtract(int a, int b){
	int sub = a - b;
	return sub;
	}

	public static int multiplication(int a, int b){
	int mult = a * b;
	return mult;
	}

	public static int division(int a, int b){
	int divid = a / b;
	return divid;
	}

	public static void main(String[] args){

	int sumResult = add(10, 5);
	int subtractResult = subtract(12, 5);
	int multiplicationResult = multiplication(12, 5);
	int divisionResult = division(12, 5);

	System.out.println(sumResult);
	System.out.println(subtractResult);
	System.out.println(multiplicationResult);
	System.out.println(divisionResult);
	} 
}
