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
import org.orm.PersistentException;
public class SubscriptionOrderProcessor {
	private String orderId;
	
	private java.util.Date oderDate;
	
	private double amount;
	
	private int orderState;
	
	private String paymentCardNum;
	
	private String action="";
	
	public void setOrderId(String value) {
		this.orderId = value;
	}
	
	public String getOrderId() {
		return orderId == null ? "" : orderId;
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
	
	public void setPaymentCardNum(String value) {
		this.paymentCardNum = value;
	}
	
	public String getPaymentCardNum() {
		return paymentCardNum == null ? "" : paymentCardNum;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private String product_productproductId;
	
	public void setProduct_productproductId(String value) {
		this.product_productproductId = value;
	}
	
	public String getProduct_productproductId() {
		return product_productproductId == null ? "" : product_productproductId;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				SubscriptionOrder _subscriptionOrder = SubscriptionOrderDAO.loadSubscriptionOrderByORMID(getOrderId());
				if (_subscriptionOrder!= null) {
					copyFromBean(_subscriptionOrder);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				SubscriptionOrder _subscriptionOrder = SubscriptionOrderDAO.createSubscriptionOrder();
				copyToBean(_subscriptionOrder);
				if (SubscriptionOrderDAO.save(_subscriptionOrder)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				SubscriptionOrder _subscriptionOrder= SubscriptionOrderDAO.loadSubscriptionOrderByORMID(getOrderId());
				if (_subscriptionOrder != null) {
					copyToBean(_subscriptionOrder);
					if (SubscriptionOrderDAO.save(_subscriptionOrder)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				SubscriptionOrder _subscriptionOrder = SubscriptionOrderDAO.loadSubscriptionOrderByORMID(getOrderId());
				if (_subscriptionOrder != null && SubscriptionOrderDAO.delete(_subscriptionOrder)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(SubscriptionOrder _subscriptionOrder) {
		setOderDate(_subscriptionOrder.getOderDate());
		setAmount(_subscriptionOrder.getAmount());
		setOrderState(_subscriptionOrder.getOrderState());
		setPaymentCardNum(_subscriptionOrder.getPaymentCardNum());
		setOrderId(_subscriptionOrder.getOrderId());
		
		{
			Product _product = _subscriptionOrder.getProduct();
			if (_product != null) {
				setProduct_productproductId(_product.getProductId());
			}
		}
		
	}
	
	private void copyToBean(SubscriptionOrder _subscriptionOrder) {
		_subscriptionOrder.setOrderId(getOrderId());
		_subscriptionOrder.setOderDate(getOderDate());
		_subscriptionOrder.setAmount(getAmount());
		_subscriptionOrder.setOrderState(getOrderState());
		_subscriptionOrder.setPaymentCardNum(getPaymentCardNum());
		try  {
			Product _product = ProductDAO.loadProductByORMID(getProduct_productproductId());
			_subscriptionOrder.setProduct(_product);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

