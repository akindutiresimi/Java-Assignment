import java.util.Arrays;
public class Reverses{

    public static void main(String[] args){

    int[] number = {12,23,45,67,45,34,45,56,58,45}; 

    for (int count = 0; count < number.length / 2; count++){

        int temp = number[count];

        number[count] = number[number.length - 1 - count];

        number[number.length - 1 - count] = temp;

    }

    System.out.print(Arrays.toString(number));

    }

}
