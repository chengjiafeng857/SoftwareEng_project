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
public class User {
	public User() {
	}
	
	protected int userId;
	
	protected String name;
	
	protected java.util.Date birthDate;
	
	protected int risklevel;
	
	private Portfolio portfolio;
	
	private void setUserId(int value) {
		this.userId = value;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getORMID() {
		return getUserId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
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
	
	public void setPortfolio(Portfolio value) {
		if (this.portfolio != value) {
			Portfolio lportfolio = this.portfolio;
			this.portfolio = value;
			if (value != null) {
				portfolio.setUser(this);
			}
			if (lportfolio != null && lportfolio.getUser() == this) {
				lportfolio.setUser(null);
			}
		}
	}
	
	public Portfolio getPortfolio() {
		return portfolio;
	}
	
	protected int PortfolioId;
	
	public void addOrder() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void setUserId(String userId) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void getAttribute() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void setAttribute(int attribute) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getUserId());
	}
	
}
