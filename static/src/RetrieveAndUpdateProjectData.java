/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateProjectData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ProjectPersistentManager.instance().getSession().beginTransaction();
		try {
			Portfolio portfolio = Portfolio.loadPortfolioByQuery(null, null);
			// Update the properties of the persistent object
			portfolio.save();
			User user = User.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			user.save();
			Card card = Card.loadCardByQuery(null, null);
			// Update the properties of the persistent object
			card.save();
			Order order = Order.loadOrderByQuery(null, null);
			// Update the properties of the persistent object
			order.save();
			Product product = Product.loadProductByQuery(null, null);
			// Update the properties of the persistent object
			product.save();
			RedeemptionOrder redeemptionOrder = RedeemptionOrder.loadRedeemptionOrderByQuery(null, null);
			// Update the properties of the persistent object
			redeemptionOrder.save();
			SubscriptionOrder subscriptionOrder = SubscriptionOrder.loadSubscriptionOrderByQuery(null, null);
			// Update the properties of the persistent object
			subscriptionOrder.save();
			Exchange exchange = Exchange.loadExchangeByQuery(null, null);
			// Update the properties of the persistent object
			exchange.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProjectData retrieveAndUpdateProjectData = new RetrieveAndUpdateProjectData();
			try {
				retrieveAndUpdateProjectData.retrieveAndUpdateTestData();
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
