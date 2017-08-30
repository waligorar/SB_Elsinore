package com.sb.elsinore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nanohttpd.protocols.http.IHTTPSession;
import org.nanohttpd.protocols.http.NanoHTTPD;
import org.nanohttpd.protocols.http.response.Response;

import com.sb.recipe.RecipeList;
import com.sb.ui.HtmlBuilder;

public class BrewServer extends NanoHTTPD {
    private RecipeList recipes = new RecipeList();
    private HtmlBuilder hb = new HtmlBuilder();

    private static ArrayList<String> recipeList;

    private static Log log = LogFactory.getLog(BrewServer.class);

	public BrewServer(final int port) throws IOException {
		super(port);

		log.debug("init(port=" + port + ") Start");

		start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
		log.debug("init(port) End");
	}

	@Override
	public Response serve(IHTTPSession session) {
		log.debug("serve(): Begin");

		String msg = null;
		Map<String, String> parms = session.getParms();

		// If any button with 'Name" of 'kill' is pressed, the server is stopped.
		// Investigate using https://j2html.com/examples.html as replacement.
		if (parms.get("kill") != null) {
			log.debug("serve(): *-*-* Stop Server *-*-*");
			stop();
		} else {
			if (parms.get("recipe") != null) {
				hb.setsRecipe(parms.get("recipe"));
			}
			msg = hb.Execute(parms.get("submit"), recipes.GetRecipeList());
		}
		
		Response resp = Response.newFixedLengthResponse(msg);
		
		log.debug("serve(): End");

		return resp;
	}
	
}