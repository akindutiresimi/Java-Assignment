import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class StatisticsCalculatorTest{
	
	@Test
	public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

	//Given
	int [] numbers = {3, 5, 7,1, 25, 11, 0};

	//When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

	int largest = StatisticsCalculator.findLargestNumberIn(numbers);
	int actualRange = 25;

	//Check
	assertEquals(actualRange, expectedRange);
    }



    @Test 
    public void testThatIHaveAnArrayOfNumbersTheMeanIsCorrect(){
    

    int [] numbers = {3, 5, 7,1, 25, 11, 0};

    int expectedMean = StatisticsCalculator.calculateMeanOf(numbers);
    
    int Mean = StatisticsCalculator.calculateMeanOf(numbers);

    int actualMean = 7;

    assertEquals(actualMean, expectedMean);

    }


    @Test
    public void testThatIHaveAnArrayOfNumbersTheMedianIsCorrect(){
    int [] numbers = {3, 5, 7,1, 25, 11, 0};

    int expectedMedian = StatisticsCalculator.calculateMedianOf(numbers);

    int Median = StatisticsCalculator.calculateMedianOf(numbers);

    int actualMedian = 5;

    assertEquals(actualMedian, expectedMedian);
    }



    @Test
    public void testThatIHaveAnArrayOfNumbersTheModeIsCorrect(){
    int [] numbers = {3, 5, 7,1, 5, 11, 5};

    int expectedMode = StatisticsCalculator.calculateModeOf(numbers);

    int Mode = StatisticsCalculator.calculateModeOf(numbers);

    int actualMode = 5;

    assertEquals(actualMode, expectedMode);
    }




    @Test
    public void testThatIHaveAnArrayOfNumbersTheDeviationIsCorrect(){
    
    int [] numbers = {3, 5, 7,1, 25, 11, 0};

    int expectedDeviation = StatisticsCalculator.calculateDeviationOf(numbers);

    int Deviation = StatisticsCalculator.calculateDeviationOf(numbers);

    int actualDeviation = 3;    

    assertEquals(actualDeviation, expectedDeviation);

    }


    @Test
    public void testThatIHaveAnArrayOfNumbersTheMeanDeviationIsCorrect(){
    
    int [] numbers = {3, 5, 7,1, 25, 11, 0};

    int expectedMeanDeviation = StatisticsCalculator.calculateMeanDeviationOf(numbers);

    int MeanDeviation = StatisticsCalculator.calculateMeanDeviationOf(numbers);

    int actualMeanDeviation = 0;

    assertEquals(actualMeanDeviation, expectedMeanDeviation);
    }


    @Test
    public void testThatIHaveAnArrayOfNumbersTheVarianceIsCorrect(){
    
    double [] numbers = {3, 15, 27,1, 25, 11, 34}; 

    double expectedVariance = StatisticsCalculator.calculateVarianceOf(numbers);

    double Variance = StatisticsCalculator.calculateVarianceOf(numbers);

    double actualVariance = 157.28;

    assertEquals(actualVariance, expectedVariance);

    }




}
