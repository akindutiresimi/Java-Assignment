public class StatisticsCalculator{




	public static int calculateRangeOf(int[] numbers){
	
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

	}


	public static int findLargestNumberIn(int[] numbers){
		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}

	public static int findSmallestNumberIn(int[] numbers){
		int smallest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] < smallest)
				smallest = numbers[index];
		}
		return smallest;
	}



    public static int calculateMeanOf(int[] numbers){

    int total = 0;
    for(int count = 0; count < numbers.length; count++){
    total = total + numbers[count];  
    }   
    int mean = total / 7;  
    return mean;

    }





    public static int calculateMedianOf(int[] numbers){
    int median = 0;
    int temp = 0;
    for(int count = 0; count < numbers.length; count++){
        for(int value = 0; value < numbers.length; value++){
            if(numbers[count] > numbers[value]){
                temp = numbers[count];
                numbers[count] = numbers[value];
                numbers[value] = temp;
                median = numbers[3];
    
            }
        }
    }
    return median;
    }




    public static int calculateModeOf(int[] numbers){
    
    int mode = 0;
  
    for(int count = 0; count < numbers.length; count++){
        for(int value = 0; value < numbers.length; value++){
            if(numbers[count] == numbers[value]){
               mode = numbers[count];           
            }
        }
    }
    return mode;
    }



    
    public static int calculateDeviationOf(int[] numbers){
    int total = 0;
    int deviation = 0;
    for(int count = 0; count < numbers.length; count++){
    total = numbers[count] - calculateMeanOf(numbers);
    deviation = total + deviation;
    }
    
    return deviation;
    }




    public static int calculateMeanDeviationOf(int [] numbers){
    int total = 0;
    int deviation = 0;
    int meanDeviation = 0;
    for(int count = 0; count < numbers.length; count++){
    total = numbers[count] - calculateMeanOf(numbers);
    deviation = total + deviation;
    meanDeviation = deviation / 7;
    
    }
    return meanDeviation;
    }


    public static double calculateVarianceOf(double [] numbers){
   
    double total = 0;
    double mean = 0; 
    double variance = 0;
    double newTotal = 0;
    double newVariance = 0;
    for(int count = 0; count < numbers.length; count++){
    total = total + numbers[count];
    }
    mean = total / 7;
    
    for(int value = 0; value < numbers.length; value++){
    variance = numbers[value] - mean;
    newTotal = variance + newTotal;
    }
    newVariance = newTotal / 7;
    return newVariance;
    }

}
