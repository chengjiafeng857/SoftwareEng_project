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

public class SubscriptionOrderDAO {
	public static SubscriptionOrder loadSubscriptionOrderByORMID(String orderId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadSubscriptionOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder getSubscriptionOrderByORMID(String orderId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getSubscriptionOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByORMID(String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadSubscriptionOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder getSubscriptionOrderByORMID(String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getSubscriptionOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByORMID(PersistentSession session, String orderId) throws PersistentException {
		try {
			return (SubscriptionOrder) session.load(SubscriptionOrder.class, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder getSubscriptionOrderByORMID(PersistentSession session, String orderId) throws PersistentException {
		try {
			return (SubscriptionOrder) session.get(SubscriptionOrder.class, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByORMID(PersistentSession session, String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SubscriptionOrder) session.load(SubscriptionOrder.class, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder getSubscriptionOrderByORMID(PersistentSession session, String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SubscriptionOrder) session.get(SubscriptionOrder.class, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscriptionOrder(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return querySubscriptionOrder(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscriptionOrder(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return querySubscriptionOrder(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder[] listSubscriptionOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listSubscriptionOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder[] listSubscriptionOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listSubscriptionOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscriptionOrder(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From SubscriptionOrder as SubscriptionOrder");
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
	
	public static List querySubscriptionOrder(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From SubscriptionOrder as SubscriptionOrder");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SubscriptionOrder", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder[] listSubscriptionOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySubscriptionOrder(session, condition, orderBy);
			return (SubscriptionOrder[]) list.toArray(new SubscriptionOrder[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder[] listSubscriptionOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySubscriptionOrder(session, condition, orderBy, lockMode);
			return (SubscriptionOrder[]) list.toArray(new SubscriptionOrder[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadSubscriptionOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadSubscriptionOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SubscriptionOrder[] subscriptionOrders = listSubscriptionOrderByQuery(session, condition, orderBy);
		if (subscriptionOrders != null && subscriptionOrders.length > 0)
			return subscriptionOrders[0];
		else
			return null;
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SubscriptionOrder[] subscriptionOrders = listSubscriptionOrderByQuery(session, condition, orderBy, lockMode);
		if (subscriptionOrders != null && subscriptionOrders.length > 0)
			return subscriptionOrders[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSubscriptionOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateSubscriptionOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateSubscriptionOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From SubscriptionOrder as SubscriptionOrder");
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
	
	public static java.util.Iterator iterateSubscriptionOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From SubscriptionOrder as SubscriptionOrder");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SubscriptionOrder", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder createSubscriptionOrder() {
		return new SubscriptionOrder();
	}
	
	public static boolean save(SubscriptionOrder subscriptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().saveObject(subscriptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(SubscriptionOrder subscriptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().deleteObject(subscriptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(SubscriptionOrder subscriptionOrder)throws PersistentException {
		try {
			if (subscriptionOrder.getProduct() != null) {
				subscriptionOrder.getProduct().setOrder(null);
			}
			
			return delete(subscriptionOrder);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(SubscriptionOrder subscriptionOrder, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (subscriptionOrder.getProduct() != null) {
				subscriptionOrder.getProduct().setOrder(null);
			}
			
			try {
				session.delete(subscriptionOrder);
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
	
	public static boolean refresh(SubscriptionOrder subscriptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().refresh(subscriptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(SubscriptionOrder subscriptionOrder) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().evict(subscriptionOrder);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubscriptionOrder loadSubscriptionOrderByCriteria(SubscriptionOrderCriteria subscriptionOrderCriteria) {
		SubscriptionOrder[] subscriptionOrders = listSubscriptionOrderByCriteria(subscriptionOrderCriteria);
		if(subscriptionOrders == null || subscriptionOrders.length == 0) {
			return null;
		}
		return subscriptionOrders[0];
	}
	
	public static SubscriptionOrder[] listSubscriptionOrderByCriteria(SubscriptionOrderCriteria subscriptionOrderCriteria) {
		return subscriptionOrderCriteria.listSubscriptionOrder();
	}
}
