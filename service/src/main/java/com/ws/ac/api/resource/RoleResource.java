package com.ws.ac.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.ws.ac.api.model.SRole;

@Path("/roles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
@Service
public class RoleResource {
	@GET
	@Path("/{roleId}")
	public void getRoleById(@PathParam("roleId") String roleId) {
	}

	@POST
	@Path("/add")
	public SRole add(SRole sRole) {
		return null;
	}

	@POST
	@Path("/update")
	public void update(SRole sRole) {
	}

	@POST
	@Path("/{roleId}/delete")
	public void delete(@PathParam("roleId") String roleId) {
	}
}
