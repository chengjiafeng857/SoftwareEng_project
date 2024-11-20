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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Portfolio {
	public Portfolio() {
	}
	
	public static Portfolio loadPortfolioByORMID(int PortfolioId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadPortfolioByORMID(session, PortfolioId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio getPortfolioByORMID(int PortfolioId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getPortfolioByORMID(session, PortfolioId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio loadPortfolioByORMID(int PortfolioId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadPortfolioByORMID(session, PortfolioId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio getPortfolioByORMID(int PortfolioId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getPortfolioByORMID(session, PortfolioId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio loadPortfolioByORMID(PersistentSession session, int PortfolioId) throws PersistentException {
		try {
			return (Portfolio) session.load(Portfolio.class, Integer.valueOf(PortfolioId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio getPortfolioByORMID(PersistentSession session, int PortfolioId) throws PersistentException {
		try {
			return (Portfolio) session.get(Portfolio.class, Integer.valueOf(PortfolioId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio loadPortfolioByORMID(PersistentSession session, int PortfolioId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Portfolio) session.load(Portfolio.class, Integer.valueOf(PortfolioId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio getPortfolioByORMID(PersistentSession session, int PortfolioId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Portfolio) session.get(Portfolio.class, Integer.valueOf(PortfolioId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortfolio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryPortfolio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortfolio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryPortfolio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio[] listPortfolioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listPortfolioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio[] listPortfolioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listPortfolioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortfolio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Portfolio as Portfolio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPortfolio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Portfolio as Portfolio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Portfolio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio[] listPortfolioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPortfolio(session, condition, orderBy);
			return (Portfolio[]) list.toArray(new Portfolio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio[] listPortfolioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPortfolio(session, condition, orderBy, lockMode);
			return (Portfolio[]) list.toArray(new Portfolio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio loadPortfolioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadPortfolioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio loadPortfolioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadPortfolioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio loadPortfolioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Portfolio[] portfolios = listPortfolioByQuery(session, condition, orderBy);
		if (portfolios != null && portfolios.length > 0)
			return portfolios[0];
		else
			return null;
	}
	
	public static Portfolio loadPortfolioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Portfolio[] portfolios = listPortfolioByQuery(session, condition, orderBy, lockMode);
		if (portfolios != null && portfolios.length > 0)
			return portfolios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePortfolioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iteratePortfolioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortfolioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iteratePortfolioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortfolioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Portfolio as Portfolio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePortfolioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Portfolio as Portfolio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Portfolio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Portfolio createPortfolio() {
		return new Portfolio();
	}
	
	public boolean save() throws PersistentException {
		try {
			ProjectPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			ProjectPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getUser() != null) {
				getUser().setPortfolio(null);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getUser() != null) {
				getUser().setPortfolio(null);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
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
