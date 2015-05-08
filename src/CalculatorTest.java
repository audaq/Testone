import org.junit.*;


/**
 * 
 */

/**
 * @author liujian
 *
 */


	/**
	 * @throws java.lang.Exception
	 */	
	public class CalculatorTest{
		public void testADD(){
		Calculator calculator = new Calculator();
		double result = calculator.add(10,20);
		assertEquals(50, result, 0);
		}
	}


