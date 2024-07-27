package simple.simplemaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator;
	
@BeforeEach
public void setUp()
{
	calculator=new Calculator();
}
@AfterEach

	public void tearDown() {
	calculator=null;
	System.out.println("Test finished");
}

	
	@Test
	void testAdd() {
		int result= Calculator.add(2,3);
		assertEquals(5,result);
	}

	@Test
	void testSubtract() {
		int result =Calculator.subtract(5,3);
		assertEquals(2,result);
	}
	

}
