public class ArrayKata{
    
    public static int MaximumIn(int [] number){
    int largestNumber = number[0];
    for (int count = 0; count < number.length; count++){
        if(largestNumber < number[count]){
            largestNumber = number[count];
           }   
           } 
        return largestNumber;      
    }







    public static int MinimumIn(int[] number){
    int SmallestNumber = number[0];    
    for(int count = 0; count < number.length; count++){
        if(SmallestNumber > number[count]){
        SmallestNumber = number[count];
        }
    }
    return SmallestNumber;
    }







    public static int sumOf(int[] number){
    int sum = 0;
    for(int count = 0; count < number.length; count++){
        sum = sum + number[count];
    }
    return sum;
    }







    public static int EvenNumbersIn(int[] number){
    int sumEven = 0;
    for(int count = 0; count < number.length; count++){
        if(number[count] % 2 == 0){
           sumEven = sumEven + number[count];
        }
    }
    return sumEven;
    }






    public static int OddNumbersIn(int[] number){
    int sumOdd = 0;
    for(int count = 0; count < number.length; count++){
        if(number[count] % 2 != 0){
           sumOdd= sumOdd + number[count];
        }
    }
    return sumOdd;
    }
    





    public static int maximumAndMinimum(int[] number){
    int largest = number[0];
    int smallest = number[0];
    for(int count = 0; count < number.length; count++){
        if(largest < number[count]){
        largest = number[count];
        }
     
        if(smallest > number[count]){
        smallest = number[count];
        }
        return smallest;
       
   }
   return largest;
   //return smallest;
   }






    public static int noOfOddNumberIn(int[] number){
    int OddNumberCount = 0;
    for(int count = 0; count < number.length; count++){
        if(number[count] % 2 != 0){
        OddNumberCount++;
        }
    }
    return OddNumberCount;
    } 






    public static int noOfEvenNumberIn(int[] number){
    int EvenNumberCount = 0;
    for(int count = 0; count < number.length; count++){
        if(number[count] % 2 == 0){
        EvenNumberCount++;
        }
    }
    return EvenNumberCount;
    }


 

   
    public static int[] evenNumbersIn(int[] number){
    int[] listEven = new int[number.length];
    int Even = 0;
    for(int count = 0; count < number.length; count++){
        if(number[count] % 2 == 0){
            listEven[Even++] = number[count];
        }
    
    }
    return listEven;
    }





    public static int[] oddNumbersIn(int[] number){
    int[] listOdd = new int[number.length];
    int Odd = 0;
    for(int count = 0; count < number.length; count++){
        if(number[count] % 2 != 0){
            listOdd[Odd++] = number[count];
        }
    
    }
    return listOdd;
    }




    public static void main(String[] args){


    /*int[] largestNumber = {34, 56, 65, 90, 23};
    System.out.println(("largestNumber is:") +  MaximumIn(largestNumber));
    }
    



    int[] SmallestNumber = {34,56, 23, 12, 4};
    System.out.println(("smallestNumber is:") + MinimumIn(SmallestNumber));
    }




    int[] sum = {23,4,5,6,8,4};
    System.out.println(("sum is:") + sumOf(sum));
    }




    int[] sumEven = {23,20,12,3,9,4};
    System.out.println(("sumEven is:") + EvenNumbersIn(sumEven));
    }



    int[] sumOdd = {23,20,12,3,9,4};
    System.out.println(("sumEven is:") + OddNumbersIn(sumOdd));
    }



    int[] largest = {23,20,12,3,9,4};
    int[] smallest = {23,20,12,3,9,4};
    System.out.println(("largest is:") + maximumAndMinimum(largest));
    System.out.println(("smallest is:") + maximumAndMinimum(smallest));
    }




    int[] OddNumberCount = {3,4,7,12,13,5};
    System.out.println(("OddNumberCount is:") + noOfOddNumberIn(OddNumberCount));
    }



    int[] EvenNumberCount = {3,4,7,12,13,5};
    System.out.println(("EvenNumberCount is:") + noOfEvenNumberIn(EvenNumberCount));
    }

 
 
 
    int[] listEven = {4,10,12,5,9,5};
    int[] result = evenNumbersIn(listEven);
    for(int count = 0; count < result.length; count++){
        System.out.println(result[count]);
    }
    }*/




    int[] listOdd = {4,10,12,5,9,5};
    int[] result = oddNumbersIn(listOdd);
    for(int count = 0; count < result.length; count++){
        System.out.println(result[count]);
    }
    }

}

