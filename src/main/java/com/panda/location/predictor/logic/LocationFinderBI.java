package com.panda.location.predictor.logic;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.client.utils.URIBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.panda.location.predictor.pojo.ZomatoResponse;
import com.panda.location.predictor.controller.FinderController;
import com.panda.location.predictor.pojo.ResponseBody;

@Service
public class LocationFinderBI {
	
	private static final Logger log = LoggerFactory.getLogger(FinderController.class);
	
	private static final String SCHEME = "https";
	private static final String ZOMATO_HOST = "developers.zomato.com";
	private static final String BASE_API_PATH = "/api/v2.1";
	private static final String GEOCODE_PATH = "/geocode";

	public LocationFinderBI() {

	}

	public ResponseBody deduceLocation(String lon, String lat) throws Exception {

		URIBuilder uri = new URIBuilder();
		
		//https://developers.zomato.com/api/v2.1/geocode?lat=13.0827&lon=80.2707
		uri.setScheme(SCHEME).setHost(ZOMATO_HOST).setPath(BASE_API_PATH+GEOCODE_PATH)
				.addParameter("lat", lat).addParameter("lon", lon);


		log.info("Hitting API @ "+uri.toString());

		ResteasyClient client = new ResteasyClientBuilder().build();

		ResteasyWebTarget target = client.target(uri.toString());

		Response clientResponse = target.request(MediaType.APPLICATION_JSON)
				.header("user-key", System.getProperty("zomatoToken")).get();
		
		/**
		 * Response from Zomato API of Restaurants available based on the geo-code.
		 */
		ZomatoResponse zomatoResponse = new ObjectMapper().readValue(clientResponse.readEntity(String.class),
				ZomatoResponse.class);
		
		
		//Add your logic here
		
		
		/**
		 * Response entity to be provided by this application.
		 */
		ResponseBody response = new ResponseBody();
		
		return response;
	}
}
