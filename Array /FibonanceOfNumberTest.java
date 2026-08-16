import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonanceOfNumberTest{

	@Test

	public void testTheNumberOfFibonanceThatWillBeThereInAGivenNumber(){

	int number = 7;

	int[] expectedRange = FibonanceOfNumber.fibonanceOfNumber(number);

	int[] actualRange = {0,1,1,2,3,5,8};

	assertEquals(actualRange, expectedRange);
	}
}
