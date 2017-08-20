package com.quickstart.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/employee")
public class EmployeeDetails {

	@GET
	@Path("query")
	public Response getMsg(@DefaultValue("Ankita") @QueryParam("name") String msg) {

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	@GET
	@Path("id/{id}")
	public Response getbyId(@DefaultValue("1") @PathParam("id") int id) {
		return Response.status(200).entity("Employee id is "+id).build();
	}	
}
