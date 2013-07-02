package com.ws.ac.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.ws.ac.api.model.STenant;

@Path("/tenants")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
@Service
public class TenantResource {
	@GET
	@Path("/{tenantId}")
	public void getTenantById(@PathParam("tenantId") String tenantId) {
	}

	@POST
	@Path("/add")
	public STenant add(STenant sTenant) {
		return null;
	}

	@POST
	@Path("/update")
	public void update(STenant sTenant) {
	}

	@POST
	@Path("/{tenantId}/delete")
	public void delete(@PathParam("tenantId") String tenantId) {
	}
}
