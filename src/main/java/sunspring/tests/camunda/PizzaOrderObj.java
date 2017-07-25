package sunspring.tests.camunda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PizzaOrderObj {
	private OrderFormObj variables;
	private String businessKey;
	public OrderFormObj getVariables() {
		return variables;
	}
	public void setVariables(OrderFormObj variables) {
		this.variables = variables;
	}
	public String getBusinessKey() {
		return businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}
}
