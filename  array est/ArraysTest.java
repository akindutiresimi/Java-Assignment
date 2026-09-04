import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArraysTest {

    @Test
    public void testThatTheSetOfArrayWhenEvenIsOneAndWhenOddIsZero(){

    int[] number = {3,5,2,8,1,5};

    int[] expected = Arrays.oddEven(number);

    int[] actual = {0,0,1,1,0,0};

    assertArrayEquals(expected,actual);

    }


    @Test
    public void testThatTheSetOfArrayWhenEvenIsFalseAndWhenOddIsTrue(){

    int[] number = {3,5,2,8,1,5};

    boolean[] expected = Arrays.oddEvens(number);

    boolean[] actual = {true,true,false,false,true,true};

    assertArrayEquals(expected,actual);

    }
}
