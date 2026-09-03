import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayTest {

    @Test
    public void testThatTheSumOfTheFirstTwoIndex(){

    int[] number = {1,2,3,4,5,6};

    int[] expected = Array.arraySum(number);

    int[] actual = {3,7,11};

    assertArrayEquals(expected,actual);

    }


    @Test
    public void testThatTheSumOfTheFirstTwoIndexAndLeaveTheLastOddNumber(){

    int[] number = {1,2,3,4,5,6,7};

    int[] expected = Array.arraySum(number);

    int[] actual = {3,7,11,7};

    assertArrayEquals(expected,actual);

    }

    @Test
    public void testThatTheSumOfTheFirstNumberAddTheNumberSumOfTheSecondAddToTheThirdTillEndOfIndex(){

    int[] number = {1,2,3,4,5,6,7};

    int[] expected = Array.array(number);

    int[] actual = {3,5,7,9,11,13};

    assertArrayEquals(expected,actual);

    }

    
        @Test
    public void testThatTheSumOfTheFirstNumberAddTheNumberSumOfTheSecondAddToTheThirdTillEndOfIndexEvenWhenTheNumberAreChange(){

    int[] number = {1,2,3,4};

    int[] expected = Array.array(number);

    int[] actual = {3,5,7,};

    assertArrayEquals(expected,actual);

    }

}

