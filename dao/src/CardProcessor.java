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
import org.orm.PersistentException;
public class CardProcessor {
	private String cardNum;
	
	private String bankName;
	
	private String action="";
	
	public void setCardNum(String value) {
		this.cardNum = value;
	}
	
	public String getCardNum() {
		return cardNum == null ? "" : cardNum;
	}
	
	public void setBankName(String value) {
		this.bankName = value;
	}
	
	public String getBankName() {
		return bankName == null ? "" : bankName;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Card _card = CardDAO.loadCardByORMID(getCardNum());
				if (_card!= null) {
					copyFromBean(_card);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				Card _card = CardDAO.createCard();
				copyToBean(_card);
				if (CardDAO.save(_card)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				Card _card= CardDAO.loadCardByORMID(getCardNum());
				if (_card != null) {
					copyToBean(_card);
					if (CardDAO.save(_card)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				Card _card = CardDAO.loadCardByORMID(getCardNum());
				if (_card != null && CardDAO.delete(_card)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(Card _card) {
		setBankName(_card.getBankName());
		setCardNum(_card.getCardNum());
	}
	
	private void copyToBean(Card _card) {
		_card.setCardNum(getCardNum());
		_card.setBankName(getBankName());
	}
	
}

