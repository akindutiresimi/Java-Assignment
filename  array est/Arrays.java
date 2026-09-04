//import java.util.Arrays;
public class Arrays{

    public static int[] oddEven(int[] number){
    
    //int[] numbers = new int[6];

   for(int count = 0; count < number.length; count++){

        if(number[count] % 2 == 0){
    
            number[count] = 1;
        }
        else if(number[count] % 2 != 0){
            number[count] = 0;
        }
    }
    return number;
    }



   public static boolean[] oddEvens(int[] number){

   boolean[] numbers = new boolean[number.length];

   for(int count = 0; count < number.length; count++){

        if(number[count] % 2 == 0){
    
            numbers[count] = false;
         }
        
        else if(number[count] % 2 != 0){
            numbers[count] = true;
        }  

    }
    return numbers;
    }

}
