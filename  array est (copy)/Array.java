import java.util.Arrays;
public class Array{

    public static int[] arraySum(int[] number){

    //int[] numbers = new int[number.length]
    
    int result = (number.length + 1) / 2;
    int[] numbers = new int[result];

     int counter = 0;

    for(int count = 0; count < number.length; count+=2){

        if(count + 1 < number.length){

            numbers[counter] = number[count] + number[count + 1];
        }

        else{
            
            numbers[counter] = number[count];         
        }
       
        counter++;
     }
    
    return numbers;
    }



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


}
