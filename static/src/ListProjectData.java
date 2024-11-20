/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListProjectData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Portfolio...");
		Portfolio[] portfolios = Portfolio.listPortfolioByQuery(null, null);
		int length = Math.min(portfolios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(portfolios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing User...");
		User[] users = User.listUserByQuery(null, null);
		length = Math.min(users.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(users[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Card...");
		Card[] cards = Card.listCardByQuery(null, null);
		length = Math.min(cards.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cards[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Order...");
		Order[] orders = Order.listOrderByQuery(null, null);
		length = Math.min(orders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(orders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Product...");
		Product[] products = Product.listProductByQuery(null, null);
		length = Math.min(products.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(products[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing RedeemptionOrder...");
		RedeemptionOrder[] redeemptionOrders = RedeemptionOrder.listRedeemptionOrderByQuery(null, null);
		length = Math.min(redeemptionOrders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(redeemptionOrders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SubscriptionOrder...");
		SubscriptionOrder[] subscriptionOrders = SubscriptionOrder.listSubscriptionOrderByQuery(null, null);
		length = Math.min(subscriptionOrders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(subscriptionOrders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Exchange...");
		Exchange[] exchanges = Exchange.listExchangeByQuery(null, null);
		length = Math.min(exchanges.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(exchanges[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectData listProjectData = new ListProjectData();
			try {
				listProjectData.listTestData();
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
