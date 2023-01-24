

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Jan 23, 2023
 */
public class Product {
	private String productName;
	private double productPriceDollars;
	private double productWeightLB;
	/**
	 * 
	 */
	public Product() {
		super();
	}
	/**
	 * @param productName
	 * @param productPrice
	 * @param productWeight
	 */
	public Product(String productName, double productPrice, double productWeight) {
		super();
		this.productName = productName;
		this.productPriceDollars = productPrice;
		this.productWeightLB = productWeight;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPriceDollars;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPriceDollars) {
		this.productPriceDollars = productPriceDollars;
	}
	/**
	 * @return the productWeight
	 */
	public double getProductWeight() {
		return productWeightLB;
	}
	/**
	 * @param productWeight the productWeight to set
	 */
	public void setProductWeight(double productWeightLB) {
		this.productWeightLB = productWeightLB;
	}
	
	

}
