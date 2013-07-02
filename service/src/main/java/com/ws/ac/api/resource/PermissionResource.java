package com.ws.ac.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.ws.ac.api.model.SPermission;

@Path("/permissions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ MediaType.APPLICATION_JSON })
@Service
public class PermissionResource {
	@GET
	@Path("/{permissionId}")
	public void getPermissionById(@PathParam("permissionId") String permissionId) {
	}

	@POST
	@Path("/add")
	public SPermission add(SPermission sPermission) {
		return null;
	}

	@POST
	@Path("/update")
	public void update(SPermission sPermission) {
	}

	@POST
	@Path("/{permissionId}/delete")
	public void delete(@PathParam("permissionId") String permissionId) {
	}
}
