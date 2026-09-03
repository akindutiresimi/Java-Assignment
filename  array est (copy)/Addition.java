import java.util.Arrays;
public class Addition{

    public static int[] array(int[] number){

    int result = (number.length - 1);

    int[] numbers = new int[result];

    int counter = 0;

    for(int count = 0; count < number.length; count++){

        if(count + 1 < number.length){

        numbers[counter] = number[count + 1] + number[count];
        }
       counter++;
    }
    return numbers;
    }



    public static void main(String[] args){

    int[] numbers = {1,2,3,4,5,6,7};

    System.out.println(Arrays.toString(array(numbers)));

    }
}
