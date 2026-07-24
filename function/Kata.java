import java.util.Scanner;

public class Kata{
    
    public static boolean isEven(int number){
        if(number % 2 ==0){
        return true;
        }
        return false;
        }

  
    public static boolean isPrimeNumber(int number){
    for (int count = 2; count < number; count++)
        if (number % count == 0){
            return false;
            }
            return true;   
    }


    public static int subtract(int numberOne, int numberTwo){
    
    int sub = numberOne - numberTwo;
        if (sub < 0){
           sub = sub * -1;
        }
        return sub;
    }


    public static float divide(int numberOne, int numberTwo){
    float quotient = numberOne / numberTwo;
        return quotient;
    }

      

    public static int factor(int number){
    int BodyCount = 0;
    for (int count = 1; count <= number; count++)
        if(number % count == 0){
        BodyCount++; 
        }  
       return BodyCount;
    }


    public static boolean isSquare(double number){
    double root = Math.sqrt(number);
    if (root * root == number){
        return true;
        }
        return false;
    }


    public static boolean isPalindrome(int number){
    int numberOne = number % 10;
    int numbersTwo = number / 10;
    int numberTwo = numbersTwo % 10;
    int numbersThree = number / 100;
    int numberThree = numbersThree % 10;
    int numbersFour = number / 1000;
    int numberFour = numbersFour % 10;
    int numbersFive = number / 10000;
    int numberFive = numbersFive % 10;
    if(numberOne == numberFive && numberTwo == numberFour){
        return true;
    }    
        return false;
    }



    public static long factorialOf(long number){
    long product = 1;
    for (long count = 1; count <= number; count++){
    product = product * count;  
    }
    return product;
    }



    public static long squareOf(long number){
    long sum = number * number;
    return sum;
    }






    

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number");
    int number = input.nextInt();

    System.out.println("number is:" + isEven(number));

    

    //public static void main(String[] args){
    //Scanner samuel = new Scanner(System.in);

    System.out.print("Enter integer");
    int prime = input.nextInt();
    System.out.println("number is:" + isPrimeNumber(prime));



    System.out.print("Enter numberOne");
    int numberOne = input.nextInt();
    System.out.print("Enter numberTwo");
    int numberTwo = input.nextInt();
    System.out.println("Number is" + subtract(numberOne, numberTwo));


    System.out.print("Enter numberOne");
    int numberOne = input.nextInt();
    System.out.print("Enter numberTwo");
    int numberTwo = input.nextInt();
    System.out.println("number is:" + divide(numberOne, numberTwo));


    System.out.print("Enter number");
    int number = input.nextInt();
    System.out.print("number is:" + factor(number));


    System.out.print("Enter number");
    double number = input.nextInt();
    System.out.println("number is:" +isSquare(number));


    System.out.print("Enter number");
    int number = input.nextInt();
    System.out.println("number is:" + isPalindrome(number));


    System.out.print("Enter number");
    long number = input.nextLong();
    System.out.println("number is:" + factorialOf(number));


    System.out.print("Enter number");
    long number = input.nextLong();
    System.out.println("number is:" +squareOf(number));

    }
}
