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

public class CardDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression cardNum;
	public final StringExpression bankName;
	
	public CardDetachedCriteria() {
		super(Card.class, CardCriteria.class);
		cardNum = new StringExpression("cardNum", this.getDetachedCriteria());
		bankName = new StringExpression("bankName", this.getDetachedCriteria());
	}
	
	public CardDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CardCriteria.class);
		cardNum = new StringExpression("cardNum", this.getDetachedCriteria());
		bankName = new StringExpression("bankName", this.getDetachedCriteria());
	}
	
	public Card uniqueCard(PersistentSession session) {
		return (Card) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Card[] listCard(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Card[]) list.toArray(new Card[list.size()]);
	}
}

