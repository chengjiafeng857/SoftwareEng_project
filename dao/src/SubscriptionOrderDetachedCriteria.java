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

public class SubscriptionOrderDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression orderId;
	public final DateExpression oderDate;
	public final DoubleExpression amount;
	public final StringExpression productId;
	public final AssociationExpression product;
	public final IntegerExpression orderState;
	public final StringExpression paymentCardNum;
	
	public SubscriptionOrderDetachedCriteria() {
		super(SubscriptionOrder.class, SubscriptionOrderCriteria.class);
		orderId = new StringExpression("orderId", this.getDetachedCriteria());
		oderDate = new DateExpression("oderDate", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		productId = new StringExpression("product.productId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		orderState = new IntegerExpression("orderState", this.getDetachedCriteria());
		paymentCardNum = new StringExpression("paymentCardNum", this.getDetachedCriteria());
	}
	
	public SubscriptionOrderDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, SubscriptionOrderCriteria.class);
		orderId = new StringExpression("orderId", this.getDetachedCriteria());
		oderDate = new DateExpression("oderDate", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		productId = new StringExpression("product.productId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		orderState = new IntegerExpression("orderState", this.getDetachedCriteria());
		paymentCardNum = new StringExpression("paymentCardNum", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public SubscriptionOrder uniqueSubscriptionOrder(PersistentSession session) {
		return (SubscriptionOrder) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SubscriptionOrder[] listSubscriptionOrder(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SubscriptionOrder[]) list.toArray(new SubscriptionOrder[list.size()]);
	}
}

