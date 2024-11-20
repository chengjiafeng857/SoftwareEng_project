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

public class ExchangeCriteria extends AbstractORMCriteria {
	public final StringExpression exchangeId;
	public final StringExpression exchangeName;
	public final CollectionExpression product;
	
	public ExchangeCriteria(Criteria criteria) {
		super(criteria);
		exchangeId = new StringExpression("exchangeId", this);
		exchangeName = new StringExpression("exchangeName", this);
		product = new CollectionExpression("ORM_Product", this);
	}
	
	public ExchangeCriteria(PersistentSession session) {
		this(session.createCriteria(Exchange.class));
	}
	
	public ExchangeCriteria() throws PersistentException {
		this(ProjectPersistentManager.instance().getSession());
	}
	
	public ProductCriteria createProductCriteria() {
		return new ProductCriteria(createCriteria("ORM_Product"));
	}
	
	public Exchange uniqueExchange() {
		return (Exchange) super.uniqueResult();
	}
	
	public Exchange[] listExchange() {
		java.util.List list = super.list();
		return (Exchange[]) list.toArray(new Exchange[list.size()]);
	}
}

