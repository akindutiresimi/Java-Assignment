import java.util.Scanner;

	public class Days{
	public static void main(String[] args){  

	Scanner input = new Scanner(System.in);
 	
	System.out.print("Enter number");
	int number = input.nextInt();

	
	int monday = 1;
	int tuesday = 2;
	int wednesday = 3;
	int thursday = 4;
	int friday = 5; 
 	int saturday = 6;
 	int sunday = 7;
	

	if (number %7 == 1){
	System.out.println("monday" + monday);
	} 

	if (number %7 == 2){
	System.out.println("tuesday" + tuesday);
	} 

	if (number %7 == 3){ 
	System.out.println("wednesday" + wednesday);
	} 

	if (number %7 == 4){ 
 	System.out.println("thursday" + thursday); 
	} 
	
	if (number %7 == 5){ 
       System.out.println("friday" + friday);
	}

	 if (number %7 == 6){
	System.out.println("saturday" + saturday);
	}
	
	 
	if (number %7 == 0){
	System.out.println("sunday" + sunday);
	}

  	//System.out.println("day" + day);  



	}

}