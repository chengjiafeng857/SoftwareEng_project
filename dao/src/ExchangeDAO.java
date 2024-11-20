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

public class ExchangeDAO {
	public static Exchange loadExchangeByORMID(String exchangeId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadExchangeByORMID(session, exchangeId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange getExchangeByORMID(String exchangeId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getExchangeByORMID(session, exchangeId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByORMID(String exchangeId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadExchangeByORMID(session, exchangeId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange getExchangeByORMID(String exchangeId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getExchangeByORMID(session, exchangeId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByORMID(PersistentSession session, String exchangeId) throws PersistentException {
		try {
			return (Exchange) session.load(Exchange.class, exchangeId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange getExchangeByORMID(PersistentSession session, String exchangeId) throws PersistentException {
		try {
			return (Exchange) session.get(Exchange.class, exchangeId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByORMID(PersistentSession session, String exchangeId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Exchange) session.load(Exchange.class, exchangeId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange getExchangeByORMID(PersistentSession session, String exchangeId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Exchange) session.get(Exchange.class, exchangeId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExchange(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryExchange(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExchange(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryExchange(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange[] listExchangeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listExchangeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange[] listExchangeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listExchangeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryExchange(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Exchange as Exchange");
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
	
	public static List queryExchange(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Exchange as Exchange");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Exchange", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange[] listExchangeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryExchange(session, condition, orderBy);
			return (Exchange[]) list.toArray(new Exchange[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange[] listExchangeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryExchange(session, condition, orderBy, lockMode);
			return (Exchange[]) list.toArray(new Exchange[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadExchangeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadExchangeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Exchange[] exchanges = listExchangeByQuery(session, condition, orderBy);
		if (exchanges != null && exchanges.length > 0)
			return exchanges[0];
		else
			return null;
	}
	
	public static Exchange loadExchangeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Exchange[] exchanges = listExchangeByQuery(session, condition, orderBy, lockMode);
		if (exchanges != null && exchanges.length > 0)
			return exchanges[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateExchangeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateExchangeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateExchangeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateExchangeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateExchangeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Exchange as Exchange");
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
	
	public static java.util.Iterator iterateExchangeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Exchange as Exchange");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Exchange", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange createExchange() {
		return new Exchange();
	}
	
	public static boolean save(Exchange exchange) throws PersistentException {
		try {
			ProjectPersistentManager.instance().saveObject(exchange);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Exchange exchange) throws PersistentException {
		try {
			ProjectPersistentManager.instance().deleteObject(exchange);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Exchange exchange)throws PersistentException {
		try {
			Product[] lProducts = exchange.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].setExchange(null);
			}
			return delete(exchange);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Exchange exchange, org.orm.PersistentSession session)throws PersistentException {
		try {
			Product[] lProducts = exchange.product.toArray();
			for(int i = 0; i < lProducts.length; i++) {
				lProducts[i].setExchange(null);
			}
			try {
				session.delete(exchange);
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
	
	public static boolean refresh(Exchange exchange) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().refresh(exchange);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Exchange exchange) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().evict(exchange);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Exchange loadExchangeByCriteria(ExchangeCriteria exchangeCriteria) {
		Exchange[] exchanges = listExchangeByCriteria(exchangeCriteria);
		if(exchanges == null || exchanges.length == 0) {
			return null;
		}
		return exchanges[0];
	}
	
	public static Exchange[] listExchangeByCriteria(ExchangeCriteria exchangeCriteria) {
		return exchangeCriteria.listExchange();
	}
}
