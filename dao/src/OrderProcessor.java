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
public class OrderProcessor {
	private String orderId;
	
	private java.util.Date oderDate;
	
	private double amount;
	
	private int orderState;
	
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
				Order _order = OrderDAO.loadOrderByORMID(getOrderId());
				if (_order!= null) {
					copyFromBean(_order);
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
				Order _order = OrderDAO.createOrder();
				copyToBean(_order);
				if (OrderDAO.save(_order)) {
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
				Order _order= OrderDAO.loadOrderByORMID(getOrderId());
				if (_order != null) {
					copyToBean(_order);
					if (OrderDAO.save(_order)) {
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
				Order _order = OrderDAO.loadOrderByORMID(getOrderId());
				if (_order != null && OrderDAO.deleteAndDissociate(_order)) {
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
	
	private void copyFromBean(Order _order) {
		setOderDate(_order.getOderDate());
		setAmount(_order.getAmount());
		setOrderState(_order.getOrderState());
		setOrderId(_order.getOrderId());
		
		{
			Product _product = _order.getProduct();
			if (_product != null) {
				setProduct_productproductId(_product.getProductId());
			}
		}
		
	}
	
	private void copyToBean(Order _order) {
		_order.setOrderId(getOrderId());
		_order.setOderDate(getOderDate());
		_order.setAmount(getAmount());
		_order.setOrderState(getOrderState());
		try  {
			Product _product = ProductDAO.loadProductByORMID(getProduct_productproductId());
			_order.setProduct(_product);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

