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
public class ExchangeProcessor {
	private String exchangeId;
	
	private String exchangeName;
	
	private String action="";
	
	public void setExchangeId(String value) {
		this.exchangeId = value;
	}
	
	public String getExchangeId() {
		return exchangeId == null ? "" : exchangeId;
	}
	
	public void setExchangeName(String value) {
		this.exchangeName = value;
	}
	
	public String getExchangeName() {
		return exchangeName == null ? "" : exchangeName;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Exchange _exchange = ExchangeDAO.loadExchangeByORMID(getExchangeId());
				if (_exchange!= null) {
					copyFromBean(_exchange);
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
				Exchange _exchange = ExchangeDAO.createExchange();
				copyToBean(_exchange);
				if (ExchangeDAO.save(_exchange)) {
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
				Exchange _exchange= ExchangeDAO.loadExchangeByORMID(getExchangeId());
				if (_exchange != null) {
					copyToBean(_exchange);
					if (ExchangeDAO.save(_exchange)) {
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
				Exchange _exchange = ExchangeDAO.loadExchangeByORMID(getExchangeId());
				if (_exchange != null && ExchangeDAO.deleteAndDissociate(_exchange)) {
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
	
	private void copyFromBean(Exchange _exchange) {
		setExchangeName(_exchange.getExchangeName());
		setExchangeId(_exchange.getExchangeId());
	}
	
	private void copyToBean(Exchange _exchange) {
		_exchange.setExchangeId(getExchangeId());
		_exchange.setExchangeName(getExchangeName());
	}
	
}

