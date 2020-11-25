package M1SIR.Projet_AGL;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
Calculator calculator;
 
 @Before
 public void initialise()throws Exception {
	 calculator = new Calculator();
 }
	@Test
	public void testSum() {
		int result = calculator.sum(3, 2);
		if (result != 5) {   
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Assert.assertEquals(10, calculator.minus(12, 2));
	}
	
	//Si on essaie par exmple de mettre une valeur incorrecte 
	//Et dans ce cas ci dessous on obtient un erreur 
	/*@Test
	public void testMinus() {
		Assert.assertEquals(2, calculator.minus(12, 2));
	}*/

	@Test
	public void testDivide() {
		try {
			Assert.assertEquals(2, calculator.divide(6, 3));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testMltiply() {
		Assert.assertEquals(12, calculator.multiply(2, 6));
	}
	
	@Test
	public void testMin() {
		int result = calculator.min(10, 30);
		if (result != 10) {  
			Assert.fail();
		}
		
	}
	
	@Test
	public void testMax() {
		int result = calculator.max(10, 30);
		if (result != 30) {   
			Assert.fail();
		}
	
	}	
	
}