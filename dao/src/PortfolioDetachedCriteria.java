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

public class PortfolioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression PortfolioId;
	public final DoubleExpression totalInvestment;
	public final DoubleExpression totalEarning;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	
	public PortfolioDetachedCriteria() {
		super(Portfolio.class, PortfolioCriteria.class);
		PortfolioId = new IntegerExpression("PortfolioId", this.getDetachedCriteria());
		totalInvestment = new DoubleExpression("totalInvestment", this.getDetachedCriteria());
		totalEarning = new DoubleExpression("totalEarning", this.getDetachedCriteria());
		userId = new IntegerExpression("user.PortfolioId", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
	}
	
	public PortfolioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PortfolioCriteria.class);
		PortfolioId = new IntegerExpression("PortfolioId", this.getDetachedCriteria());
		totalInvestment = new DoubleExpression("totalInvestment", this.getDetachedCriteria());
		totalEarning = new DoubleExpression("totalEarning", this.getDetachedCriteria());
		userId = new IntegerExpression("user.PortfolioId", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createUserCriteria() {
		return new UserDetachedCriteria(createCriteria("user"));
	}
	
	public Portfolio uniquePortfolio(PersistentSession session) {
		return (Portfolio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Portfolio[] listPortfolio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Portfolio[]) list.toArray(new Portfolio[list.size()]);
	}
}

