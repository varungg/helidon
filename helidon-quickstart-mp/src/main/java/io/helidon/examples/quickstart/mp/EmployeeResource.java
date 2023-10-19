package io.helidon.examples.quickstart.mp;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hr")
public class EmployeeResource {
	EmployeeRepository database= new EmployeeRepository();
	@Path("/employees")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Employee> getAllEmployees() {
		return database.getAllEmployees();
	}

}
