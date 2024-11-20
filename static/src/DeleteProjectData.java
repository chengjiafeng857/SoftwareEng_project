/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteProjectData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ProjectPersistentManager.instance().getSession().beginTransaction();
		try {
			Portfolio portfolio = Portfolio.loadPortfolioByQuery(null, null);
			portfolio.delete();
			User user = User.loadUserByQuery(null, null);
			user.delete();
			Card card = Card.loadCardByQuery(null, null);
			card.delete();
			Order order = Order.loadOrderByQuery(null, null);
			order.delete();
			Product product = Product.loadProductByQuery(null, null);
			product.delete();
			RedeemptionOrder redeemptionOrder = RedeemptionOrder.loadRedeemptionOrderByQuery(null, null);
			redeemptionOrder.delete();
			SubscriptionOrder subscriptionOrder = SubscriptionOrder.loadSubscriptionOrderByQuery(null, null);
			subscriptionOrder.delete();
			Exchange exchange = Exchange.loadExchangeByQuery(null, null);
			exchange.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProjectData deleteProjectData = new DeleteProjectData();
			try {
				deleteProjectData.deleteTestData();
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
