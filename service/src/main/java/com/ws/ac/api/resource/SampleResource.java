package com.ws.ac.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.ac.api.util.SampleManager;

@Path("/sample")
@Consumes({ "application/json", "application/xml" })
@Produces({ "application/json", "application/xml" })
@Service
public class SampleResource {

	@Autowired
	private SampleManager sampleManager;

	@GET
	@Path("/data")
	public Response getData() {
		Response res = null;
		return res;
	}

	@GET
	@Path("/comp")
	public Response getCompany() {
		Response res = null;
		// Emp employee = sampleManager.createEmployee();
		// res = Response.ok(employee).build();
		// Webservice will enter data into the db
		sampleManager.createCompany();
		res = Response.ok().build();
		return res;
	}
}