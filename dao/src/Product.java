/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
public class Product {
	public Product() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Product))
			return false;
		Product product = (Product)aObj;
		if ((getProductId() != null && !getProductId().equals(product.getProductId())) || (getProductId() == null && product.getProductId() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getProductId() == null ? 0 : getProductId().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRODUCT_EXCHANGE) {
			this.exchange = (Exchange) owner;
		}
		
		else if (key == ORMConstants.KEY_PRODUCT_ORDER) {
			this.order = (Order) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	protected String productId;
	
	private Exchange exchange;
	
	protected String productName;
	
	protected double interestRate;
	
	protected int riskLevel;
	
	private Order order;
	
	public void setProductId(String value) {
		this.productId = value;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public String getORMID() {
		return getProductId();
	}
	
	public void setProductName(String value) {
		this.productName = value;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setInterestRate(double value) {
		this.interestRate = value;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setRiskLevel(int value) {
		this.riskLevel = value;
	}
	
	public int getRiskLevel() {
		return riskLevel;
	}
	
	public void setExchange(Exchange value) {
		if (exchange != null) {
			exchange.product.remove(this);
		}
		if (value != null) {
			value.product.add(this);
		}
	}
	
	public Exchange getExchange() {
		return exchange;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Exchange(Exchange value) {
		this.exchange = value;
	}
	
	private Exchange getORM_Exchange() {
		return exchange;
	}
	
	public void setOrder(Order value) {
		if (this.order != value) {
			Order lorder = this.order;
			this.order = value;
			if (value != null) {
				order.setProduct(this);
			}
			if (lorder != null && lorder.getProduct() == this) {
				lorder.setProduct(null);
			}
		}
	}
	
	public Order getOrder() {
		return order;
	}
	
	protected string exchangeId;
	
	public void getProductDescription() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getProductId());
	}
	
}
