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

public class OrderDAO {
	public static Order loadOrderByORMID(String orderId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(String orderId) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getOrderByORMID(session, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByORMID(String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return getOrderByORMID(session, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByORMID(PersistentSession session, String orderId) throws PersistentException {
		try {
			return (Order) session.load(Order.class, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(PersistentSession session, String orderId) throws PersistentException {
		try {
			return (Order) session.get(Order.class, orderId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByORMID(PersistentSession session, String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Order) session.load(Order.class, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order getOrderByORMID(PersistentSession session, String orderId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Order) session.get(Order.class, orderId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrder(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryOrder(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrder(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return queryOrder(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return listOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrder(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
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
	
	public static List queryOrder(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Order", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrder(session, condition, orderBy);
			return (Order[]) list.toArray(new Order[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order[] listOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrder(session, condition, orderBy, lockMode);
			return (Order[]) list.toArray(new Order[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return loadOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Order[] orders = listOrderByQuery(session, condition, orderBy);
		if (orders != null && orders.length > 0)
			return orders[0];
		else
			return null;
	}
	
	public static Order loadOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Order[] orders = listOrderByQuery(session, condition, orderBy, lockMode);
		if (orders != null && orders.length > 0)
			return orders[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateOrderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectPersistentManager.instance().getSession();
			return iterateOrderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
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
	
	public static java.util.Iterator iterateOrderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Order as Order");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Order", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order createOrder() {
		return new Order();
	}
	
	public static boolean save(Order order) throws PersistentException {
		try {
			ProjectPersistentManager.instance().saveObject(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Order order) throws PersistentException {
		try {
			ProjectPersistentManager.instance().deleteObject(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Order order)throws PersistentException {
		if (order instanceof RedeemptionOrder) {
			return RedeemptionOrderDAO.deleteAndDissociate((RedeemptionOrder) order);
		}
		
		if (order instanceof SubscriptionOrder) {
			return SubscriptionOrderDAO.deleteAndDissociate((SubscriptionOrder) order);
		}
		
		try {
			if (order.getProduct() != null) {
				order.getProduct().setOrder(null);
			}
			
			return delete(order);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Order order, org.orm.PersistentSession session)throws PersistentException {
		if (order instanceof RedeemptionOrder) {
			return RedeemptionOrderDAO.deleteAndDissociate((RedeemptionOrder) order, session);
		}
		
		if (order instanceof SubscriptionOrder) {
			return SubscriptionOrderDAO.deleteAndDissociate((SubscriptionOrder) order, session);
		}
		
		try {
			if (order.getProduct() != null) {
				order.getProduct().setOrder(null);
			}
			
			try {
				session.delete(order);
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
	
	public static boolean refresh(Order order) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().refresh(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Order order) throws PersistentException {
		try {
			ProjectPersistentManager.instance().getSession().evict(order);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Order loadOrderByCriteria(OrderCriteria orderCriteria) {
		Order[] orders = listOrderByCriteria(orderCriteria);
		if(orders == null || orders.length == 0) {
			return null;
		}
		return orders[0];
	}
	
	public static Order[] listOrderByCriteria(OrderCriteria orderCriteria) {
		return orderCriteria.listOrder();
	}
}
