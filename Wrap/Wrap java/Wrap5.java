import java.util.Scanner;
public class Wrap5{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    //System.out.print("Enter a number");
    //int number = input.nextInt():

    int number = 153;
    int number1;
    int number2;
    int number3;

    number1 = number % 1;
    number2 = (number / 10) % 10;
    number3 = (number / 100) % 10;

    int number11 = number1 * number1 * number1;
    int number22 = number2 * number2 * number2;
    int number33 = number3 * number3 * number3;

    int armstrong = number11 + number22 + number33;

    if(armstrong == number){

    System.out.println("It is an armstrong number");
    } 

    else{

       System.out.println("It is not an amrstrong number");    
    }
    }

}
