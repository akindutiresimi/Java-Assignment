import java.util.Arrays;
public class User{

/*    public static int[] array(int[] number){

    for (int count = 0; count < number.length / 2; count++){

    int temp = number[count];

    number[count] = number[number.length - 1 - count];
    
    number[number.length - 1 - count] = temp;

    }
    return number;
    }*/


/*
    public static int target(int[] number){

    int mostNumber = 0;
    int num = 0;
    for(int count = 0; count < number.length; count++){

        int counter = 1;

        for(int index = count + 1; index < number.length; index++){

            if (number[count] == number[index]) {     
            
            counter++;
            }

        }
        
        if (counter > num) {
            num = counter;
            mostNumber = number[count];
        }  
    }

        return mostNumber;
      
}*/


    
    
/*
    public static int largest(int[] number){

   
    int max = number[0];

    for(int count = 0; count < number.length; count++){

        if(number[count] > max){
        
            max = number[count];
        }
    }
       return max;

    }*/



/*    public static int smallest(int[] number){

    int smallest = number[0];

    for(int count = 0; count < number.length; count++){

        if(number[count] < smallest){

            smallest = number[count];

        }


    }
    return smallest;

    }
*/


/*   public static int sumOfEvenIndex(int[] number){

    int sum = 0;

    for(int count = 0; count < number.length; count++){

        if(count % 2 == 0){

        sum += number[count];       

        }
    } 

    return sum;    

    }*/



/*    public static int total(int[] number){

    int total = 0;

    for(int count = 0; count < number.length; count++){
    
     total += number[count];
    
    }

    return total;

    }

*/

    public static int average(int[] number){

    int average = 0;

    int total  = 0;

    for(int count = 0; count < number.length; count++){
    
    total = total + number[count];

    average = total / number.length;

    }

    return average;

    }


/*
    public static void main (String[] args){

    int[] number = {34,56,78,98,59,70,45};

    System.out.print(Arrays.toString(array(number)));

    }
*/



/*
    public static void main (String[] args){
    
    int[] number = {3,4,6,4,7,4,4 , 7 , 7 , 7 , 7 , 7};

    System.out.println(target(number));

    }
*/

/*/*
    public static void main(String[] args){

    int[] number = {12, 23, 34, 16, 45, 67}; 

    System.out.println(largest(number));


    }
*/




/*    public static void main(String[] args){

    int[] number = {80, 23, 34, 16, 45, 67}; 

    System.out.println(smallest(number));

    }

*/

/*   public static void main(String[] args){

    int[] number = {23,4,6,14,24,15,24,39};

    System.out.println(sumOfEvenIndex(number));

    }
*/


 /*   public static void main(String[] args){

    int[] number = {23,45,12,36,27,20};

    System.out.println(total(number));

    }*/


    public static void main(String[] args){

    int[] number = {23,45,12,36,27,20};

    System.out.println(average(number));

    }

}
