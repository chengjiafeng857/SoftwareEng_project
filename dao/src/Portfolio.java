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
public class Portfolio {
	public Portfolio() {
	}
	
	private int PortfolioId;
	
	private double totalInvestment;
	
	private double totalEarning;
	
	private User user;
	
	private void setPortfolioId(int value) {
		this.PortfolioId = value;
	}
	
	public int getPortfolioId() {
		return PortfolioId;
	}
	
	public int getORMID() {
		return getPortfolioId();
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
	
	public void setUser(User value) {
		if (this.user != value) {
			User luser = this.user;
			this.user = value;
			if (value != null) {
				user.setPortfolio(this);
			}
			if (luser != null && luser.getPortfolio() == this) {
				luser.setPortfolio(null);
			}
		}
	}
	
	public User getUser() {
		return user;
	}
	
	public void calTotalInvestment() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void calTotalEarning() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getPortfolioId());
	}
	
}
