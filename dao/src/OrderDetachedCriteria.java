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

public class OrderDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression orderId;
	public final DateExpression oderDate;
	public final DoubleExpression amount;
	public final StringExpression productId;
	public final AssociationExpression product;
	public final IntegerExpression orderState;
	
	public OrderDetachedCriteria() {
		super(Order.class, OrderCriteria.class);
		orderId = new StringExpression("orderId", this.getDetachedCriteria());
		oderDate = new DateExpression("oderDate", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		productId = new StringExpression("product.productId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		orderState = new IntegerExpression("orderState", this.getDetachedCriteria());
	}
	
	public OrderDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, OrderCriteria.class);
		orderId = new StringExpression("orderId", this.getDetachedCriteria());
		oderDate = new DateExpression("oderDate", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		productId = new StringExpression("product.productId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		orderState = new IntegerExpression("orderState", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public Order uniqueOrder(PersistentSession session) {
		return (Order) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Order[] listOrder(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Order[]) list.toArray(new Order[list.size()]);
	}
}

