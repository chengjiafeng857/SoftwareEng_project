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

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression userId;
	public final StringExpression name;
	public final DateExpression birthDate;
	public final IntegerExpression risklevel;
	public final IntegerExpression portfolioId;
	public final AssociationExpression portfolio;
	
	public UserCriteria(Criteria criteria) {
		super(criteria);
		userId = new IntegerExpression("userId", this);
		name = new StringExpression("name", this);
		birthDate = new DateExpression("birthDate", this);
		risklevel = new IntegerExpression("risklevel", this);
		portfolioId = new IntegerExpression("portfolio.PortfolioId", this);
		portfolio = new AssociationExpression("portfolio", this);
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(ProjectPersistentManager.instance().getSession());
	}
	
	public PortfolioCriteria createPortfolioCriteria() {
		return new PortfolioCriteria(createCriteria("portfolio"));
	}
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

