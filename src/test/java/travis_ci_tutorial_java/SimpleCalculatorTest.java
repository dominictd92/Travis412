package travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {
	
	public SimpleCalculator calc; 
	
	@Before
	public void init() { 
		calc = new SimpleCalculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.add(2000, 3000), 5000);
		assertEquals(calc.add(-100, 100), 0);
	}
	
	@Test
	public void testSubtract() {
		assertEquals(calc.subtract(5, 3), 2);
		assertEquals(calc.subtract(0, 10), -10);
		assertEquals(calc.subtract(5000, 232), 4768);
	}
	
	@Test
	public void testMultiply() { 
		assertEquals(calc.multiply(10, 10), 100);
		assertEquals(calc.multiply(0, 5), 0);
		assertEquals(calc.multiply(5, 0), 0); 
	}
	
	@Test 
	public void testDivide() {
		assertEquals(calc.divide(10, 0), -1);
		assertEquals(calc.divide(0, 10), 0);
		assertEquals(calc.divide(10, 2), 5);
	}
}
