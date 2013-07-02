package com.ws.ac.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.ws.ac.api.model.SUser;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
@Service
public class UserResource {
	@GET
	@Path("/{userId}")
	public void getUserById(@PathParam("userId") String userId) {
	}

	@POST
	@Path("/add")
	public SUser add(SUser sUser) {
		return null;
	}

	@POST
	@Path("/update")
	public void update(SUser sUser) {
	}

	@POST
	@Path("/{userId}/delete")
	public void delete(@PathParam("userId") String userId) {
	}
}
