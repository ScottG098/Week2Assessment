

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Jan 23, 2023
 */
public class ShippingAndTaxLogic {
	
	final double shipCostPerLB = 1.35;
	final double taxPerDollar = 0.06;
	
	public double findShippingCost(Product product) {
		double shippingCost = 0;
		shippingCost = product.getProductWeight() * shipCostPerLB;
		return shippingCost;
	}
	
	public double findTaxCost(Product product) {
		double taxCost = 0;
		taxCost = product.getProductPrice() * taxPerDollar;
		return taxCost;
	}
	
	public double findTotalCost(Product product) {
		double totalCost = 0;
		totalCost = product.getProductPrice() + findTaxCost(product) + findShippingCost(product);
		return totalCost;
	}
	
	public Boolean freeShippingCheck(Product product) {
		Boolean freeShipping = false;
		if (product.getProductPrice() > 150) {
			freeShipping = true;
		} else {
			freeShipping = false;
		}
		
		return freeShipping;
	}

}
