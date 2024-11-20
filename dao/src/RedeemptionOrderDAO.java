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

public class RedeemptionOrderDAO {
	public static RedeemptionOrder loadRedeemptionOrderByORMID(String orderId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadRedeemptionOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder getRedeemptionOrderByORMID(String orderId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getRedeemptionOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByORMID(String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadRedeemptionOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder getRedeemptionOrderByORMID(String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getRedeemptionOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByORMID(PersistentSession session, String orderId) throws PersistentException {
		try {
			return (RedeemptionOrder) session.load(RedeemptionOrder.class, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder getRedeemptionOrderByORMID(PersistentSession session, String orderId) throws PersistentException {
		try {
			return (RedeemptionOrder) session.get(RedeemptionOrder.class, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByORMID(PersistentSession session, String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RedeemptionOrder) session.load(RedeemptionOrder.class, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder getRedeemptionOrderByORMID(PersistentSession session, String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (RedeemptionOrder) session.get(RedeemptionOrder.class, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRedeemptionOrder(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryRedeemptionOrder(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRedeemptionOrder(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryRedeemptionOrder(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder[] listRedeemptionOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listRedeemptionOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder[] listRedeemptionOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listRedeemptionOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRedeemptionOrder(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From RedeemptionOrder as RedeemptionOrder");
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
	
	public static List queryRedeemptionOrder(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From RedeemptionOrder as RedeemptionOrder");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RedeemptionOrder", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder[] listRedeemptionOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRedeemptionOrder(session, condition, orderBy);
			return (RedeemptionOrder[]) list.toArray(new RedeemptionOrder[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder[] listRedeemptionOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRedeemptionOrder(session, condition, orderBy, lockMode);
			return (RedeemptionOrder[]) list.toArray(new RedeemptionOrder[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadRedeemptionOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadRedeemptionOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		RedeemptionOrder[] redeemptionOrders = listRedeemptionOrderByQuery(session, condition, orderBy);
		if (redeemptionOrders != null && redeemptionOrders.length > 0)
			return redeemptionOrders[0];
		else
			return null;
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		RedeemptionOrder[] redeemptionOrders = listRedeemptionOrderByQuery(session, condition, orderBy, lockMode);
		if (redeemptionOrders != null && redeemptionOrders.length > 0)
			return redeemptionOrders[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRedeemptionOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateRedeemptionOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRedeemptionOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateRedeemptionOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRedeemptionOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From RedeemptionOrder as RedeemptionOrder");
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
	
	public static java.util.Iterator iterateRedeemptionOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From RedeemptionOrder as RedeemptionOrder");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("RedeemptionOrder", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder createRedeemptionOrder() {
		return new RedeemptionOrder();
	}
	
	public static boolean save(RedeemptionOrder redeemptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().saveObject(redeemptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(RedeemptionOrder redeemptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().deleteObject(redeemptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(RedeemptionOrder redeemptionOrder)throws PersistentException {
		try {
			if (redeemptionOrder.getProduct() != null) {
				redeemptionOrder.getProduct().setOrder(null);
			}
			
			return delete(redeemptionOrder);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(RedeemptionOrder redeemptionOrder, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (redeemptionOrder.getProduct() != null) {
				redeemptionOrder.getProduct().setOrder(null);
			}
			
			try {
				session.delete(redeemptionOrder);
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
	
	public static boolean refresh(RedeemptionOrder redeemptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().refresh(redeemptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(RedeemptionOrder redeemptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().evict(redeemptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static RedeemptionOrder loadRedeemptionOrderByCriteria(RedeemptionOrderCriteria redeemptionOrderCriteria) {
		RedeemptionOrder[] redeemptionOrders = listRedeemptionOrderByCriteria(redeemptionOrderCriteria);
		if(redeemptionOrders == null || redeemptionOrders.length == 0) {
			return null;
		}
		return redeemptionOrders[0];
	}
	
	public static RedeemptionOrder[] listRedeemptionOrderByCriteria(RedeemptionOrderCriteria redeemptionOrderCriteria) {
		return redeemptionOrderCriteria.listRedeemptionOrder();
	}
}
