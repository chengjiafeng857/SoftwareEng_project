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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductCriteria extends AbstractORMCriteria {
	public final StringExpression productId;
	public final StringExpression exchangeId;
	public final AssociationExpression exchange;
	public final StringExpression productName;
	public final DoubleExpression interestRate;
	public final IntegerExpression riskLevel;
	public final StringExpression orderId;
	public final AssociationExpression order;
	
	public ProductCriteria(Criteria criteria) {
		super(criteria);
		productId = new StringExpression("productId", this);
		exchangeId = new StringExpression("exchange.exchangeId", this);
		exchange = new AssociationExpression("exchange", this);
		productName = new StringExpression("productName", this);
		interestRate = new DoubleExpression("interestRate", this);
		riskLevel = new IntegerExpression("riskLevel", this);
		orderId = new StringExpression("order.productId", this);
		order = new AssociationExpression("order", this);
	}
	
	public ProductCriteria(PersistentSession session) {
		this(session.createCriteria(Product.class));
	}
	
	public ProductCriteria() throws PersistentException {
		this(ProjectPersistentManager.instance().getSession());
	}
	
	public ExchangeCriteria createExchangeCriteria() {
		return new ExchangeCriteria(createCriteria("exchange"));
	}
	
	public OrderCriteria createOrderCriteria() {
		return new OrderCriteria(createCriteria("order"));
	}
	
	public Product uniqueProduct() {
		return (Product) super.uniqueResult();
	}
	
	public Product[] listProduct() {
		java.util.List list = super.list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

