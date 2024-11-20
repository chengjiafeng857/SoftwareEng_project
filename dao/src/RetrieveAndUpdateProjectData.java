/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateProjectData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ProjectPersistentManager.instance().getSession().beginTransaction();
		try {
			Portfolio portfolio = PortfolioDAO.loadPortfolioByQuery(null, null);
			// Update the properties of the persistent object
			PortfolioDAO.save(portfolio);
			User user = UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			UserDAO.save(user);
			Card card = CardDAO.loadCardByQuery(null, null);
			// Update the properties of the persistent object
			CardDAO.save(card);
			Order order = OrderDAO.loadOrderByQuery(null, null);
			// Update the properties of the persistent object
			OrderDAO.save(order);
			Product product = ProductDAO.loadProductByQuery(null, null);
			// Update the properties of the persistent object
			ProductDAO.save(product);
			RedeemptionOrder redeemptionOrder = RedeemptionOrderDAO.loadRedeemptionOrderByQuery(null, null);
			// Update the properties of the persistent object
			RedeemptionOrderDAO.save(redeemptionOrder);
			SubscriptionOrder subscriptionOrder = SubscriptionOrderDAO.loadSubscriptionOrderByQuery(null, null);
			// Update the properties of the persistent object
			SubscriptionOrderDAO.save(subscriptionOrder);
			Exchange exchange = ExchangeDAO.loadExchangeByQuery(null, null);
			// Update the properties of the persistent object
			ExchangeDAO.save(exchange);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Portfolio by PortfolioCriteria");
		PortfolioCriteria portfolioCriteria = new PortfolioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//portfolioCriteria.PortfolioId.eq();
		System.out.println(portfolioCriteria.uniquePortfolio());
		
		System.out.println("Retrieving User by UserCriteria");
		UserCriteria userCriteria = new UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//userCriteria.userId.eq();
		System.out.println(userCriteria.uniqueUser());
		
		System.out.println("Retrieving Card by CardCriteria");
		CardCriteria cardCriteria = new CardCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//cardCriteria.cardNum.eq();
		System.out.println(cardCriteria.uniqueCard());
		
		System.out.println("Retrieving Order by OrderCriteria");
		OrderCriteria orderCriteria = new OrderCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//orderCriteria.orderId.eq();
		System.out.println(orderCriteria.uniqueOrder());
		
		System.out.println("Retrieving Product by ProductCriteria");
		ProductCriteria productCriteria = new ProductCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//productCriteria.productId.eq();
		System.out.println(productCriteria.uniqueProduct());
		
		System.out.println("Retrieving RedeemptionOrder by RedeemptionOrderCriteria");
		RedeemptionOrderCriteria redeemptionOrderCriteria = new RedeemptionOrderCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//redeemptionOrderCriteria.orderId.eq();
		System.out.println(redeemptionOrderCriteria.uniqueRedeemptionOrder());
		
		System.out.println("Retrieving SubscriptionOrder by SubscriptionOrderCriteria");
		SubscriptionOrderCriteria subscriptionOrderCriteria = new SubscriptionOrderCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//subscriptionOrderCriteria.orderId.eq();
		System.out.println(subscriptionOrderCriteria.uniqueSubscriptionOrder());
		
		System.out.println("Retrieving Exchange by ExchangeCriteria");
		ExchangeCriteria exchangeCriteria = new ExchangeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//exchangeCriteria.exchangeId.eq();
		System.out.println(exchangeCriteria.uniqueExchange());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProjectData retrieveAndUpdateProjectData = new RetrieveAndUpdateProjectData();
			try {
				retrieveAndUpdateProjectData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProjectData.retrieveByCriteria();
			}
			finally {
				ProjectPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
