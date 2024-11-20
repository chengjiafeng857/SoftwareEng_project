/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateProjectDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(ProjectPersistentManager.instance());
			ProjectPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
