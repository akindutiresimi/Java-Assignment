
public class Palindrom{
public static void main(String[] args){

int number = 23452;
int numberOne = 0;
int numberTwo = 0;
int numberThree = 0;
int numberFour = 0;
int numberFive = 0;

numberOne = number % 10 ;
numberTwo = (number / 10) % 10;
numberThree = (number / 100) % 10;
numberFour = (number / 1000) % 10;
numberFive = (number / 10000) % 10;
 if(numberOne == numberFive && numberTwo == numberFour){
	System.out.println("palindrom");
}
else{
	System.out.println("not a palindrom");
}

}
}