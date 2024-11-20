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
public class Card {
	public Card() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Card))
			return false;
		Card card = (Card)aObj;
		if ((getCardNum() != null && !getCardNum().equals(card.getCardNum())) || (getCardNum() == null && card.getCardNum() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCardNum() == null ? 0 : getCardNum().hashCode());
		return hashcode;
	}
	
	protected String cardNum;
	
	protected String bankName;
	
	public void setCardNum(String value) {
		this.cardNum = value;
	}
	
	public String getCardNum() {
		return cardNum;
	}
	
	public String getORMID() {
		return getCardNum();
	}
	
	public void setBankName(String value) {
		this.bankName = value;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	protected string userId;
	
	public void addCard() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void removeCard() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getCardNum());
	}
	
}
