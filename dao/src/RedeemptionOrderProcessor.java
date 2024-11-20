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
public class RedeemptionOrderProcessor {
	private String orderId;
	
	private java.util.Date oderDate;
	
	private double amount;
	
	private int orderState;
	
	private String redeemCardNum;
	
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
	
	public void setRedeemCardNum(String value) {
		this.redeemCardNum = value;
	}
	
	public String getRedeemCardNum() {
		return redeemCardNum == null ? "" : redeemCardNum;
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
				RedeemptionOrder _redeemptionOrder = RedeemptionOrderDAO.loadRedeemptionOrderByORMID(getOrderId());
				if (_redeemptionOrder!= null) {
					copyFromBean(_redeemptionOrder);
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
				RedeemptionOrder _redeemptionOrder = RedeemptionOrderDAO.createRedeemptionOrder();
				copyToBean(_redeemptionOrder);
				if (RedeemptionOrderDAO.save(_redeemptionOrder)) {
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
				RedeemptionOrder _redeemptionOrder= RedeemptionOrderDAO.loadRedeemptionOrderByORMID(getOrderId());
				if (_redeemptionOrder != null) {
					copyToBean(_redeemptionOrder);
					if (RedeemptionOrderDAO.save(_redeemptionOrder)) {
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
				RedeemptionOrder _redeemptionOrder = RedeemptionOrderDAO.loadRedeemptionOrderByORMID(getOrderId());
				if (_redeemptionOrder != null && RedeemptionOrderDAO.delete(_redeemptionOrder)) {
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
	
	private void copyFromBean(RedeemptionOrder _redeemptionOrder) {
		setOderDate(_redeemptionOrder.getOderDate());
		setAmount(_redeemptionOrder.getAmount());
		setOrderState(_redeemptionOrder.getOrderState());
		setRedeemCardNum(_redeemptionOrder.getRedeemCardNum());
		setOrderId(_redeemptionOrder.getOrderId());
		
		{
			Product _product = _redeemptionOrder.getProduct();
			if (_product != null) {
				setProduct_productproductId(_product.getProductId());
			}
		}
		
	}
	
	private void copyToBean(RedeemptionOrder _redeemptionOrder) {
		_redeemptionOrder.setOrderId(getOrderId());
		_redeemptionOrder.setOderDate(getOderDate());
		_redeemptionOrder.setAmount(getAmount());
		_redeemptionOrder.setOrderState(getOrderState());
		_redeemptionOrder.setRedeemCardNum(getRedeemCardNum());
		try  {
			Product _product = ProductDAO.loadProductByORMID(getProduct_productproductId());
			_redeemptionOrder.setProduct(_product);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

