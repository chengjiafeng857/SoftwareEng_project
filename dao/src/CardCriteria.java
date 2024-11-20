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

public class CardCriteria extends AbstractORMCriteria {
	public final StringExpression cardNum;
	public final StringExpression bankName;
	
	public CardCriteria(Criteria criteria) {
		super(criteria);
		cardNum = new StringExpression("cardNum", this);
		bankName = new StringExpression("bankName", this);
	}
	
	public CardCriteria(PersistentSession session) {
		this(session.createCriteria(Card.class));
	}
	
	public CardCriteria() throws PersistentException {
		this(ProjectPersistentManager.instance().getSession());
	}
	
	public Card uniqueCard() {
		return (Card) super.uniqueResult();
	}
	
	public Card[] listCard() {
		java.util.List list = super.list();
		return (Card[]) list.toArray(new Card[list.size()]);
	}
}

