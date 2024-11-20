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

public class ExchangeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression exchangeId;
	public final StringExpression exchangeName;
	public final CollectionExpression product;
	
	public ExchangeDetachedCriteria() {
		super(Exchange.class, ExchangeCriteria.class);
		exchangeId = new StringExpression("exchangeId", this.getDetachedCriteria());
		exchangeName = new StringExpression("exchangeName", this.getDetachedCriteria());
		product = new CollectionExpression("ORM_Product", this.getDetachedCriteria());
	}
	
	public ExchangeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ExchangeCriteria.class);
		exchangeId = new StringExpression("exchangeId", this.getDetachedCriteria());
		exchangeName = new StringExpression("exchangeName", this.getDetachedCriteria());
		product = new CollectionExpression("ORM_Product", this.getDetachedCriteria());
	}
	
	public ProductDetachedCriteria createProductCriteria() {
		return new ProductDetachedCriteria(createCriteria("ORM_Product"));
	}
	
	public Exchange uniqueExchange(PersistentSession session) {
		return (Exchange) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Exchange[] listExchange(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Exchange[]) list.toArray(new Exchange[list.size()]);
	}
}

