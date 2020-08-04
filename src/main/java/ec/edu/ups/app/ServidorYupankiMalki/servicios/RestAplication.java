package ec.edu.ups.app.ServidorYupankiMalki.servicios;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition( servers = {
		   @Server(description = "Servidor Local",
				   url = "/ServidorYupankiMalki")		
			}		
)
@ApplicationPath("/rs")
public class RestAplication extends Application {
	

}
