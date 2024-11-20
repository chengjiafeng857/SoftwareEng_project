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

public class PortfolioCriteria extends AbstractORMCriteria {
	public final IntegerExpression PortfolioId;
	public final DoubleExpression totalInvestment;
	public final DoubleExpression totalEarning;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	
	public PortfolioCriteria(Criteria criteria) {
		super(criteria);
		PortfolioId = new IntegerExpression("PortfolioId", this);
		totalInvestment = new DoubleExpression("totalInvestment", this);
		totalEarning = new DoubleExpression("totalEarning", this);
		userId = new IntegerExpression("user.PortfolioId", this);
		user = new AssociationExpression("user", this);
	}
	
	public PortfolioCriteria(PersistentSession session) {
		this(session.createCriteria(Portfolio.class));
	}
	
	public PortfolioCriteria() throws PersistentException {
		this(ProjectPersistentManager.instance().getSession());
	}
	
	public UserCriteria createUserCriteria() {
		return new UserCriteria(createCriteria("user"));
	}
	
	public Portfolio uniquePortfolio() {
		return (Portfolio) super.uniqueResult();
	}
	
	public Portfolio[] listPortfolio() {
		java.util.List list = super.list();
		return (Portfolio[]) list.toArray(new Portfolio[list.size()]);
	}
}

