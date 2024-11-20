/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateProjectData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ProjectPersistentManager.instance().getSession().beginTransaction();
		try {
			Portfolio portfolio = Portfolio.createPortfolio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : user, totalEarning, totalInvestment
			portfolio.save();
			User user = User.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : portfolio, risklevel
			user.save();
			Card card = Card.createCard();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cardNum
			card.save();
			Order order = Order.createOrder();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : orderState, amount, orderId
			order.save();
			Product product = Product.createProduct();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : riskLevel, interestRate, productId
			product.save();
			RedeemptionOrder redeemptionOrder = RedeemptionOrder.createRedeemptionOrder();
			// Initialize the properties of the persistent object here
			redeemptionOrder.save();
			SubscriptionOrder subscriptionOrder = SubscriptionOrder.createSubscriptionOrder();
			// Initialize the properties of the persistent object here
			subscriptionOrder.save();
			Exchange exchange = Exchange.createExchange();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : exchangeId
			exchange.save();
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
