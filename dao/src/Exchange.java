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
public class Exchange {
	public Exchange() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Exchange))
			return false;
		Exchange exchange = (Exchange)aObj;
		if ((getExchangeId() != null && !getExchangeId().equals(exchange.getExchangeId())) || (getExchangeId() == null && exchange.getExchangeId() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getExchangeId() == null ? 0 : getExchangeId().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EXCHANGE_PRODUCT) {
			return ORM_product;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	protected String exchangeId;
	
	protected String exchangeName;
	
	private java.util.Set ORM_product = new java.util.HashSet();
	
	public void setExchangeId(String value) {
		this.exchangeId = value;
	}
	
	public String getExchangeId() {
		return exchangeId;
	}
	
	public String getORMID() {
		return getExchangeId();
	}
	
	public void setExchangeName(String value) {
		this.exchangeName = value;
	}
	
	public String getExchangeName() {
		return exchangeName;
	}
	
	private void setORM_Product(java.util.Set value) {
		this.ORM_product = value;
	}
	
	private java.util.Set getORM_Product() {
		return ORM_product;
	}
	
	public final ProductSetCollection product = new ProductSetCollection(this, _ormAdapter, ORMConstants.KEY_EXCHANGE_PRODUCT, ORMConstants.KEY_PRODUCT_EXCHANGE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getExchangeId());
	}
	
}
