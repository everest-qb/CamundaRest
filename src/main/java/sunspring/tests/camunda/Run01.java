package sunspring.tests.camunda;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Run01 {

	public static Logger logger = Logger.getLogger(Run01.class.getName());
	public static void main(String[] args) {
		
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		client.register(new LoggingFeature(Run01.logger,Level.INFO,null,null));
		//http://hrdev.sunspring.com.tw:8080/Test03-web/rest/test/test
		//http://localhost:8080/engine-rest
		/*WebTarget webTarget = client.target("http://localhost:8080/engine-rest");
		WebTarget testTarget=webTarget.path("test/test3").queryParam("id", "F022");
		Response response=testTarget.request().get();
		System.out.println(response.readEntity(String.class));*/
		
		ValueObj pizza=new ValueObj("pizza01","String");
		ValueObj customer=new ValueObj("xyzqb","String");
		ValueObj address=new ValueObj("123456","String");
		
		OrderFormObj form=new OrderFormObj();
		form.setAddress(address);
		form.setCustomer(customer);
		form.setPizza(pizza);
		
		PizzaOrderObj pobj=new PizzaOrderObj();
		pobj.setBusinessKey(null);
		pobj.setVariables(form);
		
		WebTarget webTarget = client.target("http://localhost:8080/engine-rest");
		WebTarget testTarget=webTarget.path("process-definition/key/orderPizza/submit-form");
		Response response=testTarget.request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(pobj, MediaType.APPLICATION_JSON_TYPE));
		response.readEntity(String.class);
	}

}
