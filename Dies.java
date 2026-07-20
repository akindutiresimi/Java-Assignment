import java.security.SecureRandom;

	public class Dies{
	public static void main(String[] ars){

	SecureRandom randomNumber = new SecureRandom();
	int Frequency1 = 0;
	int frequency2 = 0;
	int frequency3 = 0;
	int frequency4 = 0;
	int frequency5 = 0;
	int frequency6 = 0; 

	
	for (int roll = 1; roll <= 60_000_000; roll++){

	switch (face){
case 1 : 
	++frequency1;
	break; 

case 2: 
	++frequency2;
	break;

case 3: 
	++frequency3;
	break;

case 4: 
	++frequency4;
	break;

case 5: 
	++frequency5;
	break;

case 6: 
	++frequency6;
	break;
	}
}
	System.out.println("face");
	System.out.println(+ frequency1, + frequency2, + frequency3, + frequency4, + frequency5, + frequency6);	

	}
}