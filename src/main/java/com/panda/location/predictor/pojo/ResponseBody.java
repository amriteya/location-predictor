package com.panda.location.predictor.pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBody {

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("longitude")
	private String longitude;

	@JsonProperty("locality")
	private Map<String, List<String>> locality;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Map<String, List<String>> getLocality() {
		return locality;
	}

	public void setLocality(Map<String, List<String>> locality) {
		this.locality = locality;
	}


}
