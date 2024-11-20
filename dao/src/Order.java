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
public class Order {
	public Order() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Order))
			return false;
		Order order = (Order)aObj;
		if ((getOrderId() != null && !getOrderId().equals(order.getOrderId())) || (getOrderId() == null && order.getOrderId() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getOrderId() == null ? 0 : getOrderId().hashCode());
		return hashcode;
	}
	
	protected String orderId;
	
	protected java.util.Date oderDate;
	
	protected double amount;
	
	private Product product;
	
	protected int orderState;
	
	public void setOrderId(String value) {
		this.orderId = value;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public String getORMID() {
		return getOrderId();
	}
	
	public void setOderDate(java.util.Date value) {
		this.oderDate = value;
	}
	
	public java.util.Date getOderDate() {
		return oderDate;
	}
	
	public void setAmount(double value) {
		this.amount = value;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setOrderState(int value) {
		this.orderState = value;
	}
	
	public int getOrderState() {
		return orderState;
	}
	
	public void setProduct(Product value) {
		if (this.product != value) {
			Product lproduct = this.product;
			this.product = value;
			if (value != null) {
				product.setOrder(this);
			}
			if (lproduct != null && lproduct.getOrder() == this) {
				lproduct.setOrder(null);
			}
		}
	}
	
	public Product getProduct() {
		return product;
	}
	
	protected string productId;
	
	protected string userId;
	
	public void executeOrder() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void getOrderDetail() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getOrderId());
	}
	
}
