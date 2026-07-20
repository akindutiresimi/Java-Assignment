public class Method2{
	public static void WelcomeMessage(){
	String welcome = ("Welcome to Java");
	System.out.println(welcome);
	}
	
	public static int number(int n){
	int doub = n * 2;
	return doub;
	}
	
	public static boolean negative(int n){
	int number = n;
		if (number < 0){
		}
			return true; 
	}

	public static int average(int a, int b, int c){
	int aver = (a + b + c) / 3;
	return aver;
	}

	public static int timeTable(int n){
	int number = n;
	for(int timeTable = 1; timeTable <= 5; timeTable ++){
	System.out.print("timeTable");
	int multiplication = n * timeTable;
	return multiplication;

	}

	public static boolean isRange(int n, int low, int high){
	int number = n;
		if(number > low && number < high){
		}
		return true;
		}

	public static void main(String[] args){

	WelcomeMessage();
	int numberResult = (5 * 2);
	boolean negativeResult = negative(3);
	int averageResult = (5 + 5 + 5) / 3;
	int timeTableResult =(5 * 5); 
	boolean isRangeResult = (10, 5, 15);

	System.out.println();
	System.out.println(numberResult);
	System.out.println(negativeResult);
	System.out.println(averageResult);
	System.out.println(multiplication);
	System.out.println(isRangeResult);
	}	
}