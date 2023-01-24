import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Jan 23, 2023
 */
public class TestTaxLogic {
	
	Product product = new Product("Tires",167.99,22.0);
	ShippingAndTaxLogic shipTaxL = new ShippingAndTaxLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTaxLogic() {
		double taxCost = shipTaxL.findTaxCost(product);
		assertEquals(10.08,taxCost,1.0);
	}

}