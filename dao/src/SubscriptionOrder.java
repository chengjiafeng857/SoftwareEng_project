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
public class SubscriptionOrder extends Order implements RiskControl {
	public SubscriptionOrder() {
	}
	
	private String paymentCardNum;
	
	public void setPaymentCardNum(String value) {
		this.paymentCardNum = value;
	}
	
	public String getPaymentCardNum() {
		return paymentCardNum;
	}
	
	public void executeOrder() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void checkRisk() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}
