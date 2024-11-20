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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression productId;
	public final StringExpression exchangeId;
	public final AssociationExpression exchange;
	public final StringExpression productName;
	public final DoubleExpression interestRate;
	public final IntegerExpression riskLevel;
	public final StringExpression orderId;
	public final AssociationExpression order;
	
	public ProductDetachedCriteria() {
		super(Product.class, ProductCriteria.class);
		productId = new StringExpression("productId", this.getDetachedCriteria());
		exchangeId = new StringExpression("exchange.exchangeId", this.getDetachedCriteria());
		exchange = new AssociationExpression("exchange", this.getDetachedCriteria());
		productName = new StringExpression("productName", this.getDetachedCriteria());
		interestRate = new DoubleExpression("interestRate", this.getDetachedCriteria());
		riskLevel = new IntegerExpression("riskLevel", this.getDetachedCriteria());
		orderId = new StringExpression("order.productId", this.getDetachedCriteria());
		order = new AssociationExpression("order", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ProductCriteria.class);
		productId = new StringExpression("productId", this.getDetachedCriteria());
		exchangeId = new StringExpression("exchange.exchangeId", this.getDetachedCriteria());
		exchange = new AssociationExpression("exchange", this.getDetachedCriteria());
		productName = new StringExpression("productName", this.getDetachedCriteria());
		interestRate = new DoubleExpression("interestRate", this.getDetachedCriteria());
		riskLevel = new IntegerExpression("riskLevel", this.getDetachedCriteria());
		orderId = new StringExpression("order.productId", this.getDetachedCriteria());
		order = new AssociationExpression("order", this.getDetachedCriteria());
	}
	
	public ExchangeDetachedCriteria createExchangeCriteria() {
		return new ExchangeDetachedCriteria(createCriteria("exchange"));
	}
	
	public OrderDetachedCriteria createOrderCriteria() {
		return new OrderDetachedCriteria(createCriteria("order"));
	}
	
	public Product uniqueProduct(PersistentSession session) {
		return (Product) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Product[] listProduct(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Product[]) list.toArray(new Product[list.size()]);
	}
}

