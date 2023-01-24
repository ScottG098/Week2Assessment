import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Jan 23, 2023
 */
public class TestShippingLogic {
	
	Product product1 = new Product("Tires",167.99,22.0);
	Product product2 = new Product("Headlight",19.99,3.0);
	ShippingAndTaxLogic shipTaxL = new ShippingAndTaxLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testShippingLogic() {
		double shipCost = shipTaxL.findShippingCost(product1);
		assertEquals(29.7,shipCost,1.0);
	}
	
	@Test
	public void testFreeShippingLogic1() {
		boolean freeShip = shipTaxL.freeShippingCheck(product1);
		assertTrue(freeShip);
	}
	
	@Test
	public void testFreeShippingLogic2() {
		boolean freeShip = shipTaxL.freeShippingCheck(product2);
		assertFalse(freeShip);
	}

}
