package com.panda.location.predictor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.panda.location.predictor.logic.LocationFinderBI;
import com.panda.location.predictor.pojo.ResponseBody;


@RestController
@RequestMapping("/v0.1/api")
public class FinderController {

	private static final Logger log = LoggerFactory.getLogger(FinderController.class);
	
	@Autowired
	private LocationFinderBI locationFinderBI;

	@RequestMapping("/predict")
	public ResponseBody greeting(@RequestParam(value = "lon") String lon, @RequestParam(value = "lat") String lat) throws Exception{
		
		/**
		 * Queries the zomato API based on the 
		 */
		return locationFinderBI.deduceLocation(lon, lat);

	}
}
