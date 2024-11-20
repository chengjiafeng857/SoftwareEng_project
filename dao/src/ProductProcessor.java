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
public class ProductProcessor {
	private String productId;
	
	private String productName;
	
	private double interestRate;
	
	private int riskLevel;
	
	private String action="";
	
	public void setProductId(String value) {
		this.productId = value;
	}
	
	public String getProductId() {
		return productId == null ? "" : productId;
	}
	
	public void setProductName(String value) {
		this.productName = value;
	}
	
	public String getProductName() {
		return productName == null ? "" : productName;
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
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private String exchange_exchangeexchangeId;
	
	public void setExchange_exchangeexchangeId(String value) {
		this.exchange_exchangeexchangeId = value;
	}
	
	public String getExchange_exchangeexchangeId() {
		return exchange_exchangeexchangeId == null ? "" : exchange_exchangeexchangeId;
	}
	
	private String order_orderorderId;
	
	public void setOrder_orderorderId(String value) {
		this.order_orderorderId = value;
	}
	
	public String getOrder_orderorderId() {
		return order_orderorderId == null ? "" : order_orderorderId;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Product _product = ProductDAO.loadProductByORMID(getProductId());
				if (_product!= null) {
					copyFromBean(_product);
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
				Product _product = ProductDAO.createProduct();
				copyToBean(_product);
				if (ProductDAO.save(_product)) {
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
				Product _product= ProductDAO.loadProductByORMID(getProductId());
				if (_product != null) {
					copyToBean(_product);
					if (ProductDAO.save(_product)) {
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
				Product _product = ProductDAO.loadProductByORMID(getProductId());
				if (_product != null && ProductDAO.deleteAndDissociate(_product)) {
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
	
	private void copyFromBean(Product _product) {
		setProductName(_product.getProductName());
		setInterestRate(_product.getInterestRate());
		setRiskLevel(_product.getRiskLevel());
		setProductId(_product.getProductId());
		
		{
			Exchange _exchange = _product.getExchange();
			if (_exchange != null) {
				setExchange_exchangeexchangeId(_exchange.getExchangeId());
			}
		}
		
		
		{
			Order _order = _product.getOrder();
			if (_order != null) {
				setOrder_orderorderId(_order.getOrderId());
			}
		}
		
	}
	
	private void copyToBean(Product _product) {
		_product.setProductId(getProductId());
		_product.setProductName(getProductName());
		_product.setInterestRate(getInterestRate());
		_product.setRiskLevel(getRiskLevel());
		try  {
			Exchange _exchange = ExchangeDAO.loadExchangeByORMID(getExchange_exchangeexchangeId());
			_product.setExchange(_exchange);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Order _order = OrderDAO.loadOrderByORMID(getOrder_orderorderId());
			_product.setOrder(_order);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

