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

public class RedeemptionOrderDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression orderId;
	public final DateExpression oderDate;
	public final DoubleExpression amount;
	public final StringExpression productId;
	public final AssociationExpression product;
	public final IntegerExpression orderState;
	public final StringExpression redeemCardNum;
	
	public RedeemptionOrderDetachedCriteria() {
		super(RedeemptionOrder.class, RedeemptionOrderCriteria.class);
		orderId = new StringExpression("orderId", this.getDetachedCriteria());
		oderDate = new DateExpression("oderDate", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		productId = new StringExpression("product.productId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		orderState = new IntegerExpression("orderState", this.getDetachedCriteria());
		redeemCardNum = new StringExpression("redeemCardNum", this.getDetachedCriteria());
	}
	
	public RedeemptionOrderDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, RedeemptionOrderCriteria.class);
		orderId = new StringExpression("orderId", this.getDetachedCriteria());
		oderDate = new DateExpression("oderDate", this.getDetachedCriteria());
		amount = new DoubleExpression("amount", this.getDetachedCriteria());
		productId = new StringExpression("product.productId", this.getDetachedCriteria());
		product = new AssociationExpression("product", this.getDetachedCriteria());
		orderState = new IntegerExpression("orderState", this.getDetachedCriteria());
		redeemCardNum = new StringExpression("redeemCardNum", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("product"));
	}
	
	public RedeemptionOrder uniqueRedeemptionOrder(PersistentSession session) {
		return (RedeemptionOrder) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public RedeemptionOrder[] listRedeemptionOrder(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (RedeemptionOrder[]) list.toArray(new RedeemptionOrder[list.size()]);
	}
}

