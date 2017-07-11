package com.dugu.acc.dev.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import binding.dev.acc.dugu.Player;
import binding.dev.acc.dugu.PlayerList;

@Path("/playerservice")
public interface PlayerService {

	// Basic CRUD operations for Player Service

	@POST
	@Path("addplayer")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String createOrSaveNewPLayerInfo(Player playerType);

	@GET
	@Path("getplayer/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Player getPlayerInfo(@PathParam("id") int playerId);

	@DELETE
	@Path("deleteplayer/{id}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, })
	@Produces({ MediaType.APPLICATION_FORM_URLENCODED })
	public String deletePlayerInfo(@PathParam("id") int id);

	@GET
	@Path("getallplayer")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public PlayerList getAllPlayerInfo();
}
