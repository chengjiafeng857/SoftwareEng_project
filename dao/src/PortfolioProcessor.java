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
public class PortfolioProcessor {
	private int PortfolioId;
	
	private double totalInvestment;
	
	private double totalEarning;
	
	private String action="";
	
	public void setPortfolioId(int value) {
		this.PortfolioId = value;
	}
	
	public int getPortfolioId() {
		return PortfolioId;
	}
	
	public void setTotalInvestment(double value) {
		this.totalInvestment = value;
	}
	
	public double getTotalInvestment() {
		return totalInvestment;
	}
	
	public void setTotalEarning(double value) {
		this.totalEarning = value;
	}
	
	public double getTotalEarning() {
		return totalEarning;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int user_useruserId;
	
	public void setUser_useruserId(int value) {
		this.user_useruserId = value;
	}
	
	public int getUser_useruserId() {
		return user_useruserId;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Portfolio _portfolio = PortfolioDAO.loadPortfolioByORMID(getPortfolioId());
				if (_portfolio!= null) {
					copyFromBean(_portfolio);
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
				Portfolio _portfolio = PortfolioDAO.createPortfolio();
				copyToBean(_portfolio);
				if (PortfolioDAO.save(_portfolio)) {
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
				Portfolio _portfolio= PortfolioDAO.loadPortfolioByORMID(getPortfolioId());
				if (_portfolio != null) {
					copyToBean(_portfolio);
					if (PortfolioDAO.save(_portfolio)) {
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
				Portfolio _portfolio = PortfolioDAO.loadPortfolioByORMID(getPortfolioId());
				if (_portfolio != null && PortfolioDAO.deleteAndDissociate(_portfolio)) {
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
	
	private void copyFromBean(Portfolio _portfolio) {
		setTotalInvestment(_portfolio.getTotalInvestment());
		setTotalEarning(_portfolio.getTotalEarning());
		setPortfolioId(_portfolio.getORMID());
		
		{
			User _user = _portfolio.getUser();
			if (_user != null) {
				setUser_useruserId(_user.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Portfolio _portfolio) {
		_portfolio.setTotalInvestment(getTotalInvestment());
		_portfolio.setTotalEarning(getTotalEarning());
		try  {
			User _user = UserDAO.loadUserByORMID(getUser_useruserId());
			_portfolio.setUser(_user);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

