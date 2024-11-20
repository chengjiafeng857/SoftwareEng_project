/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateProjectData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ProjectPersistentManager.instance().getSession().beginTransaction();
		try {
			Portfolio portfolio = PortfolioDAO.createPortfolio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : user, totalEarning, totalInvestment
			PortfolioDAO.save(portfolio);
			User user = UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : portfolio, risklevel
			UserDAO.save(user);
			Card card = CardDAO.createCard();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cardNum
			CardDAO.save(card);
			Order order = OrderDAO.createOrder();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orderState, amount, orderId
			OrderDAO.save(order);
			Product product = ProductDAO.createProduct();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : riskLevel, interestRate, productId
			ProductDAO.save(product);
			RedeemptionOrder redeemptionOrder = RedeemptionOrderDAO.createRedeemptionOrder();
			// Initialize the properties of the persistent object here
			RedeemptionOrderDAO.save(redeemptionOrder);
			SubscriptionOrder subscriptionOrder = SubscriptionOrderDAO.createSubscriptionOrder();
			// Initialize the properties of the persistent object here
			SubscriptionOrderDAO.save(subscriptionOrder);
			Exchange exchange = ExchangeDAO.createExchange();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : exchangeId
			ExchangeDAO.save(exchange);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProjectData createProjectData = new CreateProjectData();
			try {
				createProjectData.createTestData();
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
