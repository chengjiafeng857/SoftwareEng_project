/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListProjectData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Portfolio...");
		Portfolio[] portfolios = PortfolioDAO.listPortfolioByQuery(null, null);
		int length = Math.min(portfolios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(portfolios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User...");
		User[] users = UserDAO.listUserByQuery(null, null);
		length = Math.min(users.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(users[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Card...");
		Card[] cards = CardDAO.listCardByQuery(null, null);
		length = Math.min(cards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Order...");
		Order[] orders = OrderDAO.listOrderByQuery(null, null);
		length = Math.min(orders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Product...");
		Product[] products = ProductDAO.listProductByQuery(null, null);
		length = Math.min(products.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(products[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing RedeemptionOrder...");
		RedeemptionOrder[] redeemptionOrders = RedeemptionOrderDAO.listRedeemptionOrderByQuery(null, null);
		length = Math.min(redeemptionOrders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(redeemptionOrders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SubscriptionOrder...");
		SubscriptionOrder[] subscriptionOrders = SubscriptionOrderDAO.listSubscriptionOrderByQuery(null, null);
		length = Math.min(subscriptionOrders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subscriptionOrders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Exchange...");
		Exchange[] exchanges = ExchangeDAO.listExchangeByQuery(null, null);
		length = Math.min(exchanges.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(exchanges[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Portfolio by Criteria...");
		PortfolioCriteria portfolioCriteria = new PortfolioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//portfolioCriteria.PortfolioId.eq();
		portfolioCriteria.setMaxResults(ROW_COUNT);
		Portfolio[] portfolios = portfolioCriteria.listPortfolio();
		int length =portfolios== null ? 0 : Math.min(portfolios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(portfolios[i]);
		}
		System.out.println(length + " Portfolio record(s) retrieved."); 
		
		System.out.println("Listing User by Criteria...");
		UserCriteria userCriteria = new UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//userCriteria.userId.eq();
		userCriteria.setMaxResults(ROW_COUNT);
		User[] users = userCriteria.listUser();
		length =users== null ? 0 : Math.min(users.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(users[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Card by Criteria...");
		CardCriteria cardCriteria = new CardCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//cardCriteria.cardNum.eq();
		cardCriteria.setMaxResults(ROW_COUNT);
		Card[] cards = cardCriteria.listCard();
		length =cards== null ? 0 : Math.min(cards.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(cards[i]);
		}
		System.out.println(length + " Card record(s) retrieved."); 
		
		System.out.println("Listing Order by Criteria...");
		OrderCriteria orderCriteria = new OrderCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//orderCriteria.orderId.eq();
		orderCriteria.setMaxResults(ROW_COUNT);
		Order[] orders = orderCriteria.listOrder();
		length =orders== null ? 0 : Math.min(orders.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(orders[i]);
		}
		System.out.println(length + " Order record(s) retrieved."); 
		
		System.out.println("Listing Product by Criteria...");
		ProductCriteria productCriteria = new ProductCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//productCriteria.productId.eq();
		productCriteria.setMaxResults(ROW_COUNT);
		Product[] products = productCriteria.listProduct();
		length =products== null ? 0 : Math.min(products.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(products[i]);
		}
		System.out.println(length + " Product record(s) retrieved."); 
		
		System.out.println("Listing RedeemptionOrder by Criteria...");
		RedeemptionOrderCriteria redeemptionOrderCriteria = new RedeemptionOrderCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//redeemptionOrderCriteria.orderId.eq();
		redeemptionOrderCriteria.setMaxResults(ROW_COUNT);
		RedeemptionOrder[] redeemptionOrders = redeemptionOrderCriteria.listRedeemptionOrder();
		length =redeemptionOrders== null ? 0 : Math.min(redeemptionOrders.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(redeemptionOrders[i]);
		}
		System.out.println(length + " RedeemptionOrder record(s) retrieved."); 
		
		System.out.println("Listing SubscriptionOrder by Criteria...");
		SubscriptionOrderCriteria subscriptionOrderCriteria = new SubscriptionOrderCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//subscriptionOrderCriteria.orderId.eq();
		subscriptionOrderCriteria.setMaxResults(ROW_COUNT);
		SubscriptionOrder[] subscriptionOrders = subscriptionOrderCriteria.listSubscriptionOrder();
		length =subscriptionOrders== null ? 0 : Math.min(subscriptionOrders.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(subscriptionOrders[i]);
		}
		System.out.println(length + " SubscriptionOrder record(s) retrieved."); 
		
		System.out.println("Listing Exchange by Criteria...");
		ExchangeCriteria exchangeCriteria = new ExchangeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//exchangeCriteria.exchangeId.eq();
		exchangeCriteria.setMaxResults(ROW_COUNT);
		Exchange[] exchanges = exchangeCriteria.listExchange();
		length =exchanges== null ? 0 : Math.min(exchanges.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(exchanges[i]);
		}
		System.out.println(length + " Exchange record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectData listProjectData = new ListProjectData();
			try {
				listProjectData.listTestData();
				//listProjectData.listByCriteria();
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
