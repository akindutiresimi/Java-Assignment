import java.util.Scanner;

import java.util.Arrays;

public class ReverseAnArray{

    public static int[] reverse(int[] number){

    for (int count = 0; count < number.length / 2; count++){
        
     int temp = number[count];
     number[count] = number[number.length - 1 - count];
    
    number[number.length - 1 - count] = temp;   
    
    }
    return number;


}






public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number array range:");
int range = input.nextInt();

int[] number = new int[range];

System.out.print("number");

System.out.print(Arrays.toString(reverse(number)));

}


}
