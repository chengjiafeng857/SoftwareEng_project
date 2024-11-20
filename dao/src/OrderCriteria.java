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

public class OrderCriteria extends AbstractORMCriteria {
	public final StringExpression orderId;
	public final DateExpression oderDate;
	public final DoubleExpression amount;
	public final StringExpression productId;
	public final AssociationExpression product;
	public final IntegerExpression orderState;
	
	public OrderCriteria(Criteria criteria) {
		super(criteria);
		orderId = new StringExpression("orderId", this);
		oderDate = new DateExpression("oderDate", this);
		amount = new DoubleExpression("amount", this);
		productId = new StringExpression("product.productId", this);
		product = new AssociationExpression("product", this);
		orderState = new IntegerExpression("orderState", this);
	}
	
	public OrderCriteria(PersistentSession session) {
		this(session.createCriteria(Order.class));
	}
	
	public OrderCriteria() throws PersistentException {
		this(ProjectPersistentManager.instance().getSession());
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("product"));
	}
	
	public Order uniqueOrder() {
		return (Order) super.uniqueResult();
	}
	
	public Order[] listOrder() {
		java.util.List list = super.list();
		return (Order[]) list.toArray(new Order[list.size()]);
	}
}

