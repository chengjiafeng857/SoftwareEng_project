/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteProjectData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ProjectPersistentManager.instance().getSession().beginTransaction();
		try {
			Portfolio portfolio = PortfolioDAO.loadPortfolioByQuery(null, null);
			// Delete the persistent object
			PortfolioDAO.delete(portfolio);
			User user = UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			UserDAO.delete(user);
			Card card = CardDAO.loadCardByQuery(null, null);
			// Delete the persistent object
			CardDAO.delete(card);
			Order order = OrderDAO.loadOrderByQuery(null, null);
			// Delete the persistent object
			OrderDAO.delete(order);
			Product product = ProductDAO.loadProductByQuery(null, null);
			// Delete the persistent object
			ProductDAO.delete(product);
			RedeemptionOrder redeemptionOrder = RedeemptionOrderDAO.loadRedeemptionOrderByQuery(null, null);
			// Delete the persistent object
			RedeemptionOrderDAO.delete(redeemptionOrder);
			SubscriptionOrder subscriptionOrder = SubscriptionOrderDAO.loadSubscriptionOrderByQuery(null, null);
			// Delete the persistent object
			SubscriptionOrderDAO.delete(subscriptionOrder);
			Exchange exchange = ExchangeDAO.loadExchangeByQuery(null, null);
			// Delete the persistent object
			ExchangeDAO.delete(exchange);
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
