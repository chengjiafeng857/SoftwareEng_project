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
public class UserProcessor {
	private int userId;
	
	private String name;
	
	private java.util.Date birthDate;
	
	private int risklevel;
	
	private String action="";
	
	public void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name == null ? "" : name;
	}
	
	public void setBirthDate(java.util.Date value) {
		this.birthDate = value;
	}
	
	public java.util.Date getBirthDate() {
		return birthDate;
	}
	
	public void setRisklevel(int value) {
		this.risklevel = value;
	}
	
	public int getRisklevel() {
		return risklevel;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int portfolio_portfolioPortfolioId;
	
	public void setPortfolio_portfolioPortfolioId(int value) {
		this.portfolio_portfolioPortfolioId = value;
	}
	
	public int getPortfolio_portfolioPortfolioId() {
		return portfolio_portfolioPortfolioId;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				User _user = UserDAO.loadUserByORMID(getUserId());
				if (_user!= null) {
					copyFromBean(_user);
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
				User _user = UserDAO.createUser();
				copyToBean(_user);
				if (UserDAO.save(_user)) {
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
				User _user= UserDAO.loadUserByORMID(getUserId());
				if (_user != null) {
					copyToBean(_user);
					if (UserDAO.save(_user)) {
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
				User _user = UserDAO.loadUserByORMID(getUserId());
				if (_user != null && UserDAO.deleteAndDissociate(_user)) {
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
	
	private void copyFromBean(User _user) {
		setName(_user.getName());
		setBirthDate(_user.getBirthDate());
		setRisklevel(_user.getRisklevel());
		setUserId(_user.getORMID());
		
		{
			Portfolio _portfolio = _user.getPortfolio();
			if (_portfolio != null) {
				setPortfolio_portfolioPortfolioId(_portfolio.getORMID());
			}
		}
		
	}
	
	private void copyToBean(User _user) {
		_user.setName(getName());
		_user.setBirthDate(getBirthDate());
		_user.setRisklevel(getRisklevel());
		try  {
			Portfolio _portfolio = PortfolioDAO.loadPortfolioByORMID(getPortfolio_portfolioPortfolioId());
			_user.setPortfolio(_portfolio);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

