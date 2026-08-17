import java.util.Scanner;
public class Marray{

    public static void main(String[] args){

    double[] myList = new double[5];
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number:" + myList.length);
    for(int count = 0; count < myList.length; count++){
    myList[count] = input.nextDouble();
    }
    for (int count = 0; count < myList.length; count++){

    System.out.println(myList[count]);
    } 
    }
}




import java.util.Scanner;
public class Marray{

    public static int[] Array(int numbers){
    int[] myList = new int[5];
   
    for(int count = 0; count < myList.length; count++){
        myList[count] = input.nextInt();
    }
    for(int count= 0; count <  myList.length; count++){
    return myList[count];

    }
    }


public static void main(String[] args){
int number = 23,34,65,7,86,23;
System.out.println(Array(number));



}
}

