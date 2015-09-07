package com.sartios.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayPlainTextHello() {

		return "Hello Jersey";
	}

	@GET
	@Path("person")
	@Produces(MediaType.APPLICATION_JSON)
	public Person sayHelloToPerson() {
		return new Person("Sartios", "Savramis", 25);
	}

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String sayHtmlHello(){ return
	 * "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" +
	 * "Hello Jersey" + "</body></h1>" + "</html> "; }
	 */
}
