package sunspring.tests.camunda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderFormObj {
	
	private ValueObj pizza;
	private ValueObj customer;
	private ValueObj address;
	
	public ValueObj getPizza() {
		return pizza;
	}
	public void setPizza(ValueObj pizza) {
		this.pizza = pizza;
	}
	public ValueObj getCustomer() {
		return customer;
	}
	public void setCustomer(ValueObj customer) {
		this.customer = customer;
	}
	public ValueObj getAddress() {
		return address;
	}
	public void setAddress(ValueObj address) {
		this.address = address;
	}
}
