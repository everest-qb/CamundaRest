package sunspring.tests.camunda;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;

public class Run02 {
	public static Logger logger = Logger.getLogger(Run02.class.getName());
	public static void main(String[] args) {
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		client.register(new LoggingFeature(Run02.logger,Level.INFO,null,null));
		WebTarget webTarget = client.target("http://localhost:8080/engine-rest");
		WebTarget testTarget=webTarget.path("task/cf2c18cf-6606-11e7-bbc2-528320524153/delegate");
		/*Response response=testTarget.request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.entity("{\"userId\":\"john\"}", MediaType.APPLICATION_JSON_TYPE));
		response.readEntity(String.class);*/
		
		WebTarget taskTarget= webTarget.path("task/cf2c18cf-6606-11e7-bbc2-528320524153");
		taskTarget.request(MediaType.APPLICATION_JSON_TYPE).get();
		
	}

}
