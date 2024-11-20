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

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression userId;
	public final StringExpression name;
	public final DateExpression birthDate;
	public final IntegerExpression risklevel;
	public final IntegerExpression portfolioId;
	public final AssociationExpression portfolio;
	
	public UserDetachedCriteria() {
		super(User.class, UserCriteria.class);
		userId = new IntegerExpression("userId", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		birthDate = new DateExpression("birthDate", this.getDetachedCriteria());
		risklevel = new IntegerExpression("risklevel", this.getDetachedCriteria());
		portfolioId = new IntegerExpression("portfolio.PortfolioId", this.getDetachedCriteria());
		portfolio = new AssociationExpression("portfolio", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UserCriteria.class);
		userId = new IntegerExpression("userId", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		birthDate = new DateExpression("birthDate", this.getDetachedCriteria());
		risklevel = new IntegerExpression("risklevel", this.getDetachedCriteria());
		portfolioId = new IntegerExpression("portfolio.PortfolioId", this.getDetachedCriteria());
		portfolio = new AssociationExpression("portfolio", this.getDetachedCriteria());
	}
	
	public PortfolioDetachedCriteria createPortfolioCriteria() {
		return new PortfolioDetachedCriteria(createCriteria("portfolio"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

